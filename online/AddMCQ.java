import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import ai.openai.api.OpenAI;
import ai.openai.api.requests.CompletionRequest;
import ai.openai.api.requests.EngineCompletionRequest;
import ai.openai.api.requests.EngineRequest;
import ai.openai.api.responses.CompletionResponse;
import ai.openai.api.responses.EngineResponse;
import ai.openai.api.responses.ListEnginesResponse;
import ai.openai.api.responses.AuthenticateResponse;
import java.util.List;

class AddMCQ extends JPanel implements ActionListener {

    JTextField promptField;
    JButton addButton;
    OpenAI openai;
    String apiKey = "your_openai_api_key"; // Replace with your OpenAI API key

    public AddMCQ() {
        // Initialize GUI components
        promptField = new JTextField(20);
        addButton = new JButton("Generate and Add MCQ");
        addButton.addActionListener(this);

        // Add components to the panel
        add(new JLabel("Prompt:"));
        add(promptField);
        add(addButton);

        // Initialize OpenAI client
        openai = new OpenAI(apiKey);
    }

    public void actionPerformed(ActionEvent e) {
        String prompt = promptField.getText();
        try {
            // Generate MCQ using OpenAI
            CompletionRequest completionRequest = new CompletionRequest.Builder()
                .prompt(prompt)
                .maxTokens(100)
                .temperature(0.7)
                .topP(1.0)
                .n(1)
                .build();
            
            CompletionResponse completionResponse = openai.createCompletion(completionRequest);

            // Extract MCQ from OpenAI response
            String mcq = completionResponse.getChoices().get(0).getText().trim();
            
            // Add MCQ to the database
            addToDatabase(prompt, mcq);
            
            JOptionPane.showMessageDialog(null, "MCQ added successfully");
        } catch(Exception ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
    }

    private void addToDatabase(String prompt, String mcq) throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database_name?useSSL=false&AllowPublicKeyRetrieval=true","your_username","your_password");
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

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Add MCQ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);
        frame.setContentPane(new AddMCQ());
        frame.setVisible(true);
    }
}
