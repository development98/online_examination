import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
class UserPanel_2 extends JPanel 
{
	JButton b1,b2,b3,b4;
	Choice c1;
	
	ImageIcon img,img1,img2,img3;
	Image on,on1,on2,on3;
	
	
	UserPanel_2()
	{
	setLayout(null);
	Font f=new Font("",5,25);
	Font f1=new Font("",5,15);	
		
	img=new ImageIcon("user.JPEG");
	on=img.getImage();
	
	img1=new ImageIcon("managecourse1.PNG");
	on1=img1.getImage();
	
	img2=new ImageIcon("result1.PNG");
	on2=img2.getImage();

	img3=new ImageIcon("logout1.PNG");
	on3=img3.getImage();
	
	
	
	
	b1=new JButton("EDIT DETAILS");
	b1.setForeground(new Color(115,251,253));
	b1.setBackground(Color.black);
	b1.setBounds(300,220,150,40);
	b1.setFont(f1);
	add(b1);
	
	b2=new JButton("RESULTS");
	b2.setForeground(new Color(115,251,253));
	b2.setBackground(Color.black);
	b2.setBounds(950,220,150,40);
	b2.setFont(f1);
	add(b2);
		
	b3=new JButton("LOGOUT");
	b3.setForeground(new Color(115,251,253));
	b3.setBackground(Color.black);
	b3.setBounds(1600,220,150,40);
	b3.setFont(f1);
	add(b3);
	
	c1=new Choice();
    c1.setBounds(800,400,250,150);
	c1.setForeground(new Color(115,251,253));
	c1.setBackground(Color.black);
	//c1.add("aptitute");
	c1.setFont(f);
	add(c1);
	
	b4=new JButton("START");
    b4.setForeground(new Color(115,251,253));
	b4.setBackground(Color.black);
	b4.setBounds(1100,400,150,40);
	b4.setFont(f1);
	add(b4);
	
	
	
		try
	 { 
      // String g=""+Fdemo.globle;
	 	Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con1=DriverManager.getConnection("jdbc:mysql:///online","root","root");
        Statement st1=con1.createStatement();
       
	   String ss1="select * from course";
	   ResultSet rs1=st1.executeQuery(ss1);
	   
	   while(rs1.next())
	   {
		  		  c1.add(rs1.getString(1));  
	 
		}
	 }
	
	 catch(Exception e1)
	 {
		 System.out.println(e1);
	 }
	
		
	}
	
	 public void paintComponent(Graphics g)
    {
	super.paintComponent(g);
	g.drawImage(on,0,0,2000,1000,this);
	g.drawImage(on1,100,150,150,150,this);
	g.drawImage(on2,750,150,150,150,this);
	g.drawImage(on3,1400,150,150,150,this);
    }	
	
}