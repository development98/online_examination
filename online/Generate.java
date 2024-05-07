import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.stream.Collectors;

class AddMCQ extends JPanel implements ActionListener {

    JTextField promptField;
    JButton addButton;
    String apiKey = "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"; // Replace with your OpenAI API key

    public AddMCQ() {
        // Initialize GUI components
        promptField = new JTextField(20);
        addButton = new JButton("Generate and Add MCQ");
        addButton.addActionListener(this);

        // Add components to the panel
        add(new JLabel("Prompt:"));
        add(promptField);
        add(addButton);
    }

    public void actionPerformed(ActionEvent e) {
        String prompt = promptField.getText();
        try {
            // Generate MCQ using OpenAI
            String mcq = generateMCQ(prompt);
            
            // Add MCQ to the database
            addToDatabase(prompt, mcq);
            
            JOptionPane.showMessageDialog(null, "MCQ added successfully");
        } catch(Exception ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
    }

    private String generateMCQ(String prompt) throws Exception {
        URL url = new URL("https://api.openai.com/v1/completions");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setRequestProperty("Authorization", "Bearer " + apiKey);
        connection.setDoOutput(true);

        String requestBody = "{\"prompt\": \"" + prompt + "\", \"max_tokens\": 100, \"temperature\": 0.7, \"top_p\": 1.0, \"n\": 1}";
        try (OutputStream outputStream = connection.getOutputStream()) {
            byte[] input = requestBody.getBytes("utf-8");
            outputStream.write(input, 0, input.length);
        }

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"))) {
            return reader.lines().collect(Collectors.joining("\n"));
        } finally {
            connection.disconnect();
        }
    }

    private void addToDatabase(String prompt, String mcq) throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database_name?useSSL=false & allowPublicKeyRetrieval=true","your_username","your_password");
            PreparedStatement pst = con.prepareStatement("INSERT INTO mcq_questions (prompt, mcq) VALUES (?, ?)");
            pst.setString(1, prompt);
            pst.setString(2, mcq);
            pst.executeUpdate();
            con.close();
        } catch (ClassNotFoundException | SQLException ex) {
            throw new SQLException("Failed to add MCQ to the database: " + ex.getMessage());
        }
    }
}

class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Add MCQ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);
        frame.setContentPane(new AddMCQ());
        frame.setVisible(true);
    }
}
