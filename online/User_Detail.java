import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

class User_Detail extends JPanel
{
	JLabel lb1,lb11,lb12,lb2,lb3,lb4,lb5,lb6,lb7,lb8,lb9,lb10;
	JTextField tx1,tx2,tx3,tx4,tx5,tx6,tx7,tx8,tx9,tx10;
	JButton b1,b2,b3;
	JComboBox cb1,cb2,cb3;
	ButtonGroup bgp;
	JRadioButton r1,r2,r3;
	JTextArea tx12;
	ImageIcon i,i2,i3;
	
	User_Detail()
	{
		setLayout(null);
		Font f1=new Font("", Font.ITALIC, 20);
		
		Font f2=new Font("", Font.BOLD, 30);
		lb1 = new JLabel("User Details");
		lb1.setBounds(590,20,300,30);
		lb1.setForeground(Color.black);
		lb1.setFont(f2);
		add(lb1);
		
		lb12 = new JLabel("REG NO. : ");
		lb12.setBounds(300,100,200,30);
		lb12.setForeground(Color.black);
		lb12.setForeground(Color.red);
		lb12.setFont(f1);
		add(lb12);
		tx1 = new JTextField(10);
		tx1.setForeground(Color.red);
		tx1.setBounds(400,100,100,25);
		tx1.setFont(f1);
		add(tx1);
		
		// lb11 = new JLabel("REG Date : ");
		// lb11.setBounds(850,100,200,30);
		// lb11.setForeground(Color.black);
		// lb11.setFont(f1);
		// add(lb11);
		
		lb3 = new JLabel("UserName");
		lb3.setBounds(300,150,300,30);
		lb3.setForeground(Color.black);
		lb3.setFont(f1);
		add(lb3);
		tx3 = new JTextField(20);
		tx3.setBounds(400,150,300,30);
		tx3.setFont(f1);
		add(tx3);
		
		lb2 = new JLabel("Password");
		lb2.setBounds(780,150,200,30);
		lb2.setForeground(Color.black);
		lb2.setFont(f1);
		add(lb2);
		tx2 = new JTextField(10);
		tx2.setBounds(900,150,300,30);
		tx2.setFont(f1);
		add(tx2);
		
		lb4 = new JLabel("Name");
		lb4.setBounds(300,200,300,30);
		lb4.setForeground(Color.black);
		lb4.setFont(f1);
		add(lb4);
		
		tx6 = new JTextField(20);
		tx6.setBounds(400,200,100,30);
		tx6.setFont(f1);
		add(tx6);
		tx4 = new JTextField(20);
		tx4.setBounds(520,200,100,30);
		tx4.setFont(f1);
		add(tx4);
		tx5 = new JTextField(20);
		tx5.setBounds(640,200,100,30);
		tx5.setFont(f1);
		add(tx5);
		
		lb5 = new JLabel("Mobile No.");
		lb5.setBounds(300,250,300,30);
		lb5.setForeground(Color.black);
		lb5.setFont(f1);
		add(lb5);
		tx7 = new JTextField(20);
		tx7.setBounds(400,250,200,30);
		tx7.setFont(f1);
		add(tx7);
		
		lb6 = new JLabel("Gender");
		lb6.setBounds(300,300,300,30);
		lb6.setForeground(Color.black);
		lb6.setFont(f1);
		add(lb6);
		
		bgp = new ButtonGroup();
		bgp.add(r1);
		bgp.add(r2);
		bgp.add(r3);
		
		r1 = new JRadioButton("MALE");
		r1.setSize(100,40);
		r1.setLocation(400,300);
		// r1.setForeground(Color.black);
		r1.setFont(f1);
		add(r1);
		r2 = new JRadioButton("FEMALE");
		r2.setSize(150,40);
		r2.setLocation(515,300);
		r2.setFont(f1);
		add(r2);
		r3 = new JRadioButton("OTHER");
		r3.setSize(100,40);
		r3.setLocation(680,300);
		r3.setFont(f1);
		add(r3);
		
		lb7 = new JLabel("Email");
		lb7.setBounds(300,350,300,30);
		lb7.setForeground(Color.black);
		lb7.setFont(f1);
		add(lb7);
		tx8 = new JTextField(20);
		tx8.setBounds(400,350,350,30);
		tx8.setFont(f1);
		add(tx8);
		
		lb8 = new JLabel("D.O.B");
		lb8.setBounds(300,400,300,30);
		lb8.setForeground(Color.black);
		lb8.setFont(f1);
		add(lb8);
		
		cb1 = new JComboBox();
		for(int j=1;j<=30;j++)
		{
			cb1.addItem(j);
		}
		cb1.setLocation(400,400);
		cb1.setSize(50,30);
		cb1.setFont(f1);
		add(cb1);
		
		String s[] = {"January","Febuary","March","April","May","June","July","August","September","Octocber","November","December"};
		cb2 = new JComboBox(s);
		cb2.setLocation(480,400);
		cb2.setSize(200,30);
		cb2.setFont(f1);
		add(cb2);
		
		cb3 = new JComboBox();
		for(int j=1990;j<=2050;j++)
		{
			cb3.addItem(j);
		}
		cb3.setLocation(700,400);
		cb3.setSize(100,30);
		cb3.setFont(f1);
		add(cb3);
		
		lb9 = new JLabel("Collage");
		lb9.setBounds(300,450,300,30);
		lb9.setForeground(Color.black);
		lb9.setFont(f1);
		add(lb9);
		tx9= new JTextField(20);
		tx9.setBounds(400,450,350,30);
		tx9.setFont(f1);
		add(tx9);
		
		lb10 = new JLabel("Address");
		lb10.setBounds(300,500,300,30);
		lb10.setForeground(Color.black);
		lb10.setFont(f1);
		add(lb10);
		tx12 = new JTextArea();
		tx12.setBounds(400,500,550,100);
		tx12.setFont(f1);
		add(tx12);
		
		SwingConstants sc=new SwingConstants(){};
		i = new ImageIcon("panel_but.png");
		b1=new JButton("Results",i);
		b1.setBounds(1050,550,220,200);	
		b1.setHorizontalTextPosition(sc.CENTER);
		b1.setForeground(Color.white);
		b1.setOpaque(false);
		b1.setFont(f1);
		b1.setContentAreaFilled(false);
		b1.setBorderPainted(false);
		// add(b1);
		
		b2=new JButton("Back",i);
		b2.setBounds(50,550,220,200);	
		b2.setHorizontalTextPosition(sc.CENTER);
		b2.setForeground(Color.white);
		b2.setOpaque(false);
		b2.setFont(f1);
		b2.setContentAreaFilled(false);
		b2.setBorderPainted(false);
		add(b2);
		
		// b3=new JButton("Show",i);
		// b3.setBounds(1050,350,220,200);	
		// b3.setHorizontalTextPosition(sc.CENTER);
		// b3.setForeground(Color.white);
		// b3.setOpaque(false);
		// b3.setFont(f1);
		// b3.setContentAreaFilled(false);
		// b3.setBorderPainted(false);
		// add(b3);
		
	}
	public void paintComponent(Graphics g1)
	{
		i2=new ImageIcon("menu_bg.jpg");
	    Image d1=i2.getImage();
		g1.drawImage(d1,0,0,this);
		
		// i3=new ImageIcon("userspge.png");
	    // Image d2=i3.getImage();
		// g1.drawImage(d2,550,80,this);
		
		// g1.drawRect(30,30,800,600);
	}
	
}