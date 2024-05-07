import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

class Courses extends JPanel
{
	JLabel lb1,lb2;
	JButton b1,b2;
	JComboBox cb1;
	ImageIcon i,i2,i3;
		
	Courses()
	{
		
		setLayout(null);
		
		Font f2=new Font("", Font.BOLD, 30);
		lb1 = new JLabel("Courses");
		lb1.setBounds(610,20,300,30);
		lb1.setForeground(Color.black);
		lb1.setFont(f2);
		add(lb1);
		
		Font f1=new Font("", Font.ITALIC, 20);
		lb2 = new JLabel("Available Courses");
		lb2.setBounds(500,350,300,30);
		lb2.setForeground(Color.black);
		lb2.setFont(f1);
		add(lb2);
		
		// String s[] = {"MatheMatics","Aptitude","Physics","Software Engineering","DBMS","OS"};
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