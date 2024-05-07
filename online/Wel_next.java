import javax.swing.*;
import java.awt.*;

class Wel_next extends JPanel
{
	JButton b1,b2;
	ImageIcon i,i2,i3,i4;
	// ImageIcon i1=new ImageIcon("admin_icon2.png");
	// ImageIcon i2=new ImageIcon("depositphotos_2.png");
	
	Wel_next()
	{
		setLayout(null);
		Font f1=new Font("", Font.BOLD, 20); 
		// b1 = new JButton(i1);
		// b1.setSize(280,200);
		// b1.setBorderPainted(false);
		// b1.setContentAreaFilled(false);
		// b1.setOpaque(false);
		// b1.setLocation(550,120);
		// add(b1);
		
		// b2 = new JButton(i2);
		// b2.setSize(280,200);
		// b2.setBorderPainted(false);
		// b2.setContentAreaFilled(false);
		// b2.setOpaque(false);
		// b2.setLocation(550,450);
		// add(b2);
		i=new ImageIcon("panel_but.png");
		
		SwingConstants sc=new SwingConstants(){};
		b1=new JButton("ADMIN",i);
		b1.setBounds(120,420,520,250);	
		b1.setHorizontalTextPosition(sc.CENTER);
		b1.setForeground(Color.white);
		b1.setOpaque(false);
		b1.setContentAreaFilled(false);
		b1.setBorderPainted(false);
		b1.setFont(f1);
		add(b1);
		
		b2=new JButton("USER",i);
		b2.setBounds(580,420,520,250);	 
		b2.setHorizontalTextPosition(sc.CENTER);
		b2.setForeground(Color.white);
		b2.setOpaque(false);
		b2.setContentAreaFilled(false);
		b2.setBorderPainted(false);
		b2.setFont(f1);
		add(b2);
		
	}
	// public void paintComponent(Graphics g1)
	// {
		// super.paintComponent(g1);
		
		/*	 Draw the rectangles		*/
		// g1.setColor(Color.WHITE);
		// g1.drawRect(250, 150, 350, 400); // Rectangle for admin icons
		// g1.drawRect(710, 150, 350, 400); // Rectangle for user icons
		
		/*	 Draw the background image		*/
		// i2=new ImageIcon("menu_bg.jpg");
		// Image d1=i2.getImage();
		// g1.drawImage(d1,0,0,this);
		
		/*	 Draw the icons		*/
		// i3=new ImageIcon("admin_icon2.png");
		// Image d3=i3.getImage();
		// g1.drawImage(d3,300,200,this);
		
		// i4=new ImageIcon("depositphotos_2.png");
		// Image d2=i4.getImage();
		// g1.drawImage(d2,750,180,this);
	// }
	public void paintComponent(Graphics g1)
	{
		
	    	
		i2=new ImageIcon("menu_bg.jpg");
	    Image d1=i2.getImage();
		g1.drawImage(d1,0,0,this);
		
		i3=new ImageIcon("admin_icon2.png");
	    Image d3=i3.getImage();
		g1.drawImage(d3,300,200,this);
		g1.drawRect(200,100,450,520);
		
		i4=new ImageIcon("depositphotos_2.png");
	    Image d2=i4.getImage();
		g1.drawImage(d2,750,180,this);
		g1.drawRect(600,100,450,520);
	   
	
	}
		
		// Font f=new Font("", Font.BOLD, 25); 
		// ImageIcon im=new ImageIcon("swing button.png");
		// SwingConstants sc=new SwingConstants(){}; 
		// String s[]={"<html><body>Back</body></html)","<html><body>Next</body></html)"};
		// int x=250,y=350,w=200,h=93;
		// int k=0;
		// for(int i=0;i<1;i++)
		// {
		// for (int j=0;j<2;j++)
		// {
		// b[k]=new JButton(s[k],im);
		// b[k].setBounds(x,y,w,h);
		// b[k].setHorizontalTextPosition(sc.CENTER);
		// b[k].setContentAreaFilled (false);
		// b[k].setBorderPainted(false);
		// b[k].setFont(f);
		// add(b[k]);

		// x=x+500;
		// k++;
		// }
		// x=250;
		// y=y+300;
		// }
		
}
