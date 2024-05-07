import java.awt.*;
import javax.swing.*;
class UserTest extends JPanel
{
	ButtonGroup bg;
	JRadioButton rb1,rb2,rb3,rb4;
	JLabel l,lq,l1,l2,l3,l4,l5,l6;
	JTextArea t1;
	JButton b1,b2,b3,b4;
	ImageIcon i,i2;
	
	ImageIcon img,img1;
	Image  on,on1;
    UserTest()
    {
						
		// img=new ImageIcon("user.JPEG");
		// on=img.getImage();
			
		// img1=new ImageIcon("register1.PNG");
		// on1=img1.getImage();
		
		setLayout(null);
		Font ftx=new Font("",5,25);
		Font f=new Font("",5,20);
		Font f1=new Font("",5,20);
	    Font f2=new Font("Arial", Font.BOLD, 30);
		
		Font fbtn=new Font("",Font.BOLD,20);
	
		
		l=new JLabel("TEST");
	    // l.setForeground(new Color(115,251,253));
		l.setForeground(Color.black);
	    l.setBackground(Color.black);
		// l.setBounds(600,70,300,70);
		l.setBounds(480,20,500,25);
		l.setFont(f2);
		add(l);
		
		
		lq=new JLabel("");
		lq.setFont(f);
		lq.setForeground(Color.black);
	    lq.setBackground(Color.black);
		lq.setBounds(360,110,150,25);
		add(lq);
		
		
	   t1=new JTextArea();
       t1.setFont(ftx);
	   // t1.setForeground(new Color(115,251,253));
	    // t1.setBackground(Color.gray);
	  // t1.setBackground(Color.black);
	   t1.setLineWrap(true);
       t1.setWrapStyleWord(true);
	   t1.setBounds(420,110,650,180);
	   add(t1);
	 
	
		bg=new ButtonGroup();
		
		rb1=new JRadioButton("A");
		rb1.setFont(f);
	    rb1.setForeground(Color.white);
	    rb1.setBackground(Color.black);
		rb1.setBounds(430,350,50,30);
		bg.add(rb1);
		add(rb1);
		
		l1=new JLabel("");
		l1.setFont(f);
		l1.setForeground(Color.black);
	    l1.setBackground(Color.black);
		l1.setBounds(490,350,300,30);
		add(l1);
		
		rb2=new JRadioButton("B");
		rb2.setFont(f);
	    rb2.setForeground(Color.white);
	    rb2.setBackground(Color.black);
		rb2.setBounds(800,350,50,30);
		bg.add(rb2);
		add(rb2);
		
		
		l2=new JLabel("");
		l2.setFont(f);
		l2.setForeground(Color.black);
	    l2.setBackground(Color.black);
		l2.setBounds(860,350,300,30);
		add(l2);
		
		rb3=new JRadioButton("C");
		rb3.setFont(f);
	    rb3.setForeground(Color.white);
	    rb3.setBackground(Color.black);
		rb3.setBounds(430,450,50,30);
		bg.add(rb3);
		add(rb3);
		

		l3=new JLabel("");
		l3.setFont(f);
		l3.setForeground(Color.black);
	    l3.setBackground(Color.black);
		l3.setBounds(490,450,300,30);
		add(l3);
		
		rb4=new JRadioButton("D");
		rb4.setFont(f);
		rb4.setForeground(Color.white);
	    rb4.setBackground(Color.black);
		rb4.setBounds(800,450,50,30);
		bg.add(rb4);
		add(rb4);
		

		l4=new JLabel("");
		l4.setFont(f);
		l4.setForeground(Color.black);
	    l4.setBackground(Color.black);
		l4.setBounds(860,450,300,30);
		add(l4);
		
		
		l5=new JLabel("");
		l5.setForeground(Color.black);
	    l5.setBackground(Color.black);
		l5.setBounds(410,630,250,20);
		l5.setFont(ftx);
		add(l5);
		
		l6=new JLabel("");
		l6.setForeground(Color.black);
	    l6.setBackground(Color.black);
		l6.setBounds(780,630,250,20);
		l6.setFont(ftx);
		add(l6);
		
		SwingConstants sc=new SwingConstants(){};
		i = new ImageIcon("panel_but.png");
		
		b1=new JButton("Previous",i);
		b1.setBounds(380,450,220,200);	
		b1.setHorizontalTextPosition(sc.CENTER);
		b1.setForeground(Color.white);
		b1.setOpaque(false);
		b1.setContentAreaFilled(false);
		b1.setBorderPainted(false);
		b1.setFont(fbtn);
		add(b1);
		
		
		// b1.setFont(f1);
	    // b1.setForeground(new Color(115,251,253));
	    // b1.setBackground(Color.black);
		// b1.setBounds(410,700,150,50);
		// add(b1);
		
		b2=new JButton("Save/Next",i);
		b2.setBounds(800,450,220,200);	
		b2.setHorizontalTextPosition(sc.CENTER);
		b2.setForeground(Color.white);
		b2.setOpaque(false);
		b2.setContentAreaFilled(false);
		b2.setBorderPainted(false);
		b2.setFont(fbtn);
		add(b2);
		
		b3=new JButton("Back",i);
		b3.setBounds(30,525,220,250);	
		b3.setHorizontalTextPosition(sc.CENTER);
		b3.setForeground(Color.white);
		b3.setOpaque(false);
		b3.setContentAreaFilled(false);
		b3.setBorderPainted(false);
		b3.setFont(fbtn);
		add(b3);
		
		// b2.setFont(f);
		// b2.setForeground(new Color(115,251,253));
	    // b2.setBackground(Color.black);
		// b2.setBounds(790,700,150,50);
		// add(b2);
			
		b4=new JButton("SUBMIT",i);
		b4.setBounds(1100,550,220,200);	
		b4.setHorizontalTextPosition(sc.CENTER);
		b4.setForeground(Color.white);
		b4.setOpaque(false);
		b4.setContentAreaFilled(false);
		b4.setBorderPainted(false);
		b4.setFont(fbtn);
		add(b4);
		
		
		// b4.setFont(f);
		// b4.setForeground(new Color(115,251,253));
	    // b4.setBackground(Color.black);
		// b4.setBounds(200,850,150,50);
		// add(b4);
		

    } 
	 public void paintComponent(Graphics g)
    {
		i2=new ImageIcon("menu_bg.jpg");
	    Image d1=i2.getImage();
		g.drawImage(d1,0,0,this);
		
		
		// super.paintComponent(g);
		// g.drawImage(on,0,0,2000,1000,this);
		// g.drawImage(on1,1200,350,300,300,this);
	}

}