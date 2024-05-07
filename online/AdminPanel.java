import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.*;
class AdminPanel extends JPanel implements ActionListener {
    JButton b1, b2, b3, b4, b5, b6, b7;
    ImageIcon im, i, i2;
    ImageIcon im1, im2, im3, im4, im5, im6, im7;
    JLabel l;
    String subject; // Variable to store the subject

    AdminPanel() {
        setLayout(null);
        Font f1 = new Font("", Font.BOLD, 15);
        SwingConstants sc = new SwingConstants() {};

        i2 = new ImageIcon("panel_but.png");
        b1 = new JButton("MANAGE COURSES", i2);
        b1.setBounds(250, 150, 220, 200);
        b1.setHorizontalTextPosition(sc.CENTER);
        b1.setForeground(Color.white);
        b1.setOpaque(false);
        b1.setFont(f1);
        b1.setContentAreaFilled(false);
        b1.setBorderPainted(false);
        add(b1);

        b2 = new JButton("COURSE RESULTS", i2);
        b2.setBounds(670, 150, 220, 200);
        b2.setHorizontalTextPosition(sc.CENTER);
        b2.setForeground(Color.white);
        b2.setOpaque(false);
        b2.setFont(f1);
        b2.setContentAreaFilled(false);
        b2.setBorderPainted(false);
        add(b2);

        b3 = new JButton("LOG OUT", i2);
        b3.setBounds(1100, 150, 220, 200);
        b3.setHorizontalTextPosition(sc.CENTER);
        b3.setForeground(Color.white);
        b3.setOpaque(false);
        b3.setFont(f1);
        b3.setContentAreaFilled(false);
        b3.setBorderPainted(false);
        add(b3);

        b4 = new JButton("USERS", i2);
        b4.setBounds(250, 340, 220, 200);
        b4.setHorizontalTextPosition(sc.CENTER);
        b4.setForeground(Color.white);
        b4.setOpaque(false);
        b4.setFont(f1);
        b4.setContentAreaFilled(false);
        b4.setBorderPainted(false);
        add(b4);

        b5 = new JButton("VERIFICATION", i2);
        b5.setBounds(670, 340, 220, 200);
        b5.setHorizontalTextPosition(sc.CENTER);
        b5.setForeground(Color.white);
        b5.setOpaque(false);
        b5.setFont(f1);
        b5.setContentAreaFilled(false);
        b5.setBorderPainted(false);
        add(b5);

        b6 = new JButton("CHANGE PASSWORD", i2);
        b6.setBounds(1100, 340, 220, 200);
        b6.setHorizontalTextPosition(sc.CENTER);
        b6.setForeground(Color.white);
        b6.setOpaque(false);
        b6.setFont(f1);
        b6.setContentAreaFilled(false);
        b6.setBorderPainted(false);
        add(b6);
        b6.addActionListener(this);

        b7 = new JButton("QUESTIONS", i2);
        b7.setBounds(250, 510, 220, 200);
        b7.setHorizontalTextPosition(sc.CENTER);
        b7.setForeground(Color.white);
        b7.setOpaque(false);
        b7.setFont(f1);
        b7.setContentAreaFilled(false);
        b7.setBorderPainted(false);
        add(b7);

        l = new JLabel("Admin Panel");
        l.setBounds(520, 25, 358, 50);
        l.setForeground(Color.black);
        l.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 40));
        add(l);

        // Add ActionListener to button 7 (b7)
        b7.addActionListener(this);
        b6.addActionListener(this); // Assuming this is already set up elsewhere in the code
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b7) {
            // Display AddMCQ dialog
            JFrame frame = new JFrame("Add MCQ");
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Close only this window
            frame.setSize(400, 150);
            frame.setContentPane(new AddMCQ());
            frame.setVisible(true);
        } else if (e.getSource() == b6) {
            String newPassword = JOptionPane.showInputDialog(null, "Enter New Password:", "Change Password", JOptionPane.INFORMATION_MESSAGE);
            if (newPassword != null) {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?useSSL=false&AllowPublicKeyRetrieval=true", "root", "root");
                    Statement st = con.createStatement();
                    st.executeUpdate("UPDATE admin SET upass='" + newPassword + "' WHERE uname='masterss55@gmail.com'");
                    JOptionPane.showMessageDialog(null, "Admin Password has been updated");
                    con.close();
                } catch (Exception ex) {
                    System.out.println(ex);
                    JOptionPane.showMessageDialog(null, "Error updating password: " + ex.getMessage());
                }
            }
        }
    }

    // Your paintComponent method here...
    public void paintComponent(Graphics g1) {
        i = new ImageIcon("menu_bg.jpg");
        Image d2 = i.getImage();
        g1.drawImage(d2, 0, 0, this);

        im1 = new ImageIcon("mng_course.png");
        Image d = im1.getImage();
        g1.drawImage(d, 150, 210, 100, 100, this);

        im2 = new ImageIcon("res_2.png");
        Image d1 = im2.getImage();
        g1.drawImage(d1, 550, 210, 100, 100, this);

        im3 = new ImageIcon("lgout_btn.png");
        Image d3 = im3.getImage();
        g1.drawImage(d3, 920, 200, 190, 120, this);

        im4 = new ImageIcon("users_icon3.png");
        Image d4 = im4.getImage();
        g1.drawImage(d4, 100, 400, this);

        im5 = new ImageIcon("Verify_Icon.png");
        Image d5 = im5.getImage();
        g1.drawImage(d5, 540, 380, 120, 120, this);

        im6 = new ImageIcon("pw_bg_2.png");
        Image d6 = im6.getImage();
        g1.drawImage(d6, 950, 370, 150, 150, this);

        im7 = new ImageIcon("questions.png");
        Image d7 = im7.getImage();
        g1.drawImage(d7, 150, 550, 100, 150, this);
    }

    class AddMCQ extends JPanel implements ActionListener {
        JTextField subjectField; // Field to input subject
        JTextField promptField;
        JButton addButton;
        String apiKey = "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"; // Replace with your OpenAI API key

        public AddMCQ() {
        setLayout(new GridLayout(0, 1)); // 1 column

        subjectField = new JTextField(20);
        promptField = new JTextField(20);
        addButton = new JButton("Generate and Add MCQ");
        addButton.addActionListener(this);

        JPanel subjectPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        subjectPanel.add(new JLabel("Subject:"));
        subjectPanel.add(subjectField);
        subjectPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Add margin to subject panel
        subjectField.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5)); // Add padding to subject field

        JPanel promptPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        promptPanel.add(new JLabel("Prompt:"));
        promptPanel.add(promptField);
        promptPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Add margin to prompt panel
        promptField.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5)); // Add padding to prompt field

        add(subjectPanel);
        add(promptPanel);

        // Create a panel for the button to add padding
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10)); // Add padding to button panel
        buttonPanel.add(addButton);
        add(buttonPanel);
    }
        public void actionPerformed(ActionEvent e) {
            subject = subjectField.getText(); // Get subject from the subject field
            String prompt = promptField.getText();
            try {
                String mcq = generateMCQ(prompt);
                String[] mcqData = parseMCQ(mcq);
                addToDatabase(subject, mcqData[0], mcqData[1], mcqData[2], mcqData[3], mcqData[4], mcqData[5]);
                JOptionPane.showMessageDialog(null, "Question added successfully");
            } catch (Exception ex) {
                System.out.println(ex);
                JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            }
        }

        private String generateMCQ(String prompt) throws IOException {
    StringBuilder sb = new StringBuilder();
    try {
        URL url = new URL("https://api.openai.com/v1/completions");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setRequestProperty("Authorization", "Bearer " + apiKey);
        connection.setDoOutput(true);

        // Construct the request body
        String requestBody = "{\"prompt\": \"" + prompt + "\", \"max_tokens\": 1024, \"temperature\": 0.7, \"n\": 1, \"model\": \"gpt-3.5-turbo-instruct\"}";
        try (OutputStream outputStream = connection.getOutputStream()) {
            byte[] input = requestBody.getBytes(StandardCharsets.UTF_8);
            outputStream.write(input, 0, input.length);
        }

        // Check the HTTP response code
        int responseCode = connection.getResponseCode();
        if (responseCode != HttpURLConnection.HTTP_OK) {
            throw new IOException("Error making API request: HTTP error code: " + responseCode);
        }

        // Read the response
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8))) {
            String line;
            boolean foundMCQ = false;
            while ((line = reader.readLine()) != null) {
                if (line.contains("\"text\":") && !foundMCQ) {
                    String mcqAnswer = line.substring(line.indexOf("\"text\":") + 8, line.lastIndexOf("\"")).trim();
                    //mcqAnswer = mcqAnswer.replaceFirst("^\\s*\\n+", ""); // Remove leading whitespace and newline
                    //mcqAnswer = mcqAnswer.replaceAll("\\n{2,}", "\n"); // Replace consecutive newlines with single newline
                   // mcqAnswer = mcqAnswer.replaceAll("\n\n", "\n"); // Replace two consecutive newlines with single newline
                   // System.out.println(mcqAnswer); // Print the MCQ string
                    sb.append(mcqAnswer);
                    foundMCQ = true;
                }
            }
            // If MCQ answer is not found, append an error message
            if (!foundMCQ) {
                throw new IllegalArgumentException("MCQ format is invalid. Correct answer not found");
            }
        }
    } catch (IOException ex) {
        throw new IOException("Error making API request: " + ex.getMessage(), ex);
    }

    return sb.toString();
}


