import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Welcome extends JPanel
{
	JButton b1,b2;
	JLabel lb1;
	ImageIcon i;
	// ImageIcon i1=new ImageIcon("im1.png");
	// ImageIcon i2=new ImageIcon("im2.png");
	
	Welcome()
	{
		setLayout(null);
		Font f1=new Font("", Font.BOLD, 15); 
		SwingConstants sc=new SwingConstants(){}; 
		
		// lb1 = new JLabel("ONLINE EXAMINATION SYSTEM")
		// {
				// @Override
				// public void paintComponent(Graphics g) {
				// Graphics2D g2d = (Graphics2D) g;
				// g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
									 // RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
				// Font font = getFont().deriveFont(Font.BOLD, 50f);
				// g2d.setFont(font);
				// g2d.setColor(Color.WHITE);
				// FontMetrics fontMetrics = g2d.getFontMetrics();
				// int stringWidth = fontMetrics.stringWidth(getText());
				// int startX = (getWidth() - stringWidth) / 2;
				// int startY = ((getHeight() - fontMetrics.getHeight()) / 2) + fontMetrics.getAscent();
				// g2d.drawString(getText(), startX, startY);
				// g2d.drawLine(startX, startY + 3, startX + stringWidth, startY + 3);
			// }
		// };
		
		// lb1.setSize(500,400);
		// lb1.setFont(new Font("Calibri",Font.BOLD,50));
		// lb1.setForeground(Color.WHITE);
		// lb1.setBounds(375,170,800,200);
		// add(lb1);
		
		i = new ImageIcon("panel_but.png");
		b1=new JButton("Next",i);
		b1.setBounds(1100,550,220,200);	
		b1.setHorizontalTextPosition(sc.CENTER);
		b1.setForeground(Color.white);
		b1.setOpaque(false);
		b1.setFont(f1);
		b1.setContentAreaFilled(false);
		b1.setBorderPainted(false);
		add(b1);
		
		b2=new JButton("Help",i);
		b2.setBounds(50,550,220,200);	
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
		i=new ImageIcon("Online project_3.jpg");
	    Image d=i.getImage();
		g1.drawImage(d,0,0,this);
	
	}
}
