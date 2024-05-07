import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

class Verification extends JPanel implements ActionListener
{
	JLabel lb1,lb2;
	JButton b1,b2,b3,b4;
	JComboBox cb1;
	ImageIcon i,i2,i3;
		
	Verification()
	{
		
		setLayout(null);
		
		Font f2=new Font("", Font.BOLD, 30);
		lb1 = new JLabel("Verification");
		lb1.setBounds(610,20,300,30);
		lb1.setForeground(Color.black);
		lb1.setFont(f2);
		add(lb1);
		
		Font f1=new Font("", Font.ITALIC, 20);
		lb2 = new JLabel("Users for verification");
		lb2.setBounds(460,350,300,30);
		lb2.setForeground(Color.black);
		lb2.setFont(f1);
		add(lb2);
		
		// String s[] = {"Sameer","Deepak","Hariom","Sourabh","Abhishek","Palak"};
		cb1 = new JComboBox();
		cb1.setLocation(700,350);
		cb1.setSize(250,30);
		cb1.setFont(f1);
		add(cb1);
		
		SwingConstants sc=new SwingConstants(){};
		i = new ImageIcon("panel_but.png");
		b1=new JButton("SEARCH",i);
		b1.setBounds(1050,280,220,200);	
		b1.setHorizontalTextPosition(sc.CENTER);
		b1.setForeground(Color.white);
		b1.setOpaque(false);
		b1.setFont(f1);
		b1.setContentAreaFilled(false);
		b1.setBorderPainted(false);
		add(b1);
		b1.addActionListener(this);
		
		b2=new JButton("Back",i);
		b2.setBounds(30,485,220,200);	
		b2.setHorizontalTextPosition(sc.CENTER);
		b2.setForeground(Color.white);
		b2.setOpaque(false);
		b2.setFont(f1);
		b2.setContentAreaFilled(false);
		b2.setBorderPainted(false);
		add(b2);
		
		b3=new JButton("Verify",i);
		b3.setBounds(700,450,220,200);	
		b3.setHorizontalTextPosition(sc.CENTER);
		b3.setForeground(Color.white);
		b3.setOpaque(false);
		b3.setFont(f1);
		b3.setContentAreaFilled(false);
		b3.setBorderPainted(false);
		add(b3);
		
		b4=new JButton("Delete",i);
		b4.setBounds(430,450,220,200);	
		b4.setHorizontalTextPosition(sc.CENTER);
		b4.setForeground(Color.white);
		b4.setOpaque(false);
		b4.setFont(f1);
		b4.setContentAreaFilled(false);
		b4.setBorderPainted(false);
		add(b4);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == b1)
		{
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?useSSL=false&AllowPublicKeyRetrieval=true","root","root");
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("Select Username from userDetail");
				while(rs.next())
				{
					cb1.addItem(rs.getString(1));
				}
				con.close();
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}	
		}

	}
	public void paintComponent(Graphics g1)
	{
		i2=new ImageIcon("menu_bg.jpg");
	    Image d1=i2.getImage();
		g1.drawImage(d1,0,0,this);
		
		i3=new ImageIcon("courses_icon.png");
	    Image d2=i3.getImage();
		g1.drawImage(d2,550,80,this);
		
		// g1.drawRect(30,30,800,600);
	}
}