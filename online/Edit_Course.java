import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;

import javax.swing.BorderFactory;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;

class Edit_Course extends JPanel
{
	NewDemo nwd;
	ViewDemo view;
	UpdateDemo upd;
	RemoveDemo rmv;
	
	JTabbedPane tab1;
	JButton b1,b2;
	ImageIcon icon,icon2,icon3,icon4,i,i2;
	
	Edit_Course()
	{
		setLayout(new BorderLayout());
		tab1 = new JTabbedPane();
		icon = new ImageIcon("new_icn_2.png");
		icon2 = new ImageIcon("view_file_12.png");
		icon3 = new ImageIcon("update_icon_12.png");
		icon4 = new ImageIcon("remove_icon_12.jpg");
		// JComponent panel1 = makeTextPanel("Panel #1");
		// tabbedPane.addTab("Tab 1", icon, panel1,"Does nothing");
		// tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);
		
		nwd = new NewDemo();
		
		view = new ViewDemo();
		upd = new UpdateDemo();
		rmv = new RemoveDemo();
		
		tab1.addTab("New",icon,nwd);
		tab1.addTab("View",icon2,view);
		tab1.addTab("Update",icon3,upd);
		tab1.addTab("Remove",icon4,rmv);
		add(tab1);
	}
	
}

class NewDemo extends JPanel implements ActionListener
{
	Mng_Course mcr = new Mng_Course();
	MainFile mf = new MainFile();
	JLabel lb1,lb2,lb3,lb4,lb5,lb6,lb7,lb8,lb9,lb10,lb11,lb12,lb13;
	JTextField tx1,tx3,tx4,tx5,tx6,tx7,tx8,tx9,tx10;
	JTextField tx11;
	JTextArea tx2;
	JButton b1,b2,b3,b4;
	JComboBox cb1,cb2;
	JComboBox cb11,cb12,cb13;
	
	JScrollPane scrollPane;
	
	ImageIcon i,i2;
		