//generate one mcq question on html with correct answer


private String[] parseMCQ(String mcq) {
    // Define the regex pattern to capture the question and options
    System.out.println(mcq);
    Pattern pattern = Pattern.compile("(?i)Question:\\s*(.*?)\\s*(?:[a-d][.)])\\s*(.*?)\\s*(?:[a-d][.)])\\s*(.*?)\\s*(?:[a-d][.)])\\s*(.*?)\\s*(?:[a-d][.)])\\s*(.*?)\\s*(Correct answer|Answer):?\\s*(.*?)\\s*");


    // Create a Matcher object to apply the pattern to the MCQ string
    Matcher matcher = pattern.matcher(mcq);

    // Check if the pattern matches the MCQ string
    if (!matcher.find()) {
        throw new IllegalArgumentException("MCQ format is invalid. Question or options not found.");
    }

    // Extract the question and options from the matched groups
    String question = matcher.group(1).replaceAll("\n\n", " ").trim();
	String question1=remove(question);	
    String optionA = matcher.group(2).replaceAll("\\n", " ").trim();
	String option=remove(optionA);
    String optionB = matcher.group(3).replaceAll("\n", " ").trim();
    String optionC = matcher.group(4).replaceAll("\n", " ").trim();
    String optionD = matcher.group(5).replaceAll("\n", " ").trim();
    String correctOption = matcher.group(6) != null ? matcher.group(6).trim() : "";

    // Extract additional text after the correct answer
    String coption = extractAdditionalText(mcq.substring(matcher.end()));

    // Determine the option based on additional text
    String additionalOption = getOptionFromAdditionalText(coption);

    // Print the extracted components for debugging
    System.out.println("Question: " + question);
    System.out.println("Option A: " + optionA);
    System.out.println("Option B: " + optionB);
    System.out.println("Option C: " + optionC);
    System.out.println("Option D: " + optionD);
    System.out.println("Correct Option: " + correctOption);
    System.out.println("Coption: " + coption);
    System.out.println("Additional Option: " + additionalOption);
    System.out.println("edited string" + question1);
    // Return the question, options, and correct answer as an array
    return new String[]{question1, option, optionB, optionC, optionD, additionalOption};
}

