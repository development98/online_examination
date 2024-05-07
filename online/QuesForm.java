import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;

import javax.swing.BorderFactory;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;


class QuesForm extends JPanel implements ActionListener,ItemListener
{
	JLabel lb1,lb2,lb3,lb4,lb5,lb6,lb7,lb8,lb9,lb11,lb12;
	JTextField tx1,tx3,tx4,tx5,tx6,tx7,tx8,tx9,tx10;
	JTextArea tx2;
	JButton b1,b3,b4,b5;
	JComboBox cb1,cb2,cb3;
	ImageIcon i,i2;
	Timer time;
	ButtonGroup cbg;
	JRadioButton r1,r2,r3,r4;
	
	static String copn;
	int hour=0,min=0,sec=0;
		
	QuesForm()
	{
		setLayout(null);
		Font f1=new Font("", Font.BOLD, 25);
		lb1 = new JLabel("Course Name: ");
		lb1.setBounds(480,20,200,25);
		lb1.setForeground(Color.white);
		lb1.setFont(f1);
		add(lb1);
		lb11 = new JLabel("");
		lb11.setBounds(700,20,400,25);
		lb11.setForeground(Color.white);
		lb11.setFont(f1);
		add(lb11);
		// tx1 = new JTextField(10);
		// tx1.setBounds(200,50,150,25);
		// add(tx1);
		
		Font f2=new Font("", Font.BOLD, 15);
		
		lb12 = new JLabel("Ques.");
		lb12.setBounds(30,120,200,25);
		lb12.setForeground(Color.white);
		lb12.setFont(f2);
		add(lb12);
		
		// lb2 = new JLabel("");
		// lb2.setBounds(65,120,200,25);
		// lb2.setForeground(Color.white);
		// lb2.setFont(f2);
		// add(lb2);
		
		tx2 = new JTextArea();
		tx2.setBounds(180,120,600,180);
		// tx2.setLocation(250,100);
		add(tx2);
		
		cbg = new ButtonGroup();
		
		r1 = new JRadioButton("1");
		r1.setSize(50,30);
		r1.setLocation(130,320);
		r1.setFont(f2);
		add(r1);
		cbg.add(r1);
		
		tx6 = new JTextField(10);
		tx6.setBounds(200,320,230,30);
		tx6.setFont(f2);
		add(tx6);
		
		r2 = new JRadioButton("2");
		r2.setSize(50,30);
		r2.setLocation(450,320);
		r2.setFont(f2);
		add(r2);
		cbg.add(r2);
		tx7 = new JTextField(10);
		tx7.setBounds(520,320,250,30);
		tx7.setFont(f2);
		add(tx7);
		
		r3 = new JRadioButton("3");
		r3.setSize(50,30);
		r3.setLocation(130,420);
		r3.setFont(f2);
		add(r3);
		cbg.add(r3);
		tx8 = new JTextField(10);
		tx8.setBounds(200,420,230,30);
		tx8.setFont(f2);
		add(tx8);
		
		r4 = new JRadioButton("4");
		r4.setSize(50,30);
		r4.setLocation(450,420);
		r4.setFont(f2);
		add(r4);
		cbg.add(r4);
		tx9 = new JTextField(10);
		tx9.setBounds(520,420,250,30);
		tx9.setFont(f2);
		add(tx9);
		
		lb7 = new JLabel("Question attempted: ");
		lb7.setBounds(50,550,200,30);
		lb7.setForeground(Color.white);
		lb7.setFont(f2);
		add(lb7);
		
		lb8 = new JLabel("");
		lb8.setBounds(200,550,300,30);
		lb8.setForeground(Color.white);
		lb8.setFont(f2);
		add(lb8);
		// tx7 = new JTextField(10);
		// tx7.setBounds(1100,100,150,30);
		// tx7.setFont(f2);
		// add(tx7);
		
		lb9 = new JLabel("Time");
		lb9.setBounds(1100,150,300,30);
		lb9.setForeground(Color.white);
		add(lb9);

		tx3 = new JTextField(10);
		tx3.setBounds(1000,200,50,30);
		add(tx3);
		
		tx4 = new JTextField(10);
		tx4.setBounds(1100,200,50,30);
		add(tx4);
		
		tx5 = new JTextField(10);
		tx5.setBounds(1200,200,50,30);
		add(tx5);
		
		time = new Timer(1000,new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				// tx4.setText();
				// tx5.setText();
				tx3.setText("00");
				tx4.setText(String.valueOf(min));
				tx5.setText(String.valueOf(sec));
				if(sec==60)
				{
					sec = 0;
					min++;
					if(min==1)
					{
						time.stop();
						//submit();
						
						// card.show(cont,"Result_page");
					}
				}
				sec++;
			}
		});
		time.start();
		
		cb1 = new JComboBox();
		cb1.setLocation(80,120);
		cb1.setSize(70,30);
		cb1.setFont(f2);
		add(cb1);
		cb1.addItemListener(this);
		
		SwingConstants sc=new SwingConstants(){};
		i = new ImageIcon("panel_but.png");
		
		b1=new JButton("Back",i);
		b1.setBounds(30,525,220,250);	
		b1.setHorizontalTextPosition(sc.CENTER);
		b1.setForeground(Color.white);
		b1.setOpaque(false);
		b1.setContentAreaFilled(false);
		b1.setBorderPainted(false);
		add(b1);
		
		b3=new JButton("PREVIOUS",i);
		b3.setBounds(60,400,220,200);	
		b3.setHorizontalTextPosition(sc.CENTER);
		b3.setForeground(Color.white);
		b3.setOpaque(false);
		b3.setContentAreaFilled(false);
		b3.setBorderPainted(false);
		add(b3);
		
		// b4=new JButton("SAVE",i);
		b4=new JButton("SAVE & NEXT",i);
		b4.setBounds(550,400,220,200);	
		b4.setHorizontalTextPosition(sc.CENTER);
		b4.setForeground(Color.white);
		b4.setOpaque(false);
		b4.setContentAreaFilled(false);
		b4.setBorderPainted(false);
		add(b4);
		
		b5=new JButton("SUBMIT",i);
		b5.setBounds(1000,200,220,200);	
		b5.setHorizontalTextPosition(sc.CENTER);
		b5.setForeground(Color.white);
		b5.setOpaque(false);
		b5.setContentAreaFilled(false);
		b5.setBorderPainted(false);
		add(b5);
		
	}
	public void paintComponent(Graphics g1)
	{
		i2=new ImageIcon("qfrm_bg.png");
	    Image d1=i2.getImage();
		g1.drawImage(d1,0,0,this);
		g1.drawRect(30,80,800,520);
		
	}
	public void itemStateChanged(ItemEvent e)
	{
		String sc = (String)cb1.getSelectedItem();
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?useSSL=false&AllowPublicKeyRetrieval=true","root","root");
					Statement st = con.createStatement();
					ResultSet rs = st.executeQuery("Select * from qcrse where Qid = '" + sc + "'" + "limit 1");
					while(rs.next())
					{
						cbg.clearSelection();
						
					tx2.setText(rs.getString(2));
					tx6.setText(rs.getString(3));
					tx7.setText(rs.getString(4));
					tx8.setText(rs.getString(5));
					tx9.setText(rs.getString(6));
					copn = rs.getString(7);
					System.out.println("Correct answer is "+copn);
					}
					
					con.close();
				}
				catch(Exception e1)
				{
					// System.out.println(e1);
					JOptionPane.showMessageDialog(null,e1.getMessage(),"Message",JOptionPane.INFORMATION_MESSAGE);
				}
	}
	public void actionPerformed(ActionEvent e)
	{
		String Cop=null;
		if(e.getSource() == b4)
		{
			if(r1.isSelected())
			{
				Cop="Option A";
			}
			else if(r2.isSelected())
			{
				Cop="Option B";
			}
			else if(r3.isSelected())
			{
				Cop="Option C";
			}
			else if(r4.isSelected())
			{
				Cop="Option D";
			}
			String sc = lb11.getText();
			String s2 = (String)cb1.getSelectedItem();
			String s3 = Cop;
			String s1 = tx1.getText();
			
			
			
			// rs.last();
			// String s3 = rs.getRow();
            // System.out.println("table row contains "+ rs.getRow());
			// String s7 = tx2.getText();
			// String s4 = tx4.getText();
			// String s5 = tx5.getText();
			// String s6 = tx6.getText();
			
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?useSSL=false & AllowPublicKeyRetrieval=true","root","root");
				Statement st = con.createStatement();
				st.executeUpdate("insert into Quesdata values('"+sc+"', '"+s2+"', '"+s3+"','"+s1+"')");
				JOptionPane.showMessageDialog(null,"Data inserted");
				// tx1.setText("");
				// tx2.setText("");
				// tx3.setText("");
				// tx4.setText("");
				// tx5.setText("");
				// tx6.setText("");
				// cb1.setSelectedItem("Option A");
				con.close();
			}
			catch(Exception e1)
			{
				// System.out.println(e1);
				JOptionPane.showMessageDialog(null,e1.getMessage(),"Message",JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
	
}