	NewDemo()
	{
		setLayout(null);
		Font f1=new Font("", Font.ITALIC, 20);
		
		Font f2=new Font("", Font.ITALIC, 25);
		
		tx11 = new JTextField(10);
		tx11.setBounds(480,50,260,35);
		tx11.setFont(f2);
		add(tx11);
		
		// lb13 = new JLabel();
		// lb13.setBounds(400,50,200,30);
		// lb13.setForeground(Color.black);
		// lb13.setFont(f1);
		// add(lb13);
		
		lb1 = new JLabel("Question ID:");
		lb1.setBounds(50,50,200,30);
		lb1.setForeground(Color.black);
		lb1.setFont(f1);
		add(lb1);
		tx1 = new JTextField(10);
		tx1.setBounds(200,50,200,25);
		tx1.setFont(f1);
		add(tx1);
		
		lb2 = new JLabel("Question");
		lb2.setBounds(50,100,300,30);
		lb2.setForeground(Color.black);
		lb2.setFont(f1);
		add(lb2);
		tx2 = new JTextArea();
		tx2.setBounds(200,100,550,120);
		tx2.setFont(f1);
		tx2.setLineWrap(true);
        tx2.setWrapStyleWord(true);
		add(tx2);
		
		lb12 = new JLabel("Statement:");
		lb12.setBounds(50,130,300,30);
		lb12.setForeground(Color.black);
		lb12.setFont(f1);
		add(lb12);
		
		lb3 = new JLabel("Option A");
		lb3.setBounds(50,250,100,30);
		lb3.setForeground(Color.black);
		lb3.setFont(f1);
		add(lb3);
		tx3 = new JTextField(10);
		tx3.setBounds(200,250,200,25);
		tx3.setFont(f1);
		add(tx3);
		
		lb4 = new JLabel("Option B");
		lb4.setBounds(50,300,100,30);
		lb4.setForeground(Color.black);
		lb4.setFont(f1);
		add(lb4);
		tx4 = new JTextField(10);
		tx4.setBounds(200,300,200,25);
		tx4.setFont(f1);
		add(tx4);
		
		lb5 = new JLabel("Option C");
		lb5.setBounds(50,350,100,30);
		lb5.setForeground(Color.black);
		lb5.setFont(f1);
		add(lb5);
		tx5 = new JTextField(10);
		tx5.setBounds(200,350,200,25);
		tx5.setFont(f1);
		add(tx5);
		
		lb6 = new JLabel("Option D");
		lb6.setBounds(50,400,100,30);
		lb6.setForeground(Color.black);
		lb6.setFont(f1);
		add(lb6);
		tx6 = new JTextField(10);
		tx6.setBounds(200,400,200,25);
		tx6.setFont(f1);
		add(tx6);
		
		lb7 = new JLabel("Correct Option: ");
		lb7.setBounds(50,450,200,30);
		lb7.setForeground(Color.black);
		lb7.setFont(f1);
		add(lb7);
		
		lb8 = new JLabel("Course Name");
		lb8.setBounds(50,650,300,30);
		lb8.setForeground(Color.black);
		lb8.setFont(f1);
		add(lb8);
		tx7 = new JTextField(10);
		tx7.setBounds(200,650,250,35);
		tx7.setFont(f1);
		add(tx7);
		
		lb9 = new JLabel("Time");
		lb9.setBounds(50,730,300,30);
		lb9.setForeground(Color.black);
		lb9.setFont(f1);
		// add(lb9);
		
		cb11 = new JComboBox();
		for(int j=1;j<=24;j++)
		{	
			cb11.addItem(j);
		}
		cb11.setLocation(200,730);
		cb11.setSize(50,30);
		cb11.setFont(f1);
		// add(cb11);
		
		cb12 = new JComboBox();
		for(int j=1;j<=60;j++)
		{
			cb12.addItem(j);
		}
		cb12.setLocation(300,730);
		cb12.setSize(50,30);
		cb12.setFont(f1);
		// add(cb12);
		
		cb13 = new JComboBox();
		for(int j=1;j<=60;j++)
		{
			cb13.addItem(j);
		}
		cb13.setLocation(400,730);
		cb13.setSize(50,30);
		cb13.setFont(f1);
		// add(cb13);
		
		
		lb10 = new JLabel("Each Mark");
		lb10.setBounds(50,780,300,30);
		lb10.setForeground(Color.black);
		lb10.setFont(f1);
		// add(lb10);
		
		lb11 = new JLabel("Total Questions:   5");
		lb11.setBounds(50,850,300,30);
		lb11.setForeground(Color.black);
		lb11.setFont(f1);
		// add(lb11);
		
		
		String s[] = {"Option A","Option B","Option C","Option D"};
		cb1 = new JComboBox(s);
		cb1.setLocation(200,450);
		cb1.setSize(200,30);
		cb1.setFont(f1);
		add(cb1);
		
		cb2 = new JComboBox();
		for(int j=1;j<=10;j++)
		{
			cb2.addItem(j);
		}
		cb2.setLocation(200,780);
		cb2.setSize(200,30);
		cb2.setFont(f1);
		// add(cb2);
			
		SwingConstants sc=new SwingConstants(){};
		i = new ImageIcon("panel_but.png");
		b1=new JButton("SAVE",i);
		b1.setBounds(500,485,220,200);	
		b1.setHorizontalTextPosition(sc.CENTER);
		b1.setForeground(Color.black);
		b1.setOpaque(false);
		b1.setFont(f1);
		b1.setContentAreaFilled(false);
		b1.setBorderPainted(false);
		add(b1);
		b1.addActionListener(this);
		
		b2=new JButton("Back",i);
		b2.setBounds(30,485,220,200);	
		b2.setHorizontalTextPosition(sc.CENTER);
		b2.setForeground(Color.black);
		b2.setOpaque(false);
		b2.setFont(f1);
		b2.setContentAreaFilled(false);
		b2.setBorderPainted(false);
		add(b2);
		// b2.addActionListener(this);
		
		b3=new JButton("SAVE",i);
		b3.setBounds(500,850,220,200);	
		b3.setHorizontalTextPosition(sc.CENTER);
		b3.setForeground(Color.black);
		b3.setOpaque(false);
		b3.setFont(f1);
		b3.setContentAreaFilled(false);
		b3.setBorderPainted(false);
		add(b3);
		b3.addActionListener(this);
		
		b4=new JButton("Search",i);
		b4.setBounds(30,850,220,200);	
		b4.setHorizontalTextPosition(sc.CENTER);
		b4.setForeground(Color.black);
		b4.setOpaque(false);
		b4.setFont(f1);
		b4.setContentAreaFilled(false);
		b4.setBorderPainted(false);
		add(b4);
		
		
		// create the components...
		// create a panel to hold all the components
		JPanel contentPanel = new JPanel(null);
		// contentPanel.setBackground(Color.black); 
		contentPanel.setPreferredSize(new Dimension(800, 1000)); // set the preferred size of the content panel
		contentPanel.add(lb1);
		contentPanel.add(tx11);
		contentPanel.add(tx1);
		contentPanel.add(lb2);
		contentPanel.add(tx2);
		contentPanel.add(lb3);
		contentPanel.add(tx3);
		contentPanel.add(lb4);
		contentPanel.add(tx4);
		contentPanel.add(lb5);
		contentPanel.add(tx5);
		contentPanel.add(lb6);
		contentPanel.add(tx6);
		contentPanel.add(lb7);
		contentPanel.add(lb12);

		contentPanel.add(lb8);
		contentPanel.add(tx7);
		contentPanel.add(lb9);
		contentPanel.add(lb10);
		contentPanel.add(lb11);

		contentPanel.add(cb11);
		contentPanel.add(cb12);
		contentPanel.add(cb13);
		contentPanel.add(cb1);
		contentPanel.add(cb2);

		contentPanel.add(b1);
		contentPanel.add(b2);
		contentPanel.add(b3);
		contentPanel.add(b4);

		JScrollPane scrollPane = new JScrollPane(contentPanel);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(30, 30, 900, 620);
		add(scrollPane);
		
		
		// String s11 = mcr.ch1.getSelectedItem();
		// try
			// {
				
				// Class.forName("com.mysql.cj.jdbc.Driver");
				// Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?useSSL=false","root","Root");
				// Statement st = con.createStatement();
				// ResultSet rs = st.executeQuery("Select * from subject where course = '"+ s11 +"'");
				// if(rs.next())
				// {
					// tx11.setText(rs.getString(1));
					// System.out.println(rs.getString(1));
				// }
				// con.close();
				
			// }
			// catch(Exception e1)
			// {
				// System.out.println(e1);
				// JOptionPane.showMessageDialog(null,e1);
			// }
	}
	public void actionPerformed(ActionEvent e)
	{
		
			
			// String sc = mcr.ch1.getSelectedItem();
			
			// String s7 = tx7.getText();
			// String s8 = tx8.getText();
			// String s9 = tx9.getText();
			// String s10 = tx10.getText();
			// String s11 = cb2.getSelectedItem().toString();
			
			// try
			// {
				// Class.forName("com.mysql.cj.jdbc.Driver");
				// Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?useSSL=false","root","Root");
				// Statement st = con.createStatement();
				// st.executeUpdate("insert into `"+sc+"` values('"+s7+"', '"+s8+"', '"+s9+"', '"+s10+"', '"+s11+"')");
				// JOptionPane.showMessageDialog(null,"Course Data inserted");
				// con.close();
			// }
			// catch(Exception e1)
			// {
				// System.out.println(e1);
			// }
		// }
		if(e.getSource() == b1)
		{
			String g=FDemo.globle;
			System.out.println(g);
			
			String sc = tx11.getText();
			String s1 = tx1.getText();
			String s2 = tx2.getText();
			String s3 = tx3.getText();
			String s4 = tx4.getText();
			String s5 = tx5.getText();
			String s6 = tx6.getText();
			String s7 = (String)cb1.getSelectedItem();
			
			if(s1.equals("")||s2.equals("")||s3.equals("")||s4.equals("")||s5.equals("")||s6.equals(""))
			{
				JOptionPane.showMessageDialog(null,"All Fields are Mandotory");
			}
			else
			{
				
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?useSSL=false&AllowPublicKeyRetrieval=true","root","root");
					Statement st = con.createStatement();
					String s="insert into "+g+" values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"')";
					st.executeUpdate(s);
					
					JOptionPane.showMessageDialog(null,"Data inserted successfully","Message Box",JOptionPane.INFORMATION_MESSAGE);
					tx1.setText("");
					tx2.setText("");
					tx3.setText("");
					tx4.setText("");
					tx5.setText("");
					tx6.setText("");
					cb1.setSelectedItem("Option A");
					con.close();
					// st.executeUpdate("insert into `"+sc+"` values('"+s1+"', '"+s2+"', '"+s3+"', '"+s4+"', '"+s5+"', '"+s6+"', '"+s7+"')");
					// tx11.setText(null);
				}
				catch(Exception e1)
				{
					System.out.println(e1);
					JOptionPane.showMessageDialog(null,e1.getMessage(),"Message",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		}
		if(e.getSource() == b3)
		{
			String s1 = tx7.getText();
			String s2 = tx8.getText();
			String s3 = tx9.getText();
			String s4 = tx10.getText();
			String s5 = (String)cb2.getSelectedItem().toString();
			
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?useSSL=false&AllowPublicKeyRetrieval=true","root","root");
				Statement st = con.createStatement();
				st.executeUpdate("UPDATE addcrse SET hour='"+s2+"',min='"+s3+"',sec='"+s4+"',emrk='"+s5+"' WHERE cname='"+s1+"'");
				
				JOptionPane.showMessageDialog(null,"Data updated");
				tx7.setText("");
				tx8.setText("");
				tx9.setText("");
				tx10.setText("");
				cb2.setSelectedItem("1");
				con.close();
			}
			catch(Exception e1)
			{
				System.out.println(e1);
				JOptionPane.showMessageDialog(null,e1.getMessage(),"Message",JOptionPane.INFORMATION_MESSAGE);
			}
		}	
		
	}
	public void paintComponent(Graphics g1)
	{
		i2=new ImageIcon("menu_bg.jpg");
	    Image d1=i2.getImage();
		g1.drawImage(d1,0,0,this);
		
		g1.drawRect(30,30,800,600);
	}
}

class BackgroundPanel extends JPanel {
    private Image backgroundImage;

