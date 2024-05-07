import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

class Add_Course extends JPanel // implements ActionListener
{
	JLabel lb1,lb2,lb3,lb4,lb5;
	JTextField tx1,tx2,tx3,tx4,tx5;
	JButton b1,b2,b3;
	JComboBox cb1;
	ImageIcon i,i2,i3;
		
	Add_Course()
	{
		
		setLayout(null);
		
		Font f2=new Font("", Font.BOLD, 30);
		lb1 = new JLabel("ADD COURSE");
		lb1.setBounds(550,20,300,30);
		lb1.setForeground(Color.black);
		lb1.setFont(f2);
		add(lb1);
		
		Font f1=new Font("", Font.ITALIC, 20);
		lb1 = new JLabel("Course Name");
		lb1.setBounds(500,220,300,30);
		lb1.setForeground(Color.white);
		lb1.setFont(f1);
		add(lb1);
		
		tx1 = new JTextField(20);
		tx1.setBounds(700,220,200,35);
		tx1.setFont(f1);
		add(tx1);
		
		lb2 = new JLabel("Time");
		lb2.setBounds(500,300,300,30);
		lb2.setForeground(Color.white);
		lb2.setFont(f1);
		add(lb2);
		tx2 = new JTextField(10);
		tx2.setBounds(600,300,50,30);
		tx2.setFont(f1);
		add(tx2);
		
		tx3 = new JTextField(10);
		tx3.setBounds(700,300,50,30);
		tx3.setFont(f1);
		add(tx3);
		
		tx4 = new JTextField(10);
		tx4.setBounds(800,300,50,30);
		tx4.setFont(f1);
		add(tx4);
		
		lb3 = new JLabel("Each Mark");
		lb3.setBounds(500,400,300,30);
		lb3.setForeground(Color.white);
		lb3.setFont(f1);
		add(lb3);
		
		cb1 = new JComboBox();
		for(int j=1;j<=10;j++)
		{
			cb1.addItem(j);
		}
		cb1.setLocation(700,400);
		cb1.setSize(200,30);
		cb1.setFont(f1);
		add(cb1);
		
		SwingConstants sc=new SwingConstants(){};
		i = new ImageIcon("panel_but.png");
		b1=new JButton("ADD COURSE",i);
		b1.setBounds(550,400,220,200);	
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
		
	}
	// public void actionPerformed(ActionEvent e)
	// {
			// String s7 = tx1.getText();
			// String s8 = tx2.getText();
			// String s9 = tx3.getText();
			// String s10 = tx4.getText();
			// String s11 = cb1.getSelectedItem().toString();
			
			// try
			// {
				// Class.forName("com.mysql.cj.jdbc.Driver");
				// Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?useSSL=false","root","Root");
				// Statement st = con.createStatement();
				// st.executeUpdate("insert into addcrse values('"+s7+"', '"+s8+"', '"+s9+"', '"+s10+"', '"+s11+"')");
				// JOptionPane.showMessageDialog(null,"Course added");
				// tx1.setText("");
				// tx2.setText("");
				// tx3.setText("");
				// tx4.setText("");
				// cb1.setSelectedItem("1");
				// con.close();
			// }
			// catch(Exception e1)
			// {
				// System.out.println(e1);
			// }
	// }
	
	public void paintComponent(Graphics g1)
	{
		i2=new ImageIcon("menu_bg.jpg");
	    Image d1=i2.getImage();
		g1.drawImage(d1,0,0,this);
		
		i3=new ImageIcon("add course.png");
	    Image d2=i3.getImage();
		g1.drawImage(d2,600,80,this);
		
		// g1.drawRect(30,30,800,600);
	}
	
}