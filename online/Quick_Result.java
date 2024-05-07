import java.awt.*;
import javax.swing.*;
class Quick_Result extends JPanel
{
JLabel  l,l1,l2,l3,l4,l5,l6,l7;
JLabel t1,t2,t3,t4,t5,t6,t7;
JButton b1;
ImageIcon img,img2;
Image  on,on2;
Quick_Result()
{
    Font f=new Font("",5,35);
	Font f1=new Font("",5,25);
	Font f2=new Font("Arial Black",5,30);
	setLayout(null); 
	 
	 					
	img=new ImageIcon("user.JPEG");
	on=img.getImage();
		
	 
	img2=new ImageIcon("result1.PNG");
	on2=img2.getImage();

	    l=new JLabel("TEST RESULT");
		l.setFont(f2);
		l.setForeground(new Color(115,251,253));
     	l.setBackground(Color.black);
		l.setBounds(400,100,300,40);
		add(l);
		
	    l1=new JLabel("Course name :");
		l1.setFont(f);
		l1.setForeground(new Color(115,251,253));
     	l1.setBackground(Color.black);
		l1.setBounds(200,200,300,40);
		add(l1);
		
		
	    t1=new JLabel("");
		t1.setFont(f);
		t1.setForeground(new Color(240,134,80));
	   // t1.setBackground(Color.black);
		t1.setBounds(700,200,200,40);
		add(t1);
		
		
	    l2=new JLabel("Total Question :");
		l2.setFont(f);
		l2.setForeground(new Color(115,251,253));
	    l2.setBackground(Color.black);
		l2.setBounds(200,270,400,40);
		add(l2);
		
			
	    t2=new JLabel("");
		t2.setFont(f);
		t2.setForeground(new Color(240,134,80));
	    //t2.setBackground(Color.black);
		t2.setBounds(700,270,50,40);
		add(t2);
		
		
	    l3=new JLabel("Attempted Question :");
		l3.setFont(f);
		l3.setForeground(new Color(115,251,253));
	    l3.setBackground(Color.black);
		l3.setBounds(200,340,300,40);
		add(l3);
		
				
	    t3=new JLabel("");
		t3.setFont(f);
		t3.setForeground(new Color(240,134,80));
	   // t3.setBackground(Color.black);
		t3.setBounds(700,340,50,40);
		add(t3);
		
		
	    l4=new JLabel("Correct Question :");
		l4.setFont(f);
		l4.setForeground(new Color(115,251,253));
	    l4.setBackground(Color.black);
		l4.setBounds(200,410,300,40);
		add(l4);
		
				
	    t4=new JLabel("");
		t4.setFont(f);
		t4.setForeground(new Color(240,134,80));
	   // t4.setBackground(Color.black);
		t4.setBounds(700,410,50,40);
		add(t4);
		
		
	    l5=new JLabel("Wrong :");
		l5.setFont(f);
		l5.setForeground(new Color(115,251,253));
	    l5.setBackground(Color.black);
		l5.setBounds(200,480,300,40);
		add(l5);
		
				
	    t5=new JLabel("");
		t5.setFont(f);
		t5.setForeground(new Color(240,134,80));
	   // t5.setBackground(Color.black);
		t5.setBounds(700,480,50,40);
		add(t5);
		
		
	    l6=new JLabel("Marks Obtained:");
		l6.setFont(f);
		l6.setForeground(new Color(115,251,253));
	    l6.setBackground(Color.black);
		l6.setBounds(200,550,300,40);
		add(l6);
		
				
	    t6=new JLabel("");
		t6.setFont(f);
		t6.setForeground(new Color(240,134,80));
	   // t6.setBackground(Color.black);
		t6.setBounds(700,550,50,40);
		add(t6);
		
	    l7=new JLabel("Total Marks :");
		l7.setFont(f);
	 	l7.setForeground(new Color(115,251,253));
	    l7.setBackground(Color.black);
		l7.setBounds(200,620,400,40);
		add(l7);
		
			
	    t7=new JLabel("");
		t7.setFont(f);
		t7.setForeground(new Color(240,134,80));
	  //  t7.setBackground(Color.black);
		t7.setBounds(700,620,50,40);
		add(t7);
		
		b1=new JButton("EXIT");
		b1.setFont(f1);
		b1.setForeground(new Color(115,251,253));
	    b1.setBackground(Color.black);
		b1.setBounds(750,750,100,50);
		add(b1);
		
}
 public void paintComponent(Graphics g)
    {
		
	 // Color bg=new Color(115,251,253);
	// g.setColor(bg);
	super.paintComponent(g);
	g.drawImage(on,0,0,2000,1000,this);
	g.drawImage(on2,1100,280,300,300,this);
	}


}