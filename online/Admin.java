import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Admin extends JPanel
{
	JLabel lb1,lb2;
	JTextField tx1;
	JPasswordField tx2;
	JButton b1,b3;
	ImageIcon i,i1,i2;
	ImageIcon i3=new ImageIcon("lg_button2.png");
	
	Admin()
	{
		setLayout(null);
		SwingConstants sc = new SwingConstants(){};
		Font f1=new Font("", Font.BOLD, 15); 
		
		tx1 = new JTextField("Enter Username");
		tx1.setBackground(Color.white);
		// tx1.setText("Enter username: ");
		tx1.setForeground(Color.black);
		tx1.setBounds(550,350,250,50);
		add(tx1);
		
		tx2 = new JPasswordField("Enter Password");
		tx2.setBackground(Color.white);
		tx2.setForeground(Color.black);
		tx2.setBounds(550,425,250,50);
		add(tx2);
		
		b1 = new JButton(i3);
		b1.setSize(239,70);
		b1.setBorderPainted(false);
		b1.setContentAreaFilled(false);
		b1.setOpaque(false);
		b1.setLocation(550,520);
		add(b1);
		
		i = new ImageIcon("panel_but.png");
		b3=new JButton("Back",i);
		b3.setBounds(50,550,220,200);	
		b3.setHorizontalTextPosition(sc.CENTER);
		b3.setForeground(Color.white);
		b3.setOpaque(false);
		b3.setFont(f1);
		b3.setContentAreaFilled(false);
		b3.setBorderPainted(false);
		add(b3);
		
		
		tx1.addFocusListener(new FocusListener() 
		{
			public void focusGained(FocusEvent e)
			{
				if (tx1.getText().equals("Enter Username")) 
				{
					tx1.setText("");
					tx1.setForeground(Color.BLACK); // Set the text color to black when focus is gained
				}
			}

			public void focusLost(FocusEvent e) {
				if (tx1.getText().isEmpty()) {
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
				tx2.setForeground(Color.BLACK); // Set the text color to black when focus is gained
			}
		}

		public void focusLost(FocusEvent e) 
		{
			if (tx2.getText().isEmpty()) {
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
		
		i2=new ImageIcon("admin_page.png");
	    Image d1=i2.getImage();
		g1.drawImage(d1,550,50,this);
	
	}
	
}