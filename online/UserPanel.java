import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;

class UserPanel extends JPanel
{
	JLabel l,l1,l2,l3,l4,l5,lname;
	JButton b1,b2,b3,b4,b5;
	ImageIcon i,i2;
	ImageIcon im1,im2,im3;
	JComboBox cb1;
	// Choice cb1;
	
	UserPanel()
	{
		setLayout(null);
		Font f1=new Font("", Font.BOLD, 15); 
		SwingConstants sc=new SwingConstants(){}; 
		
		l=new JLabel("Welcome"); 
		l.setBounds(480,0,500,150);
		l.setForeground (Color.black);
		l.setFont(new Font("Copperplate Gothic Bold", Font. BOLD, 40));
		add(l);
		
		lname=new JLabel(); 
		lname.setBounds(800,0,500,150);
		lname.setForeground (Color.black);
		lname.setFont(new Font("Copperplate Gothic Bold", Font. BOLD, 40));
		add(lname);
		
		l=new JLabel("Select Course"); 
		l.setBounds(220,235,500,350);
		l.setForeground (Color.black);
		l.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 25));
		add(l);
		
		l1=new JLabel("INSTRUCTIONS"); 
		l1.setBounds(520,320,500,350);
		l1.setForeground (Color.black);
		l1.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 20));
		add(l1);
		
		l2=new JLabel("1. There are total 5 questions each with 5 marks in this course."); 
		l2.setBounds(300,380,1000,350);
		l2.setForeground (Color.red);
		l2.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 20));
		add(l2);
		
		l3=new JLabel("2. Maximum time is 00:30:00."); 
		l3.setBounds(300,410,1000,350);
		l3.setForeground (Color.red);
		l3.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 20));
		add(l3);
		
		l4=new JLabel("3. There is no negative marking on any question."); 
		l4.setBounds(300,440,1000,350);
		l4.setForeground (Color.red);
		l4.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 20));
		add(l4);
		
		// l5=new JLabel("4. After timeup you will be automatically logged out."); 
		// l5.setBounds(300,420,1000,350);
		// l5.setForeground (Color.red);
		// l5.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 20));
		// add(l5);
		
		cb1 = new JComboBox();
		cb1.setLocation(450,380);
		cb1.setSize(200,50);
		cb1.setFont(f1);
		add(cb1);
		
		// cb1=new Choice();
		
		// cb1.setLocation(450,380);
		// cb1.setSize(200,50);
		// cb1.setFont(f1);
		// add(cb1);
		
	
		// cb1.setBounds(450,380,200,50);
		// cb1.setForeground(new Color(115,251,253));
		// cb1.setBackground(Color.white);
		
		i = new ImageIcon("panel_but.png");
		b1=new JButton("Edit Details",i);
		b1.setBounds(290,150,220,200);	
		b1.setHorizontalTextPosition(sc.CENTER);
		b1.setForeground(Color.white);
		b1.setOpaque(false);
		b1.setFont(f1);
		b1.setContentAreaFilled(false);
		b1.setBorderPainted(false);
		add(b1);
		
		
		// i2 = new ImageIcon("panel_but.png");
		b2=new JButton("Start",i);
		b2.setBounds(680,300,220,200);	
		b2.setHorizontalTextPosition(sc.CENTER);
		b2.setForeground(Color.white);
		b2.setOpaque(false);
		b2.setFont(f1);
		b2.setContentAreaFilled(false);
		b2.setBorderPainted(false);
		add(b2);
		
		// b3=new JButton("Add CR",i);
		// b3.setBounds(900,300,220,200);	
		// b3.setHorizontalTextPosition(sc.CENTER);
		// b3.setForeground(Color.white);
		// b3.setOpaque(false);
		// b3.setFont(f1);
		// b3.setContentAreaFilled(false);
		// b3.setBorderPainted(false);
		// add(b3);
		// b3.addActionListener(this);
		
		b4=new JButton("Logout",i);
		b4.setBounds(1100,150,220,200);	
		b4.setHorizontalTextPosition(sc.CENTER);
		b4.setForeground(Color.white);
		b4.setOpaque(false);
		b4.setFont(f1);
		b4.setContentAreaFilled(false);
		b4.setBorderPainted(false);
		add(b4);
		
		b5=new JButton("Results",i);
		b5.setBounds(700,150,220,200);		
		b5.setHorizontalTextPosition(sc.CENTER);
		b5.setForeground(Color.white);
		b5.setOpaque(false);
		b5.setFont(f1);
		b5.setContentAreaFilled(false);
		b5.setBorderPainted(false);
		add(b5);
		
	}
	public void paintComponent(Graphics g1)
	{
		i2=new ImageIcon("menu_bg.jpg");
	    Image d1=i2.getImage();
		g1.drawImage(d1,0,0,this);
		
		im1=new ImageIcon("edit detail icon.png");
	    Image d2=im1.getImage();
		g1.drawImage(d2,110,160,150,150,this);
		
		im2=new ImageIcon("respt.png");
	    Image d3=im2.getImage();
		g1.drawImage(d3,520,150,150,157,this);
		
		im3=new ImageIcon("lgout_btn.png");
	    Image d4=im3.getImage();
		g1.drawImage(d4,925,170,this);
	}
	
}