import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class User extends JPanel
{
	JLabel lb1;
	JTextField tx1;
	JPasswordField tx2;
	JButton b1,b2,b3,b4;
	ImageIcon i,i1,i2;
	ImageIcon i3=new ImageIcon("lg_button2.png");
	
	User()
	{
		setLayout(null);
		SwingConstants sc = new SwingConstants(){};
		Font f2=new Font("Arial Rounded MT", Font.BOLD, 25);
		lb1 = new JLabel("New User:");
		lb1.setBounds(580,620,200,30);
		lb1.setForeground(Color.black);
		lb1.setFont(f2);
		add(lb1);
		
		Font f1=new Font("", Font.BOLD, 15);
		tx1 = new JTextField("Enter Username",20);
		tx1.setBackground(Color.WHITE);
		// tx1.setText("Enter username: ");
		tx1.setForeground(Color.black);
		tx1.setBounds(550,300,250,50);
		add(tx1);
		
		// lb2 = new JLabel("Enter Password");
		// lb2.setBounds(350,150,100,30);
		// add(lb2);
		
		tx2 = new JPasswordField("Enter Password",20);
		tx2.setBackground(Color.WHITE);
		// tx2.setText("Enter password: ");
		tx2.setForeground(Color.black);
		tx2.setBounds(550,395,250,50);
		add(tx2);
		
		b1 = new JButton(i3);
		b1.setSize(239,70);
		b1.setBorderPainted(false);
		b1.setContentAreaFilled(false);
		b1.setOpaque(false);
		b1.setLocation(540,500);
		add(b1);
		
		i = new ImageIcon("panel_but.png");
		// b2=new JButton("Forget Password",i);
		// b2.setBounds(850,440,220,200);	
		// b2.setHorizontalTextPosition(sc.CENTER);
		// b2.setForeground(Color.white);
		// b2.setOpaque(false);
		// b2.setFont(f1);
		// b2.setContentAreaFilled(false);
		// b2.setBorderPainted(false);
		// add(b2);
		
		b3=new JButton("Back",i);
		b3.setBounds(50,550,220,200);	
		b3.setHorizontalTextPosition(sc.CENTER);
		b3.setForeground(Color.white);
		b3.setOpaque(false);
		b3.setFont(f1);
		b3.setContentAreaFilled(false);
		b3.setBorderPainted(false);
		add(b3);
		
		b4=new JButton("REGISTER",i);
		b4.setBounds(700,540,220,200);	
		b4.setHorizontalTextPosition(sc.CENTER);
		b4.setForeground(Color.white);
		b4.setOpaque(false);
		b4.setFont(f1);
		b4.setContentAreaFilled(false);
		b4.setBorderPainted(false);
		add(b4);
		
		
		tx1.addFocusListener(new FocusListener()
		{

		public void focusGained(FocusEvent e) 
		{
			if (tx1.getText().equals("Enter Username"))
			{
				tx1.setText("");
				tx1.setForeground(Color.BLACK);
			}
		}
	
		public void focusLost(FocusEvent e)
		{
			if (tx1.getText().isEmpty()) 
			{
				tx1.setForeground(Color.BLACK);
				tx1.setText("Enter Username");
			}
		}
		});
		
		tx2.addFocusListener(new FocusListener()
		{

		public void focusGained(FocusEvent e) 
		{
			if (tx2.getText().equals("Enter Password"))
			{
				tx2.setText("");
				tx2.setForeground(Color.BLACK);
			}
		}
	
		public void focusLost(FocusEvent e)
		{
			if (tx2.getText().isEmpty()) 
			{
				tx2.setForeground(Color.BLACK);
				tx2.setText("Enter Password");
			}
		}
		});
		
	
		
	}
	public void paintComponent(Graphics g1)
	{
		i1=new ImageIcon("istockphoto blue_bg2.jpg");
	    Image d=i1.getImage();
		g1.drawImage(d,0,0,this);
		
		i2=new ImageIcon("login_icon.jpg");
	    Image d1=i2.getImage();
		g1.drawImage(d1,580,80,150,150,this);
	
	}
	
}