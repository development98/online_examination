import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

class ChangePwd extends JPanel implements ActionListener
{
	// String s1 = JOptionPane.showInputDialog(null,"ChangePwd","Change Password",JOptionPane.INFORMATION_MESSAGE);
	
	public void actionPerformed(ActionEvent e)
	{
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?useSSL=false&AllowPublicKeyRetrieval=true","root","root");
			Statement st = con.createStatement();
			st.executeUpdate("update admin set upass='"+s1+"' where uname='admin'");
			JOptionPane.showMessageDialog(null,"Admin Password has been updated");
			con.close();
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
	}
	
}