    public BackgroundPanel(Image backgroundImage) {
        this.backgroundImage = backgroundImage;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), null);
    }
}

class ViewDemo extends JPanel implements ActionListener,ItemListener
{
	Mng_Course mcr = new Mng_Course();
	JLabel lb1,lb2,lb3,lb4,lb5,lb6,lb7,lb8,lb9,lb10,lb11,lb12;
	JTextField tx1,tx3,tx4,tx5,tx6,tx7,tx8,tx9,tx10,tx11;
	JTextArea tx2;
	JButton b1,b2,b3;
	JComboBox cb1,cb2,cb3;
	ImageIcon i,i2;
		
	ViewDemo()
	{
		setLayout(null);
		
		
		Font f1=new Font("", Font.ITALIC, 20);
		
		Font f2=new Font("", Font.ITALIC, 25);
		
		tx11 = new JTextField(10);
		tx11.setBounds(480,20,260,35);
		tx11.setFont(f2);
		add(tx11);
		
		// lb13 = new JLabel();
		// lb13.setBounds(400,50,200,30);
		// lb13.setForeground(Color.black);
		// lb13.setFont(f1);
		// add(lb13);
		
		lb1 = new JLabel("Question ID:");
		lb1.setBounds(50,20,200,30);
		lb1.setForeground(Color.black);
		lb1.setFont(f1);	
		add(lb1);
		
		lb2 = new JLabel("Question");
		lb2.setBounds(50,100,300,30);
		lb2.setForeground(Color.black);
		lb2.setFont(f1);
		add(lb2);
		tx2 = new JTextArea();
		tx2.setBounds(200,100,550,120);
		tx2.setFont(f1);
		tx2.setLineWrap(true);
        tx2.setWrapStyleWord(true);
		add(tx2);
		
		lb12 = new JLabel("Statement:");
		lb12.setBounds(80,160,300,30);
		lb12.setForeground(Color.black);
		lb12.setFont(f1);
		add(lb12);
		
		lb3 = new JLabel("Option A");
		lb3.setBounds(50,250,100,30);
		lb3.setForeground(Color.black);
		lb3.setFont(f1);
		add(lb3);
		tx3 = new JTextField(10);
		tx3.setBounds(200,250,200,25);
		tx3.setFont(f1);
		add(tx3);
		
		lb4 = new JLabel("Option B");
		lb4.setBounds(50,300,100,30);
		lb4.setForeground(Color.black);
		lb4.setFont(f1);
		add(lb4);
		tx4 = new JTextField(10);
		tx4.setBounds(200,300,200,25);
		tx4.setFont(f1);
		add(tx4);
		
		lb5 = new JLabel("Option C");
		lb5.setBounds(50,350,100,30);
		lb5.setForeground(Color.black);
		lb5.setFont(f1);
		add(lb5);
		tx5 = new JTextField(10);
		tx5.setBounds(200,350,200,25);
		tx5.setFont(f1);
		add(tx5);
		
		lb6 = new JLabel("Option D");
		lb6.setBounds(50,400,100,30);
		lb6.setForeground(Color.black);
		lb6.setFont(f1);
		add(lb6);
		tx6 = new JTextField(10);
		tx6.setBounds(200,400,200,25);
		tx6.setFont(f1);
		add(tx6);
		
		lb7 = new JLabel("Correct Option: ");
		lb7.setBounds(50,450,200,30);
		lb7.setForeground(Color.black);
		lb7.setFont(f1);
		add(lb7);
		
		lb12 = new JLabel();
		lb12.setBounds(250,450,300,30);
		lb12.setForeground(Color.black);
		lb12.setFont(f1);
		add(lb12);
		
		// lb8 = new JLabel("Course Name");
		// lb8.setBounds(950,100,300,30);
		// lb8.setForeground(Color.black);
		// lb8.setFont(f1);
		// add(lb8);
		// tx7 = new JTextField(10);
		// tx7.setBounds(1100,100,150,30);
		// tx7.setFont(f1);
		// add(tx7);
		       
		// lb9 = new JLabel("Time");
		// lb9.setBounds(1100,150,300,30);
		// lb9.setForeground(Color.black);
		// lb9.setFont(f1);
		// add(lb9);
		// tx8 = new JTextField(10);
		// tx8.setBounds(1000,200,50,30);
		// tx8.setFont(f1);
		// add(tx8);
		
		// tx9 = new JTextField(10);
		// tx9.setBounds(1100,200,50,30);
		// tx9.setFont(f1);
		// add(tx9);
		
		// tx10 = new JTextField(10);
		// tx10.setBounds(1200,200,50,30);
		// tx10.setFont(f1);
		// add(tx10);
		
		// lb10 = new JLabel("Each Mark");
		// lb10.setBounds(950,280,300,30);
		// lb10.setForeground(Color.black);
		// lb10.setFont(f1);
		// add(lb10);
		
		// lb11 = new JLabel("Total Questions:   ");
		// lb11.setBounds(1000,350,300,30);
		// lb11.setForeground(Color.black);
		// lb11.setFont(f1);
		// add(lb11);
		
		// String s[] = {"Option A","Option B","Option C","Option D"};
		// cb1 = new JComboBox(s);
		// for(int i=1;i<=20;i++)
		// {
			// cb1.additem(i);
		// }
		// cb1.setLocation(380,500);
		// cb1.setSize(200,30);
		// cb1.setFont(f1);
		// add(cb1);
		
		// cb2 = new JComboBox();
		// for(int j=1;j<=10;j++)
		// {
			// cb2.addItem(j);
		// }
		// cb2.setLocation(1100,280);
		// cb2.setSize(200,30);
		// cb2.setFont(f1);
		// add(cb2);
		
		// String s1[] = {"Apt1","Apt2","Apt3","Apt4","Apt5"};
		cb3 = new JComboBox();
		// for(int k=1;k<=5;k++)
		// {
			// cb3.addItem(k);
		// }
		cb3.setLocation(200,20);
		cb3.setSize(200,30);
		cb3.setFont(f1);
		add(cb3);
		
		SwingConstants sc=new SwingConstants(){};
		i = new ImageIcon("panel_but.png");
		// b1.addActionListener(this);
		
		b2=new JButton("Back",i);
		b2.setBounds(30,485,220,200);	
		b2.setHorizontalTextPosition(sc.CENTER);
		b2.setForeground(Color.black);
		b2.setOpaque(false);
		b2.setFont(f1);
		b2.setContentAreaFilled(false);
		b2.setBorderPainted(false);
		add(b2);
		
		// b3=new JButton("Search",i);
		// b3.setBounds(500,485,220,200);	
		// b3.setHorizontalTextPosition(sc.CENTER);
		// b3.setForeground(Color.black);
		// b3.setOpaque(false);
		// b3.setFont(f1);
		// b3.setContentAreaFilled(false);
		// b3.setBorderPainted(false);
		// add(b3);
		// b3.addActionListener(this);
		
		// b1=new JButton(i);
		// b1.setBounds(1000,400,220,200);
		// b1.setHorizontalTextPosition(sc.CENTER);
		// b1.setForeground(Color.black);
		// b1.setOpaque(false);
		// b1.setFont(f1);
		// b1.setContentAreaFilled(false);
		// b1.setBorderPainted(false);
		// add(b1);
		cb3.addItemListener(this);
	
		 // create the components...
    // create a panel to hold all the components
    JPanel contentPanel = new JPanel(null);
	// contentPanel.setBackground(Color.black); 
    contentPanel.setPreferredSize(new Dimension(800, 1000)); // set the preferred size of the content panel
    contentPanel.add(lb1);
    contentPanel.add(tx11);
    contentPanel.add(lb2);
    contentPanel.add(lb12);
    contentPanel.add(tx2);
    contentPanel.add(lb3);
    contentPanel.add(tx3);
    contentPanel.add(lb4);
    contentPanel.add(tx4);
    contentPanel.add(lb5);
    contentPanel.add(tx5);
    contentPanel.add(lb6);
    contentPanel.add(tx6);
    contentPanel.add(lb7);
    contentPanel.add(lb12);
    contentPanel.add(cb3);

    JScrollPane scrollPane = new JScrollPane(contentPanel);
    scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    scrollPane.setBounds(30, 30, 900, 620);
    // add the scroll pane to the main panel
	add(scrollPane);
	
	
	}
	public void itemStateChanged(ItemEvent e)
	{
		
		String g=""+FDemo.globle;
				String sc = (String)cb3.getSelectedItem();
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?useSSL=false&AllowPublicKeyRetrieval=true","root","root");
					Statement st = con.createStatement();
					String s11="Select * from "+g+" where QID='"+sc+"'";
					ResultSet rs = st.executeQuery(s11);
					while(rs.next())
					{
					// cb3.addItem(rs.getString(1));
					tx2.setText(rs.getString(2));
					tx3.setText(rs.getString(3));
					tx4.setText(rs.getString(4));
					tx5.setText(rs.getString(5));
					tx6.setText(rs.getString(6));
					lb12.setText(rs.getString(7));
					}
					
					con.close();
				}
				catch(Exception e1)
				{
					System.out.println(e1);
					JOptionPane.showMessageDialog(null,e1.getMessage(),"Message",JOptionPane.INFORMATION_MESSAGE);
				}
		
		
		// String sc = (String)cb3.getSelectedItem();
				// try
				// {
					// Class.forName("com.mysql.cj.jdbc.Driver");
					// Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?useSSL=false","root","Root");
					// Statement st = con.createStatement();
					// ResultSet rs = st.executeQuery("Select * from qcrse where Qid = '" + sc + "'");
					// while(rs.next())
					// {
					// tx2.setText(rs.getString(2));
					// tx3.setText(rs.getString(3));
					// tx4.setText(rs.getString(4));
					// tx5.setText(rs.getString(5));
					// tx6.setText(rs.getString(6));
					// lb12.setText(rs.getString(7));
					// }
					