private String remove(String text) {
    String s="";
	for(int i=0;i<text.length();i++)
	{
		if(text.charAt(i)=='\n')
			break;
		else
			s+=text.charAt(i);
	}
	System.out.println(s);
	return s;
}



// Method to extract additional text after the correct answer
private String extractAdditionalText(String text) {
    StringBuilder additionalText = new StringBuilder();
    for (int i = text.length() - 1; i >= 0; i--) {
        additionalText.insert(0, text.charAt(i));
        if (i > 0 && text.charAt(i) == '\n' && text.charAt(i - 1) == '\n') {
            break;
        }
    }
    return additionalText.toString().trim();
}

// Method to determine the option based on additional text
private String getOptionFromAdditionalText(String coption) {
    char firstChar = coption.charAt(0);
    switch (Character.toLowerCase(firstChar)) {
        case 'a':
            return "Option A";
        case 'b':
            return "Option B";
        case 'c':
            return "Option C";
        case 'd':
            return "Option D";
        default:
            return "";
    }
}



        private void addToDatabase(String subject, String question, String optionA, String optionB, String optionC, String optionD, String correctOption) throws SQLException {
            Connection con = null;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?useSSL=false&AllowPublicKeyRetrieval=true", "root", "root");
                // Check if the table exists for the subject, if not, create it
                createTableIfNotExists(con, subject);

                // Insert values into the subject's table
                PreparedStatement pst = con.prepareStatement("INSERT INTO " + subject + " (QStatement, A, B, C, D, COption) VALUES (?, ?, ?, ?, ?, ?)");
                pst.setString(1, question);
                pst.setString(2, optionA);
                pst.setString(3, optionB);
                pst.setString(4, optionC);
                pst.setString(5, optionD);
                pst.setString(6, correctOption);
                pst.executeUpdate();
            } catch (ClassNotFoundException | SQLException ex) {
                throw new SQLException("Failed to add question to the database: " + ex.getMessage());
            } finally {
                if (con != null) {
                    con.close();
                }
            }
        }
    }

   private void createTableIfNotExists(Connection con, String subject) throws SQLException {
    try {
        // Check if the subject already exists in the course table
        String checkSubjectQuery = "SELECT COUNT(*) AS count FROM course WHERE subject = ?";
        try (PreparedStatement checkSubjectPst = con.prepareStatement(checkSubjectQuery)) {
            checkSubjectPst.setString(1, subject);
            try (ResultSet rs = checkSubjectPst.executeQuery()) {
                if (rs.next() && rs.getInt("count") == 0) {
                    // Subject does not exist, so insert it into the course table
                    String insertSubjectQuery = "INSERT INTO course (subject) VALUES (?)";
                    try (PreparedStatement insertSubjectPst = con.prepareStatement(insertSubjectQuery)) {
                        insertSubjectPst.setString(1, subject);
                        insertSubjectPst.executeUpdate();
                    }
                    
                    // Create the table for the subject
                    String createTableQuery = "CREATE TABLE " + subject + " (QID INT AUTO_INCREMENT PRIMARY KEY, QStatement VARCHAR(255), A VARCHAR(255), B VARCHAR(255), C VARCHAR(255), D VARCHAR(255), COption VARCHAR(255))";
                    try (PreparedStatement createTablePst = con.prepareStatement(createTableQuery)) {
                        createTablePst.executeUpdate();
                    }
                }
            }
        }
    } catch (SQLException ex) {
        throw new SQLException("Failed to create table for subject: " + subject + " - " + ex.getMessage());
    }
}


}
