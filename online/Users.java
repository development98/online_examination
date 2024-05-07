import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

class Users extends JPanel
{
	User_Detail udl = new User_Detail();
	JLabel lb1;
	JButton b1,b2;
	JComboBox cb1;
	ImageIcon i,i2,i3;
		
	Users()
	{
		
		setLayout(null);
		
		Font f2=new Font("", Font.BOLD, 30);
		lb1 = new JLabel("Users");
		lb1.setBounds(590,20,300,30);
		lb1.setForeground(Color.black);
		lb1.setFont(f2);
		add(lb1);
		
		Font f1=new Font("", Font.ITALIC, 20);
		lb1 = new JLabel("Available Users");
		lb1.setBounds(500,350,300,30);
		lb1.setForeground(Color.black);
		lb1.setFont(f1);
		add(lb1);
		
		// String s[] = {"Deepak","Hariom","Sourabh","Abhishek"};
		cb1 = new JComboBox();
		cb1.setLocation(700,350);
		cb1.setSize(300,35);
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
		// b1.addActionListener(this);
		
		b2=new JButton("Back",i);
		b2.setBounds(30,485,220,200);	
		b2.setHorizontalTextPosition(sc.CENTER);
		b2.setForeground(Color.white);
		b2.setOpaque(false);
		b2.setFont(f1);
		b2.setContentAreaFilled(false);
		b2.setBorderPainted(false);
		add(b2);
		
		// cb1.removeAllItems();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?useSSL=false&AllowPublicKeyRetrieval=true","root","root");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("Select Username from userDetail");
			while(rs.next())
			{
			cb1.addItem(rs.getString(1));
			// edt.view.tx2.setText(rs.getString(2));
			// edt.view.tx3.setText(rs.getString(3));
			// edt.view.tx4.setText(rs.getString(4));
			// edt.view.tx5.setText(rs.getString(5));
			// edt.view.tx6.setText(rs.getString(6));
			// edt.view.lb12.setText(rs.getString(7));
			}
			
			con.close();
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
		
	}
	public void paintComponent(Graphics g1)
	{
		i2=new ImageIcon("menu_bg.jpg");
	    Image d1=i2.getImage();
		g1.drawImage(d1,0,0,this);
		
		i3=new ImageIcon("userspge.png");
	    Image d2=i3.getImage();
		g1.drawImage(d2,550,80,this);
		
		// g1.drawRect(30,30,800,600);
	}
	public void actionPerformed(ActionEvent e)
	{
		
	}
	
}