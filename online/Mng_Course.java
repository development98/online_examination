import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class Mng_Course extends JPanel //implements ItemListener
{
	JLabel l;
	JButton b1,b2,b3,b4,b5;
	ImageIcon i,i2;
	ImageIcon im1,im2,im3;
	// JComboBox cb1;
	 Choice ch1;
	 String sc1;
	// DefaultComboBoxModel cbxd;

	Mng_Course()
	{
		setLayout(null);
		Font f1=new Font("", Font.BOLD, 15); 
		SwingConstants sc=new SwingConstants(){}; 
		
		l=new JLabel("MANAGE COURSES"); 
		l.setBounds(480,0,500,150);
		l.setForeground (Color.black);
		l.setFont(new Font("Copperplate Gothic Bold", Font. BOLD, 40));
		add(l);
		
		// cbxd = new DefaultComboBoxModel(cb1);
		// cbxd.setModel(cbxd);
		
		// cbxd = (DefaultComboBoxModel)combo.getModel();
		// cbxd.insertElementAt(cb1,0);
		
		b5=new JButton();
		b5.setHorizontalTextPosition(sc.CENTER);
		b5.setLocation(550,390);
		b5.setForeground(Color.white);
		b5.setOpaque(false);
		b5.setFont(f1);
		b5.setContentAreaFilled(false);
		b5.setBorderPainted(false);
		add(b5);
		
		ch1 = new Choice();
		ch1.setLocation(550,390);
		ch1.setSize(200,400);
		ch1.setFont(f1);
		add(ch1);
		
		
		i = new ImageIcon("panel_but.png");
		b1=new JButton("DELETE",i);
		b1.setBounds(350,400,220,200);	
		b1.setHorizontalTextPosition(sc.CENTER);
		b1.setForeground(Color.white);
		b1.setOpaque(false);
		b1.setFont(f1);
		b1.setContentAreaFilled(false);
		b1.setBorderPainted(false);
		add(b1);
		
		b2=new JButton("EDIT COURSE",i);
		b2.setBounds(750,400,220,200);	
		b2.setHorizontalTextPosition(sc.CENTER);
		b2.setForeground(Color.white);
		b2.setOpaque(false);
		b2.setFont(f1);
		b2.setContentAreaFilled(false);
		b2.setBorderPainted(false);
		add(b2);
		
		b3=new JButton("Back",i);
		b3.setBounds(50,550,220,200);	
		b3.setHorizontalTextPosition(sc.CENTER);
		b3.setForeground(Color.white);
		b3.setOpaque(false);
		b3.setFont(f1);
		b3.setContentAreaFilled(false);
		b3.setBorderPainted(false);
		add(b3);
		
		b4=new JButton("ADD COURSE",i);
		b4.setBounds(950,200,220,200);	
		b4.setHorizontalTextPosition(sc.CENTER);
		b4.setForeground(Color.white);
		b4.setOpaque(false);
		b4.setFont(f1);
		b4.setContentAreaFilled(false);
		b4.setBorderPainted(false);
		add(b4);
		
		
	}
	public void paintComponent(Graphics g1)
	{
		i2=new ImageIcon("menu_bg.jpg");
	    Image d1=i2.getImage();
		g1.drawImage(d1,0,0,this);
		
		im1=new ImageIcon("mg_crse2.png");
	    Image d2=im1.getImage();
		g1.drawImage(d2,550,140,200,200,this);
		
		// im2=new ImageIcon("res_2.png");
	    // Image d3=im2.getImage();
		// g1.drawImage(d3,500,200,this);
		
	}
	
}