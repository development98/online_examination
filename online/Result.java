import java.awt.*;
import javax.swing.*;

class Result extends JPanel
{
	JLabel  l,l1,l2,l3,l4,l5,l6,l7;
	JLabel t1,t2,t3,t4,t5,t6,t7;
	JButton b1;
	// ImageIcon img,img2;
	// Image  on,on2;
	
	ImageIcon i,i2;
	
	
	Result()
	{
		Font f=new Font("",5,25);
		Font f1=new Font("",5,15);
		Font f2=new Font("Courier New",Font.BOLD,35);
		setLayout(null); 
		
		
		// img=new ImageIcon("user.JPEG");
		// on=img.getImage();
			
		 
		// img2=new ImageIcon("result1.PNG");
		// on2=img2.getImage();

			l=new JLabel("TEST RESULT");
			l.setFont(f2);
			// l.setForeground(new Color(115,251,253));
			// l.setForeground(new Color(64, 224, 208));
			l.setForeground(Color.black);
			l.setBackground(Color.black);
			l.setBounds(530,20,500,40);
			add(l);
			
			l1=new JLabel("Course name :");
			l1.setFont(f);
			l1.setForeground(Color.black);
			l1.setBackground(Color.black);
			l1.setBounds(300,100,600,40);
			add(l1);
			
			
			t1=new JLabel("");
			t1.setFont(f);
			t1.setForeground(new Color(75, 0, 130));
		   // t1.setBackground(Color.black);
			t1.setBounds(770,100,300,40);
			add(t1);
			
			
			l2=new JLabel("Total Question :");
			l2.setFont(f);
			l2.setForeground(Color.black);
			l2.setBackground(Color.black);
			l2.setBounds(300,170,400,40);
			add(l2);
			
				
			t2=new JLabel("");
			t2.setFont(f);
			t2.setForeground(new Color(75, 0, 130));
			//t2.setBackground(Color.black);
			t2.setBounds(770,170,50,40);
			add(t2);
			
			
			l3=new JLabel("Attempted Question :");
			l3.setFont(f);
			l3.setForeground(Color.black);
			l3.setBackground(Color.black);
			l3.setBounds(300,240,300,40);
			add(l3);
			
					
			t3=new JLabel("");
			t3.setFont(f);
			t3.setForeground(new Color(75, 0, 130));
		   // t3.setBackground(Color.black);
			t3.setBounds(770,240,50,40);
			add(t3);
			
			
			l4=new JLabel("Correct Question :");
			l4.setFont(f);
			l4.setForeground(Color.black);
			l4.setBackground(Color.black);
			l4.setBounds(300,310,300,40);
			add(l4);
			
					
			t4=new JLabel("");
			t4.setFont(f);
			t4.setForeground(new Color(75, 0, 130));
		   // t4.setBackground(Color.black);
			t4.setBounds(770,310,50,40);
			add(t4);
			
			
			l5=new JLabel("Wrong :");
			l5.setFont(f);
			l5.setForeground(Color.black);
			l5.setBackground(Color.black);
			l5.setBounds(300,380,300,40);
			add(l5);
			
					
			t5=new JLabel("");
			t5.setFont(f);
			t5.setForeground(new Color(75, 0, 130));
		   // t5.setBackground(Color.black);
			t5.setBounds(770,380,50,40);
			add(t5);
			
			
			l6=new JLabel("Marks Obtained:");
			l6.setFont(f);
			l6.setForeground(Color.black);
			l6.setBackground(Color.black);
			l6.setBounds(300,450,300,40);
			add(l6);
			
					
			t6=new JLabel("");
			t6.setFont(f);
			t6.setForeground(new Color(75, 0, 130));
		   // t6.setBackground(Color.black);
			t6.setBounds(770,450,50,40);
			add(t6);
			
			l7=new JLabel("Total Marks :");
			l7.setFont(f);
			l7.setForeground(Color.black);
			l7.setBackground(Color.black);
			l7.setBounds(300,520,400,40);
			add(l7);
			
				
			t7=new JLabel("");
			t7.setFont(f);
			t7.setForeground(new Color(75, 0, 130));
		  //  t7.setBackground(Color.black);
			t7.setBounds(770,520,50,40);
			add(t7);
			
			// b1=new JButton("EXIT");
			// b1.setFont(f1);
			// b1.setForeground(Color.black);
			// b1.setBackground(Color.black);
			// b1.setBounds(750,550,100,50);
			// add(b1);
			
			SwingConstants sc=new SwingConstants(){}; 
			i = new ImageIcon("panel_but.png");
			b1=new JButton("EXIT",i);
			b1.setBounds(540,530,220,200);	
			b1.setHorizontalTextPosition(sc.CENTER);
			b1.setForeground(Color.white);
			b1.setOpaque(false);
			b1.setFont(f1);
			b1.setContentAreaFilled(false);
			b1.setBorderPainted(false);
			add(b1);
			
	}
	public void paintComponent(Graphics g1)
	{
		i2=new ImageIcon("menu_bg.jpg");
	    Image d1=i2.getImage();
		g1.drawImage(d1,0,0,this);
		
		// im1=new ImageIcon("mg_crse2.png");
	    // Image d2=im1.getImage();
		// g1.drawImage(d2,550,120,this);
		
		// im2=new ImageIcon("res_2.png");
	    // Image d3=im2.getImage();
		// g1.drawImage(d3,500,300,this);
		
	}

}