import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

class Admin_RST extends JPanel
{
	JTabbedPane tb1;
	MyResult myR;
	JButton b1;
	JLabel l,l1;
	//JTable table;
	//DefaultTableModel model;
	ImageIcon img,img2,icon1;
	ImageIcon i,i2;
	Image  on,on2;
	
	Admin_RST()
	{
		
		Font f1=new Font("", Font.ITALIC, 20);
		Font f2=new Font("Courier New",Font.BOLD,30);
		// img=new ImageIcon("user.JPEG");
		// on=img.getImage();
		 
		// img2=new ImageIcon("result1.PNG");
		// on2=img2.getImage();
		
		 icon1 = new ImageIcon("update_icon_12.png");
		 setLayout(null); 
		 
			l1=new JLabel("RESULTS");
			l1.setBounds(600,2,400,100);
			l1.setForeground(Color.black);
			l1.setBackground(Color.black);
			l1.setFont(f2);
			// l1.setForeground(new Color(115,251,253));
			add(l1); 
		
			l1=new JLabel("");
			l1.setFont(f2);
			l1.setForeground(Color.red);
			l1.setBackground(Color.black);
			l1.setBounds(1000,10,100,100);
			add(l1);
			
			 tb1=new JTabbedPane();
			 tb1.setFont(f1);
			// tb1.setBackground(Color.red);
			 tb1.setBounds(50,50,1300,500);
			
			
			 myR=new MyResult();
			 tb1.addTab("AllR",icon1,myR); 
			 add(tb1);
		// Object[][] data={};
			// String[] columnNames={"Test" ,"TotalQuestion", " AttemptedQuestion ", "CorrectQ", "WrongQ", " MarksObtained "," TotalMarks"};				
		// model=new DefaultTableModel(data,columnNames);
		// //model.setColumnIdentifiers(columnNames);
					// table=new JTable(model);
					// //table.setSize(3000,1500);
					// //table.setLocation();
					// //setLayout(new GridLayout(7,1));
		
		// // panel=new JPanel();
			// add(new JScrollPane(table));
			// //add(new JPanel());
			// //add(panel);
			
		 // // setLayout(new GridLayout(7,7));
		// // Font f=new Font("",5,35);
		// // setLayout(null); 
		
			
		SwingConstants sc=new SwingConstants(){};
		i = new ImageIcon("panel_but.png");
		b1=new JButton("EXIT",i);
		// b1.setBounds(1050,550,220,200);	
		b1.setBounds(30,500,220,200);
		b1.setHorizontalTextPosition(sc.CENTER);
		b1.setForeground(Color.white);
		b1.setOpaque(false);
		b1.setFont(f1);
		b1.setContentAreaFilled(false);
		b1.setBorderPainted(false);
		add(b1);
		// b1.addActionListener(this);
		
		
			// b1=new JButton("EXIT");
			// b1.setFont(f1);
			// b1.setForeground(new Color(115,251,253));
			// b1.setBackground(Color.black);
			// b1.setBounds(1450,700,100,50);
			// add(b1);	
	}
	public void paintComponent(Graphics g)
	{
		i2=new ImageIcon("menu_bg.jpg");
		Image d1=i2.getImage();
		g.drawImage(d1,0,0,this);			
				
		// super.paintComponent(g);
		// g.drawImage(on,0,0,2000,1000,this);
		// g.drawImage(on2,1350,280,300,300,this);
	}



	}
	class MyResult extends JPanel
	{
		JTable table;
		DefaultTableModel model;
		ImageIcon img,img2;
		ImageIcon i,i2;
		Image  on,on2;
		
		// DefaultTableModel tableModel;
        DefaultTableCellRenderer cellRenderer;
		
		MyResult()
		{
			// img=new ImageIcon("menu_bg.JPEG");
			// on=img.getImage();
			
			setLayout(new BorderLayout());
			Object[][] data={};
			// String[] columnNames={"S.No","TestName" ,"TotalQuestion", " AttemptedQuestion ", "CorrectQ", "WrongQ", " MarksObtained "," TotalMarks"," Result"," Percentage"," TimeTaken"};				
			String[] columnNames={"S.No","UserName","TestName" ,"TotalQuestion", " AttemptedQuestion ", "CorrectQ", "WrongQ", " MarksObtained "," TotalMarks"," Result"," Percentage"};				
			model=new DefaultTableModel(data,columnNames);	
				table=new JTable(model);
				table.setBackground(Color.cyan);
				
				table.setPreferredScrollableViewportSize(table.getPreferredSize());
				table.getColumnModel().getColumn(0).setPreferredWidth(450);
				table.getColumnModel().getColumn(1).setPreferredWidth(1350);
				table.getColumnModel().getColumn(2).setPreferredWidth(1050);
				table.getColumnModel().getColumn(3).setPreferredWidth(750);
				table.getColumnModel().getColumn(4).setPreferredWidth(750);
				table.getColumnModel().getColumn(5).setPreferredWidth(750);
				table.getColumnModel().getColumn(6).setPreferredWidth(750);
				table.getColumnModel().getColumn(7).setPreferredWidth(850);
				table.getColumnModel().getColumn(8).setPreferredWidth(850);
				table.getColumnModel().getColumn(9).setPreferredWidth(850);
				table.getColumnModel().getColumn(10).setPreferredWidth(850);

				cellRenderer = new DefaultTableCellRenderer();
				cellRenderer.setHorizontalAlignment(JLabel.CENTER);
				table.getColumnModel().getColumn(0).setCellRenderer(cellRenderer);
				
				// table.setForeground(Color.yellow);
				// table.setBackground(Color.black);
				table.setRowHeight(30);
				add(new JScrollPane(table));
		
		}
		public void paintComponent(Graphics g)
		{
			i2=new ImageIcon("menu_bg.jpg");
			Image d1=i2.getImage();
			g.drawImage(d1,0,0,this);			
			
			// super.paintComponent(g);
			// g.drawImage(on,0,0,2000,1000,this);
		}
	}