					// con.close();
				// }
				// catch(Exception e1)
				// {
					// System.out.println(e1);
					// JOptionPane.showMessageDialog(null,e1.getMessage(),"Message",JOptionPane.INFORMATION_MESSAGE);
				// }
	}
	public void paintComponent(Graphics g1)
	{
		i2=new ImageIcon("menu_bg.jpg");
	    Image d1=i2.getImage();
		g1.drawImage(d1,0,0,this);
		
		g1.drawRect(30,30,800,600);
	}
	public void actionPerformed(ActionEvent e)
	{
			// if(e.getSource()==b3)
			// {
				// String g=""+FDemo.globle;
				// String sc = (String)cb3.getSelectedItem();
				// try
				// {
					// Class.forName("com.mysql.cj.jdbc.Driver");
					// Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?useSSL=false","root","Root");
					// Statement st = con.createStatement();
					// String s11="Select * from "+g+" where QID='"+sc+"'";
					// ResultSet rs = st.executeQuery(s11);
					// while(rs.next())
					// {
					// tx2.setText(rs.getString(2));
					// tx3.setText(rs.getString(3));
					// tx4.setText(rs.getString(4));
					// tx5.setText(rs.getString(5));
					// tx6.setText(rs.getString(6));
					// lb12.setText(rs.getString(7));
					// }
					
					// con.close();
				// }
				// catch(Exception e1)
				// {
					// System.out.println(e1);
					// JOptionPane.showMessageDialog(null,e1.getMessage(),"Message",JOptionPane.INFORMATION_MESSAGE);
				// }
			// }
			
	}
}


class UpdateDemo extends JPanel implements ActionListener,ItemListener
{
	Mng_Course mcr = new Mng_Course();
	JLabel lb1,lb2,lb3,lb4,lb5,lb6,lb7,lb8,lb9,lb10,lb11,lb12;
	JTextField tx1,tx3,tx4,tx5,tx6,tx7,tx8,tx9,tx10,tx11;
	JTextArea tx2;
	JButton b1,b2,b3,b4;
	JComboBox cb1,cb2,cb3;
	ImageIcon i,i2;
		
	UpdateDemo()
	{
		setLayout(null);
		
		Font f1=new Font("", Font.ITALIC, 20);
		
		Font f2=new Font("", Font.ITALIC, 25);
		
		tx11 = new JTextField(10);
		tx11.setBounds(480,20,260,35);
		tx11.setFont(f2);
		add(tx11);
		
		// lb13 = new JLabel();
		// lb13.setBounds(400,50,200,30);
		// lb13.setForeground(Color.black);
		// lb13.setFont(f1);
		// add(lb13);
		
		lb1 = new JLabel("Question ID:");
		lb1.setBounds(50,20,200,30);
		lb1.setForeground(Color.black);
		lb1.setFont(f1);	
		add(lb1);
		
		lb2 = new JLabel("Question");
		lb2.setBounds(50,100,300,30);
		lb2.setForeground(Color.black);
		lb2.setFont(f1);
		add(lb2);
		tx2 = new JTextArea();
		tx2.setBounds(200,100,550,120);
		tx2.setFont(f1);
		tx2.setLineWrap(true);
        tx2.setWrapStyleWord(true);
		add(tx2);
		
		lb12 = new JLabel("Statement:");
		lb12.setBounds(80,160,300,30);
		lb12.setForeground(Color.black);
		lb12.setFont(f1);
		add(lb12);
		
		lb3 = new JLabel("Option A");
		lb3.setBounds(50,250,100,30);
		lb3.setForeground(Color.black);
		lb3.setFont(f1);
		add(lb3);
		tx3 = new JTextField(10);
		tx3.setBounds(200,250,200,25);
		tx3.setFont(f1);
		add(tx3);
		
		lb4 = new JLabel("Option B");
		lb4.setBounds(50,300,100,30);
		lb4.setForeground(Color.black);
		lb4.setFont(f1);
		add(lb4);
		tx4 = new JTextField(10);
		tx4.setBounds(200,300,200,25);
		tx4.setFont(f1);
		add(tx4);
		
		lb5 = new JLabel("Option C");
		lb5.setBounds(50,350,100,30);
		lb5.setForeground(Color.black);
		lb5.setFont(f1);
		add(lb5);
		tx5 = new JTextField(10);
		tx5.setBounds(200,350,200,25);
		tx5.setFont(f1);
		add(tx5);
		
		lb6 = new JLabel("Option D");
		lb6.setBounds(50,400,100,30);
		lb6.setForeground(Color.black);
		lb6.setFont(f1);
		add(lb6);
		tx6 = new JTextField(10);
		tx6.setBounds(200,400,200,25);
		tx6.setFont(f1);
		add(tx6);
		
		lb7 = new JLabel("Correct Option: ");
		lb7.setBounds(50,450,200,30);
		lb7.setForeground(Color.black);
		lb7.setFont(f1);
		add(lb7);
		
		lb12 = new JLabel();
		lb12.setBounds(250,450,300,30);
		lb12.setForeground(Color.black);
		lb12.setFont(f1);
		add(lb12);
		
		// lb8 = new JLabel("Course Name");
		// lb8.setBounds(950,100,300,30);
		// lb8.setForeground(Color.black);
		// lb8.setFont(f1);
		// add(lb8);
		// tx7 = new JTextField(10);
		// tx7.setBounds(1100,100,150,30);
		// tx7.setFont(f1);
		// add(tx7);
		       
		// lb9 = new JLabel("Time");
		// lb9.setBounds(1100,150,300,30);
		// lb9.setForeground(Color.black);
		// lb9.setFont(f1);
		// add(lb9);
		// tx8 = new JTextField(10);
		// tx8.setBounds(1000,200,50,30);
		// tx8.setFont(f1);
		// add(tx8);
		
		// tx9 = new JTextField(10);
		// tx9.setBounds(1100,200,50,30);
		// tx9.setFont(f1);
		// add(tx9);
		
		// tx10 = new JTextField(10);
		// tx10.setBounds(1200,200,50,30);
		// tx10.setFont(f1);
		// add(tx10);
		
		// lb10 = new JLabel("Each Mark");
		// lb10.setBounds(950,280,300,30);
		// lb10.setForeground(Color.black);
		// lb10.setFont(f1);
		// add(lb10);
		
		// lb11 = new JLabel("Total Questions:   ");
		// lb11.setBounds(1000,350,300,30);
		// lb11.setForeground(Color.black);
		// lb11.setFont(f1);
		// add(lb11);
		
		// String s[] = {"Option A","Option B","Option C","Option D"};
		// cb1 = new JComboBox(s);
		// for(int i=1;i<=20;i++)
		// {
			// cb1.additem(i);
		// }
		// cb1.setLocation(380,500);
		// cb1.setSize(200,30);
		// cb1.setFont(f1);
		// add(cb1);
		
		// cb2 = new JComboBox();
		// for(int j=1;j<=10;j++)
		// {
			// cb2.addItem(j);
		// }
		// cb2.setLocation(1100,280);
		// cb2.setSize(200,30);
		// cb2.setFont(f1);
		// add(cb2);
		
		cb1 = new JComboBox();
		cb1.setLocation(200,20);
		cb1.setSize(200,30);
		cb1.setFont(f1);
		add(cb1);
		cb1.addItemListener(this);
		
		SwingConstants sc=new SwingConstants(){};
		i = new ImageIcon("panel_but.png");
		
		b1=new JButton("SAVE",i);
		b1.setBounds(500,320,220,200);	
		b1.setHorizontalTextPosition(sc.CENTER);
		b1.setForeground(Color.black);
		b1.setOpaque(false);
		b1.setFont(f1);
		b1.setContentAreaFilled(false);
		b1.setBorderPainted(false);
		add(b1);
		b1.addActionListener(this);
		
		b2=new JButton("Back",i);
		b2.setBounds(30,485,220,200);	
		b2.setHorizontalTextPosition(sc.CENTER);
		b2.setForeground(Color.black);
		b2.setOpaque(false);
		b2.setFont(f1);
		b2.setContentAreaFilled(false);
		b2.setBorderPainted(false);
		add(b2);
		
		// b4=new JButton("Search",i);
		// b4.setBounds(500,485,220,200);	
		// b4.setHorizontalTextPosition(sc.CENTER);
		// b4.setForeground(Color.black);
		// b4.setOpaque(false);
		// b4.setFont(f1);
		// b4.setContentAreaFilled(false);
		// b4.setBorderPainted(false);
		// add(b4);
		// b4.addActionListener(this);
		
		String s[] = {"Option A","Option B","Option C","Option D"};
		cb2 = new JComboBox(s);
		cb2.setLocation(200,450);
		cb2.setSize(200,30);
		cb2.setFont(f1);
		add(cb2);
		
		 // create the components...
		// create a panel to hold all the components
		JPanel contentPanel = new JPanel(null);
		// contentPanel.setBackground(Color.black); 
		contentPanel.setPreferredSize(new Dimension(800, 1000)); // set the preferred size of the content panel
		contentPanel.add(lb1);
		contentPanel.add(tx11);
		contentPanel.add(lb2);
		contentPanel.add(lb12);
		contentPanel.add(tx2);
		contentPanel.add(lb3);
		contentPanel.add(tx3);
		contentPanel.add(lb4);
		contentPanel.add(tx4);
		contentPanel.add(lb5);
		contentPanel.add(tx5);
		contentPanel.add(lb6);
		contentPanel.add(tx6);
		contentPanel.add(lb7);
		contentPanel.add(lb12);
		contentPanel.add(cb1);
		contentPanel.add(cb2);

		// create a JScrollPane and add the content panel to it
		JScrollPane scrollPane = new JScrollPane(contentPanel);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(30, 30, 900, 620);
		// add the scroll pane to the main panel
		add(scrollPane);

		// b3=new JButton("SAVE",i);
		// b3.setBounds(1000,400,220,200);	
		// b3.setHorizontalTextPosition(sc.CENTER);
		// b3.setForeground(Color.black);
		// b3.setOpaque(false);
		// b3.setFont(f1);
		// b3.setContentAreaFilled(false);
		// b3.setBorderPainted(false);
		// add(b3);
		
		// b1.addActionListener(this);
		b2.addActionListener(this);
		// b4.addActionListener(this);
		// cb1.addItemListener(this);
		// cb2.addItemListener(this);
		
	}
	public void paintComponent(Graphics g1)
	{
		i2=new ImageIcon("menu_bg.jpg");
	    Image d1=i2.getImage();
		g1.drawImage(d1,0,0,this);
		
		g1.drawRect(30,30,800,600);
	}
	public void itemStateChanged(ItemEvent e)
	{
		// String sc = (String)cb1.getSelectedItem();
		
		String ss=(String)cb1.getSelectedItem();
		String g=""+FDemo.globle;
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?useSSL=false&AllowPublicKeyRetrieval=true","root","root");
					Statement st = con.createStatement();
					String s11="Select * from "+g+" where QID='"+ss+"'";
					ResultSet rs = st.executeQuery(s11);
					while(rs.next())
					{
					tx2.setText(rs.getString(2));
					tx3.setText(rs.getString(3));
					tx4.setText(rs.getString(4));
					tx5.setText(rs.getString(5));
					tx6.setText(rs.getString(6));
					cb2.setSelectedItem(rs.getString(7));
					}
					
					con.close();
				}
				catch(Exception e1)
				{
					System.out.println(e1);
					JOptionPane.showMessageDialog(null,e1.getMessage(),"Message",JOptionPane.INFORMATION_MESSAGE);
				}
	}
	public void actionPerformed(ActionEvent e)
	{
		
		// if(e.getSource() == b2)
		// {
			// String s7 = tx7.getText();
			// String s8 = tx8.getText();
			// String s9 = tx9.getText();
			// String s10 = tx10.getText();
			// String s11 = cb2.getSelectedItem().toString();
			
			// String sc = mcr.ch1.getSelectedItem();
			
			// try
			// {
				// Class.forName("com.mysql.cj.jdbc.Driver");
				// Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?useSSL=false","root","Root");
				// Statement st = con.createStatement();
				// st.executeUpdate("UPDATE addcrse SET hour '"+s8+"',min = '"+s9+"',sec = '"+s10+"',emrk = '"+s11+"' where cname='"+s7+"' ");
				// JOptionPane.showMessageDialog(null,"Course Data inserted");
				// con.close();
			// }
			// catch(Exception e1)
			// {
				// System.out.println(e1);
				// JOptionPane.showMessageDialog(null,e1.getMessage(),"Message",JOptionPane.INFORMATION_MESSAGE);
			// }
		// }
		
		if(e.getSource() == b1)
		{
			String g=""+FDemo.globle;
			String ss=(String)cb1.getSelectedItem();
			
			String s1 = (String)cb1.getSelectedItem();
			String s2 = tx2.getText();
			String s3 = tx3.getText();
			String s4 = tx4.getText();
			String s5 = tx5.getText();
			String s6 = tx6.getText();
			String s7 = cb2.getSelectedItem().toString();
			
			if(s1.equals("")||s2.equals("")||s3.equals("")||s4.equals("")||s5.equals("")||s6.equals(""))
			{
				JOptionPane.showMessageDialog(null,"All Fields are Mandotory");
			}
			else
			{
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?useSSL=false&AllowPublicKeyRetrieval=true","root","root");
					Statement st = con.createStatement();
					String s22="update "+g+" set QStatement='"+s2+"'  , A='"+s3+"'  , B='"+s4+"'   ,  C='"+s5+"'   , D='"+s6+"' ,   COption='"+s7+"' where QID='"+s1+"' ";
					st.executeUpdate(s22);
					JOptionPane.showMessageDialog(null,"data updated");
					
					// tx1.setText("");
					tx2.setText("");
					tx3.setText("");
					tx4.setText("");
					tx5.setText("");
					tx6.setText("");
					cb1.setSelectedItem("Option A");
					
					con.close();
				}
				catch(Exception e2)
				{
					System.out.println(e2);
					JOptionPane.showMessageDialog(null,e2.getMessage(),"Message",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		}
		
	}
}

class RemoveDemo extends JPanel implements ItemListener
{
	Mng_Course mcr = new Mng_Course();
	JLabel lb1,lb2,lb3,lb4,lb5,lb6,lb7,lb8,lb9,lb10,lb11,lb12;
	JTextField tx1,tx3,tx4,tx5,tx6,tx7,tx8,tx9,tx10,tx11;
	JTextArea tx2;
	JButton b1,b2,b3,b4;
	JComboBox cb1,cb2,cb3;
	ImageIcon i,i2;
		
		
	RemoveDemo()
	{
		setLayout(null);
		
		
		Font f1=new Font("", Font.ITALIC, 20);
		Font f2=new Font("", Font.ITALIC, 25);
		
		tx11 = new JTextField(10);
		tx11.setBounds(480,20,260,35);
		tx11.setFont(f2);
		add(tx11);
		
		// lb13 = new JLabel();
		// lb13.setBounds(400,50,200,30);
		// lb13.setForeground(Color.black);
		// lb13.setFont(f1);
		// add(lb13);
		
		lb1 = new JLabel("Question ID:");
		lb1.setBounds(50,20,200,30);
		lb1.setForeground(Color.black);
		lb1.setFont(f1);	
		add(lb1);
		
		lb2 = new JLabel("Question");
		lb2.setBounds(50,100,300,30);
		lb2.setForeground(Color.black);
		lb2.setFont(f1);
		add(lb2);
		tx2 = new JTextArea();
		tx2.setBounds(200,100,550,120);
		tx2.setFont(f1);
		tx2.setLineWrap(true);
        tx2.setWrapStyleWord(true);
		add(tx2);
		
		lb12 = new JLabel("Statement:");
		lb12.setBounds(80,160,300,30);
		lb12.setForeground(Color.black);
		lb12.setFont(f1);
		add(lb12);
		
		lb3 = new JLabel("Option A");
		lb3.setBounds(50,250,100,30);
		lb3.setForeground(Color.black);
		lb3.setFont(f1);
		add(lb3);
		tx3 = new JTextField(10);
		tx3.setBounds(200,250,200,25);
		tx3.setFont(f1);
		add(tx3);
		
		lb4 = new JLabel("Option B");
		lb4.setBounds(50,300,100,30);
		lb4.setForeground(Color.black);
		lb4.setFont(f1);
		add(lb4);
		tx4 = new JTextField(10);
		tx4.setBounds(200,300,200,25);
		tx4.setFont(f1);
		add(tx4);
		
		lb5 = new JLabel("Option C");
		lb5.setBounds(50,350,100,30);
		lb5.setForeground(Color.black);
		lb5.setFont(f1);
		add(lb5);
		tx5 = new JTextField(10);
		tx5.setBounds(200,350,200,25);
		tx5.setFont(f1);
		add(tx5);
		
		lb6 = new JLabel("Option D");
		lb6.setBounds(50,400,100,30);
		lb6.setForeground(Color.black);
		lb6.setFont(f1);
		add(lb6);
		tx6 = new JTextField(10);
		tx6.setBounds(200,400,200,25);
		tx6.setFont(f1);
		add(tx6);
		
		lb7 = new JLabel("Correct Option: ");
		lb7.setBounds(50,450,200,30);
		lb7.setForeground(Color.black);
		lb7.setFont(f1);
		add(lb7);
		
		lb12 = new JLabel();
		lb12.setBounds(250,450,300,30);
		lb12.setForeground(Color.black);
		lb12.setFont(f1);
		add(lb12);
		
		// lb8 = new JLabel("Course Name");
		// lb8.setBounds(950,100,300,30);
		// lb8.setForeground(Color.black);
		// lb8.setFont(f1);
		// add(lb8);
		// tx7 = new JTextField(10);
		// tx7.setBounds(1100,100,150,30);
		// tx7.setFont(f1);
		// add(tx7);
		       
		// lb9 = new JLabel("Time");
		// lb9.setBounds(1100,150,300,30);
		// lb9.setForeground(Color.black);
		// lb9.setFont(f1);
		// add(lb9);
		// tx8 = new JTextField(10);
		// tx8.setBounds(1000,200,50,30);
		// tx8.setFont(f1);
		// add(tx8);
		
		// tx9 = new JTextField(10);
		// tx9.setBounds(1100,200,50,30);
		// tx9.setFont(f1);
		// add(tx9);
		
		// tx10 = new JTextField(10);
		// tx10.setBounds(1200,200,50,30);
		// tx10.setFont(f1);
		// add(tx10);
		
		// lb10 = new JLabel("Each Mark");
		// lb10.setBounds(950,280,300,30);
		// lb10.setForeground(Color.black);
		// lb10.setFont(f1);
		// add(lb10);
		
		// lb11 = new JLabel("Total Questions:   ");
		// lb11.setBounds(1000,350,300,30);
		// lb11.setForeground(Color.black);
		// lb11.setFont(f1);
		// add(lb11);
		
		// String s[] = {"Option A","Option B","Option C","Option D"};
		// cb1 = new JComboBox(s);
		// for(int i=1;i<=20;i++)
		// {
			// cb1.additem(i);
		// }
		// cb1.setLocation(380,500);
		// cb1.setSize(200,30);
		// cb1.setFont(f1);
		// add(cb1);
		
		// cb2 = new JComboBox();
		// for(int j=1;j<=10;j++)
		// {
			// cb2.addItem(j);
		// }
		// cb2.setLocation(1100,280);
		// cb2.setSize(200,30);
		// cb2.setFont(f1);
		// add(cb2);
		SwingConstants sc=new SwingConstants(){};
		i = new ImageIcon("panel_but.png");
		
		b1=new JButton("REMOVE",i);
		b1.setBounds(500,320,220,200);	
		b1.setHorizontalTextPosition(sc.CENTER);
		b1.setForeground(Color.black);
		b1.setOpaque(false);
		b1.setFont(f1);
		b1.setContentAreaFilled(false);
		b1.setBorderPainted(false);
		add(b1);
		
		b2=new JButton("Back",i);
		b2.setBounds(30,485,220,200);	
		b2.setHorizontalTextPosition(sc.CENTER);
		b2.setForeground(Color.black);
		b2.setOpaque(false);
		b2.setFont(f1);
		b2.setContentAreaFilled(false);
		b2.setBorderPainted(false);
		add(b2);
		
		// b3=new JButton("Search",i);
		// b3.setBounds(500,485,220,200);	
		// b3.setHorizontalTextPosition(sc.CENTER);
		// b3.setForeground(Color.black);
		// b3.setOpaque(false);
		// b3.setFont(f1);
		// b3.setContentAreaFilled(false);
		// b3.setBorderPainted(false);
		// add(b3);
		
		String s[] = {"Option A","Option B","Option C","Option D"};
		cb1 = new JComboBox(s);
		cb1.setLocation(200,450);
		cb1.setSize(200,30);
		cb1.setFont(f1);
		add(cb1);
		
		cb3 = new JComboBox();
		cb3.setLocation(200,20);
		cb3.setSize(200,30);
		cb3.setFont(f1);
		add(cb3);
		cb3.addItemListener(this);
	
		 // create the components...
		// create a panel to hold all the components
		JPanel contentPanel = new JPanel(null);
		// contentPanel.setBackground(Color.black); 
		contentPanel.setPreferredSize(new Dimension(800, 1000)); // set the preferred size of the content panel
		contentPanel.add(lb1);
		contentPanel.add(tx11);
		contentPanel.add(lb2);
		contentPanel.add(lb12);
		contentPanel.add(tx2);
		contentPanel.add(lb3);
		contentPanel.add(tx3);
		contentPanel.add(lb4);
		contentPanel.add(tx4);
		contentPanel.add(lb5);
		contentPanel.add(tx5);
		contentPanel.add(lb6);
		contentPanel.add(tx6);
		contentPanel.add(lb7);
		contentPanel.add(lb12);
		contentPanel.add(cb1);
		contentPanel.add(cb3);

		// create a JScrollPane and add the content panel to it
		JScrollPane scrollPane = new JScrollPane(contentPanel);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(30, 30, 900, 620);
		// add the scroll pane to the main panel
		add(scrollPane);

		
		// b1.addActionListener(this);
		// b3.addActionListener(this);
		
		
	}
	public void itemStateChanged(ItemEvent e)
	{
		if(e.getSource() == cb3)
		{
			// String s1 = tx11.getText();
			// String sc = (String)cb3.getSelectedItem();
			
			String ss=(String)cb3.getSelectedItem();
			String g=""+FDemo.globle;
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?useSSL=false&AllowPublicKeyRetrieval=true","root","root");
					Statement st = con.createStatement();
					 String s11="Select * from "+g+" where QID='"+ss+"'";
					ResultSet rs = st.executeQuery(s11);
					while(rs.next())
					{
					tx2.setText(rs.getString(2));
					tx3.setText(rs.getString(3));
					tx4.setText(rs.getString(4));
					tx5.setText(rs.getString(5));
					tx6.setText(rs.getString(6));
					cb1.setSelectedItem(rs.getString(7));
					}
					
					con.close();
				}
				catch(Exception e1)
				{
					System.out.println(e1);
					JOptionPane.showMessageDialog(null,e1.getMessage(),"Message",JOptionPane.INFORMATION_MESSAGE);
				}
			
		}
	}
	public void paintComponent(Graphics g1)
	{
		i2=new ImageIcon("menu_bg.jpg");
	    Image d1=i2.getImage();
		g1.drawImage(d1,0,0,this);
		
		g1.drawRect(30,30,800,600);
	}
	
	// public void actionPerformed(ActionEvent e)
	// {
		// if(e.getSource() == b1)
		// {
			// String sc = mcr.ch1.getSelectedItem();
			// String s1 = cb3.getSelectedItem().toString();
			
			// try
			// {
				// Class.forName("com.mysql.cj.jdbc.Driver");
				// Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?useSSL=false","root","Root");
				// Statement st = con.createStatement();
				// st.executeUpdate("Delete from qcrse where Qid = '" + s1 + "'");
				// JOptionPane.showMessageDialog(null,"Data deleted");
				// con.close();
				
				// cb1.removeItem(s1);
			// }
			// catch(Exception e1)
			// {
				// System.out.println(e1);
				// JOptionPane.showMessageDialog(null,e1.getMessage(),"Message",JOptionPane.INFORMATION_MESSAGE);
			// }
		// }
		// if(e.getSource() == b3)
		// {
				// String sc = (String)cb3.getSelectedItem();
				
				// String g=""+FDemo.globle;
				
				// try
				// {
					// Class.forName("com.mysql.cj.jdbc.Driver");
					// Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?useSSL=false","root","Root");
					// Statement st = con.createStatement();
					 // String s11="Select * from "+g+" where QID='"+sc+"'";
					// ResultSet rs = st.executeQuery(s11);
					// while(rs.next())
					// {
					// tx2.setText(rs.getString(2));
					// tx3.setText(rs.getString(3));
					// tx4.setText(rs.getString(4));
					// tx5.setText(rs.getString(5));
					// tx6.setText(rs.getString(6));
					// cb1.setSelectedItem(rs.getString(7));
					// }
					
					// con.close();
				// }
				// catch(Exception e1)
				// {
					// System.out.println(e1);
					// JOptionPane.showMessageDialog(null,e1.getMessage(),"Message",JOptionPane.INFORMATION_MESSAGE);
				// }
		// }
		// try
			// {
				// Class.forName("com.mysql.cj.jdbc.Driver");
				// Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?useSSL=false","root","Root");
				// Statement st = con.createStatement();
				// ResultSet rs = st.executeQuery("Select * from qcrse where subject = '" + s1 + "'");
				// while(rs.next())
				// {
				// cb3.setSelectedItem(rs.getString(1));
				// }
				
				// con.close();
			// }
			// catch(Exception e1)
			// {
				// System.out.println(e1);
			// }
	// }
}