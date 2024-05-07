import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

// import java.awt.Window;
// import javax.swing.JFrame;

// import QuesForm;

class FDemo extends JFrame implements ActionListener
{
	Welcome wel;
	Wel_next wnxt;
	Admin adm;
	User usr;
	
	// public static String globle=new String("");
	// static int x=0;
	// static int q=0;
    // int SNo=0;
	// static String QID="";
	// static String COption="";
	// static String ans="";
	// static String QIDP="";
	// static String COptionP="";
	// static String ansP="";
	// static int attemptedQuestion=0;
	// static int remaningQuestion=0;
	// static String name="";
	
	public static String rgln;
	public static String s11;
	// public static String answer;
	// public static String id;
	// public static int count;
	// public static int correct_cnt;
	// public static int wrong_cnt;
	// public static int attempt_cnt;
	// public static String mrks;
	// public static int obt_mrk;
	
	
	
	
	AdminPanel adpanel;
	Mng_Course mcr;
	Edit_Course edt;
	
	NewDemo nwdm;
	ViewDemo vwd;
	UpdateDemo upd;
	RemoveDemo rmv;
	
	Add_Course adcr;
	Users upage;
	User_Detail udl;
	Result_page rspge;
	Courses crs;
	CourseResult cresult;
	Verification vft;
	// ChangePwd cpw;
	
	//Registration on User Login
	Reg_form rgf;
	
	UserPanel up;
	User_REG_FORM urfm;
	QuesForm qf;
	Courses_user cusr;
	//Generate gt;
	// Users u;
	AllResults AllR;
	Result result;
	// UsersResult ur;

	// Quick_Result result;
	UserTest test;
	
	//Admin page Course's Result
	Admin_RST adrt;
	
	///////////////////////////////////////////////////	
	
	CardLayout card;
	Container cn;
	
	 public static String globle=new String("");
	 static int x=0;
	 static int q=0;
     int SNo=0;
	 
	static String QID="";
	 static String QIDP="";
	
	static String COption="";
   	 static String COptionP="";
	
	static String ans="";
	 static String ansP="";
	
	static int attemptedQuestion=0;
	static int remaningQuestion=0;
	static String name="";
	
	
	FDemo()
	{
		
		
		card = new CardLayout();
		setLayout(card);
		cn = getContentPane();
		
		wel = new Welcome();
		add("welc",wel);
		wnxt = new Wel_next();
		add("wnext",wnxt);
		adm = new Admin();
		add("admn",adm);
		usr = new User();
		add("user",usr);
		
		adpanel = new AdminPanel();
		add("adpnl",adpanel);
		mcr = new Mng_Course();
		add("mcrse",mcr);

		edt = new Edit_Course();
		add("edit",edt);

		adcr = new Add_Course();
		add("adcrse",adcr);
		upage = new Users();
		add("uspage",upage);
		udl = new User_Detail();
		add("usrdetail",udl);
		rspge = new Result_page();
		add("rsltpage",rspge);
		crs = new Courses();
		add("course",crs);
		cresult = new CourseResult();
		add("csrlt",cresult);
		vft = new Verification();
		add("vfytion",vft);
		// cpw = new ChangePwd();
		// add("cpswd",cpw);
		
		nwdm = new NewDemo();
		add("ndemo",nwdm);
		vwd = new ViewDemo();
		add("vdemo",vwd);
		
		up = new UserPanel();
		add("upn",up);
		rgf = new Reg_form();
		add("rgform",rgf);
		qf = new QuesForm();
		add("qform",qf);
		cusr = new Courses_user();
		add("csr",cusr);
		
		urfm = new User_REG_FORM();
		add("urfm",urfm);
		
		//gt=new Generate();
		//add("gt",gt);
		
		////////////////////
		
		// u=new Users();
		// add("u",u);
		
		AllR=new AllResults();
		add("AllR",AllR);		
		
		test=new UserTest();
		add("test",test);
	
		result=new Result();
		add("result",result);
			
		adrt = new Admin_RST();
		add("adrt",adrt);
				
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("desktop_icon.ico")));
		
		////////////////         Admin Panel         //////////////////////
		
		wel.b1.addActionListener(this);
		// wel.b2.addActionListener(this);
		wnxt.b1.addActionListener(this);
		wnxt.b2.addActionListener(this);
		
		adm.b1.addActionListener(this);
		adm.b3.addActionListener(this);
		usr.b1.addActionListener(this);
		usr.b3.addActionListener(this);
		usr.b4.addActionListener(this);
		
		adpanel.b1.addActionListener(this);
		adpanel.b2.addActionListener(this);
		adpanel.b3.addActionListener(this);
		adpanel.b4.addActionListener(this);
		adpanel.b5.addActionListener(this);		// verification button
		
		mcr.b1.addActionListener(this);		// DELETE BUTTON
		mcr.b2.addActionListener(this);		// EDIT COURSES BUTTON
		mcr.b3.addActionListener(this);		// BACK BUTTON
		mcr.b4.addActionListener(this);		// ADD COURSE BUTTON
		// mcr.b5.addActionListener(this);
		
		edt.nwd.b2.addActionListener(this);
		edt.nwd.b4.addActionListener(this);
		edt.view.b2.addActionListener(this);
		edt.upd.b2.addActionListener(this);
		// edt.upd.b4.addActionListener(this);
		edt.rmv.b2.addActionListener(this);
		
		
		adcr.b2.addActionListener(this);
		crs.b2.addActionListener(this);
		
		upage.b1.addActionListener(this);
		upage.b2.addActionListener(this);
		udl.b1.addActionListener(this);
		udl.b2.addActionListener(this);
		// udl.b3.addActionListener(this);
		
		adcr.b1.addActionListener(this);
		
		cresult.b1.addActionListener(this);
		
		crs.b1.addActionListener(this);
		vft.b1.addActionListener(this);			// search button
		vft.b2.addActionListener(this);			// back button
		vft.b3.addActionListener(this);			// verify button
		vft.b4.addActionListener(this);			// delete button
		
		nwdm.b1.addActionListener(this);
		// edt.view.b1.addActionListener(this);
		// edt.view.b3.addActionListener(this);
		// edt.rmv.b3.addActionListener(this);
		// vwd.b1.addActionListener(this);
		
		////////////////         User Panel         //////////////////////
		
		up.b1.addActionListener(this);
		up.b2.addActionListener(this);
		up.b5.addActionListener(this);
		up.b4.addActionListener(this);
		
		
		rgf.b2.addActionListener(this);
		upage.b1.addActionListener(this);
		
		qf.b1.addActionListener(this);
		// qf.b3.addActionListener(this);
		qf.b4.addActionListener(this);
		qf.b5.addActionListener(this);
		
		cusr.b1.addActionListener(this);
		cusr.b2.addActionListener(this);
		
		//user result back button
		rspge.b1.addActionListener(this);
		
		
		//Question test page
		test.b1.addActionListener(this);	 // previous button
		test.b2.addActionListener(this);	 // save/next button
		test.b3.addActionListener(this);	 // back button
		test.b4.addActionListener(this);	 // submit button
		
		//AllResult button
		AllR.b1.addActionListener(this);
		
		//result page(quick one) back button
		result.b1.addActionListener(this);
		
		//user registration back  button
		urfm.b2.addActionListener(this);
		
		//Admin page course result
		adrt.b1.addActionListener(this);

		
		////////////////////////////////////////////////////////////////////
		
		
		
		
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?allowPublicKeyRetrieval=true","root","root");
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("select * from course");
				while(rs.next())
				{
					mcr.ch1.addItem(rs.getString(1));
					up.cb1.addItem(rs.getString(1));
					up.cb1.getSelectedItem();
					cusr.cb1.addItem(rs.getString(1));
				}
				con.close();
				
			}
			catch(Exception e1)
			{
				JOptionPane.showMessageDialog(null,e1.getMessage(),"Message",JOptionPane.INFORMATION_MESSAGE);
				// System.out.println(e1);
			}	
			
			
	
	}
	
		

	
		public void nextQuestion(String sub)
		{
					String ques=(String)up.cb1.getSelectedItem();	
					// System.out.println("sub is "+sub);
				x+=1;
				q+=1; 
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?allowPublicKeyRetrieval=true","root","root");
					Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
					ResultSet rs=st.executeQuery("select * from "+sub+" ");
					
					rs.absolute(x);
					QID=""+rs.getString(1);
					
					test.t1.setText(rs.getString(2));
					test.l1.setText(rs.getString(3));
					test.l2.setText(rs.getString(4));
					test.l3.setText(rs.getString(5));
					test.l4.setText(rs.getString(6));
					// test.bg.clearSelection(); // clear radio button selection

					
					COption=""+rs.getString(7);
					card.show(cn,"test");
					rs=st.executeQuery("select * from test where QID='"+QID+"' ");
					if(rs.next())
					{
						 QIDP=rs.getString(1);
						 ansP=rs.getString(2);
						 COptionP=rs.getString(3);
					
					// /*	  System.out.println("if1.....");  */
						  if(ansP.equals("Option A"))
						  {
					// /*		System.out.println("A1");  	*/
							test.rb1.setSelected(true);
						  } 
						  else if(ansP.equals("Option B"))
						   {
					// /*		  System.out.println("B1");		*/
							  test.rb2.setSelected(true);
						    } 
						   else if(ansP.equals("Option C"))
							{
					// /*		   System.out.println("C1");	*/
							   test.rb3.setSelected(true);
							}
						   else if(ansP.equals("Option D"))
							{
					// /*			System.out.println("D1");	*/
								test.rb4.setSelected(true);
							} 
					}
				   else
					  test.bg.clearSelection();
					
						
				// /*	System.out.println(count1);		*/
					
					
					
					rs=st.executeQuery("select count(*) from test");
					rs.next();
					int count=rs.getInt(1);
					
				// /*	attemptedQuestion=count;	*/
					
					rs=st.executeQuery("select count(*) from "+ques+"");
					rs.next();
					int count1=rs.getInt(1);
					remaningQuestion=count1-count;
					
					test.l6.setText("Q Remaining : "+remaningQuestion);
					
					
					con.close();
				}
				catch(Exception e1)
				{
					System.out.println(e1);
				} 
		}
	
	public void actionPerformed(ActionEvent e)
	{
		String ques = (String)up.cb1.getSelectedItem();
		
		// JOptionPane dialog  = new JOptionPane();
		
		String sub=(String)up.cb1.getSelectedItem();		//subject for test
		ans = "";
		
		// S_main
		
		// String s201=Test.la.getText();
	    // Test.label1.setText(sub);				
		
		
		try
		{ 
		String s1=mcr.ch1.getSelectedItem();
	 	Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?allowPublicKeyRetrieval=true","root","root");
        Statement st=con.createStatement();
       
		nwdm.tx11.setText(s1);
   		
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
		
		//////////////////////////////////////
		
			
			if(e.getSource()==test.b2)
			{
				  if(test.rb1.isSelected())
					  {
					 ans="Option A";
					  } 
					 
					else if(test.rb2.isSelected())
					  {
					 ans="Option B";
					  } 
					 
					 else if(test.rb3.isSelected())
					  {
					 ans="Option C";
					  } 
					 
					 else if(test.rb4.isSelected())
					  {
					 ans="Option D";
					  } 
					  
					 // System.out.println("ans is "+ans);
					
					ResultSet rs = null; // declaring ResultSet object before try block
					 if(ans!="")
					 {
						 
					try
					{
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?useSSL=false&allowPublicKeyRetrieval=true","root","root");
						Statement st=con.createStatement();
						st.executeUpdate("insert into  test values ('"+QID+"','"+ans+"','"+COption+"')");
					 // System.out.println("QID is "+QID);
					 // System.out.println("ANS is "+ans);
					 // System.out.println("Coption is "+COption);
							// st.executeUpdate("insert into  test values ('"+QID+"','"+ans+"','"+COption+"')");
						
							// rs.absolute(x);
						
						// if(rs.next())
						// if(rs.next())
						// {
						// st.executeUpdate("update test set ans='"+ans+"' , COption='"+COption+"' where QID='"+QID+"'"); 
						// }
						// else if(ans!="")
						// {
							// st.executeUpdate("insert into  test values ('"+QID+"','"+ans+"','"+COption+"')");
						// }
						
						// ResultSet rs;
						
							rs=st.executeQuery("select count(*) from test");
							rs.next();
							// System.out.println("r1");
							int count=rs.getInt(1);
							attemptedQuestion=count;
							
							rs=st.executeQuery("select count(*) from "+ques+"");
							rs.next();
							// System.out.println("r2");
							int count1=rs.getInt(1);
							remaningQuestion=count1-count;
							// System.out.println("r3");
							
						con.close();
						}
						catch(Exception e1)
						{
							System.out.println(e1);
						}
					}
					// System.out.println(count1);
					
					nextQuestion(ques);
					test.lq.setText("Q."+x);
					test.l5.setText("Q Attempted : "+attemptedQuestion);
					test.l6.setText("Q Remaining : "+remaningQuestion);

		    }
		   
		   
    if(e.getSource()==test.b1)
	{
			
			x-=1;
			q-=1;
			QIDP="";  
				
			try
			{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?useSSL=false&allowPublicKeyRetrieval=true","root","root");
			Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs=st.executeQuery("select * from "+ques+" ");
			rs.absolute(x);
				 QID=""+rs.getString(1);
			    test.t1.setText(rs.getString(2));
				test.l1.setText(rs.getString(3));
				test.l2.setText(rs.getString(4));
				test.l3.setText(rs.getString(5));
				test.l4.setText(rs.getString(6));	
				COption=""+rs.getString(7);
			rs=st.executeQuery("select * from test where QID='"+QID+"' ");
             if(rs.next())
			 {
				 QIDP=rs.getString(1);
				 ansP=rs.getString(2);
				 COptionP=rs.getString(3);
			 }				 
			con.close();
			}
			catch(Exception e1)
			{
				JOptionPane.showMessageDialog(null,e1.getMessage(),"Message",JOptionPane.INFORMATION_MESSAGE);
				// System.out.println(e1);
			}
			test.bg.clearSelection();
			
			test.lq.setText("Q."+x);
			
			// System.out.println(QID);
			// System.out.println(QIDP);
			// System.out.println(ansP);
			// System.out.println(COptionP);
		   if(QIDP!="")
		   {
				  // System.out.println("if.....");
			  if(ansP.equals("Option A"))
			  {
				  // System.out.println("A");
			 test.rb1.setSelected(true);
		      } 
			 
			else if(ansP.equals("Option B"))
			  {
				  // System.out.println("B");
			 test.rb2.setSelected(true);

		      } 
			 
			 else if(ansP.equals("Option C"))
			  {
				  // System.out.println("c");
			  test.rb3.setSelected(true);

		      } 
			 
			 else if(ansP.equals("Option D"))
			  {
             // System.out.println("d");
			 test.rb4.setSelected(true);
		      } 
		   }	   
			
	}
		   
		   // if(e.getSource()==up.b4)
		   // {
				// test.t1.setText("");
				// test.l1.setText("");
				// test.l2.setText("");
				// test.l3.setText("");
				// test.l4.setText("");
				
				// card.show(cn,"test");
				// test.l.setText(ques.toUpperCase()+"  test");
				// nextQuestion(ques);
				// test.lq.setText("Q."+x);
				// test.l5.setText("Q Attempted : "+attemptedQuestion);
			// }
		

			if(e.getSource()==test.b4)
			{
				
				// name = 
				
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?useSSL=false&allowPublicKeyRetrieval=true","root","root");
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("select  count(*) from "+ques+"");
					rs.next();
					int total=rs.getInt(1);
					
					// System.out.println("total count is "+total);
					
					result.t1.setText(""+ques);
					result.t2.setText(""+total);
					rs=st.executeQuery("select count(*) from test");
					rs.next();
					int count=rs.getInt(1);
					// System.out.println("total count is "+count);
					result.t3.setText(""+count);
					
					rs=st.executeQuery("select count(*) from test where ans=COption");
					rs.next();
					int correct=rs.getInt(1);
					result.t4.setText(""+correct);
					 
					 int wrong=count-correct;
					System.out.println("wrong count is "+wrong);
					result.t5.setText(""+wrong);
					
					 int marksO=correct*5;				 
					float f1=marksO;
					result.t6.setText(""+marksO);
					System.out.println("marks opt is "+f1);
					
					 int marksT=total*5;
					float f2=marksT;			 
					result.t7.setText(""+marksT);
					System.out.println("marks tot is "+f2);
					
					float f=f1/f2*100;
					System.out.println("marks f val is "+f);
					String res="";
					if(f>=40.0f)
						res="PASS";
					else
					res="FAIL";
					String time="00";
					
					st.executeUpdate("insert into AllResult ( UserName,Test,TotalQuestion,AttemptedQuestion, CorrectQ, WrongQ, MarksObtained,TotalMarks, Result, Percentage,TimeTaken) values ('"+name+"','"+ques+"','"+total+"','"+count+"','"+correct+"','"+wrong+"','"+marksO+"','"+marksT+"','"+res+"','"+f+"','"+time+"')");
					//rs.absolute(x);
			  JOptionPane.showMessageDialog(test.b1,"Test Submit Successfuly","TestSubmit",JOptionPane.INFORMATION_MESSAGE);     

			  card.show(cn,"result");
					con.close();
				}
				catch(Exception e1)
				{
					System.out.println(e1);
			
				}
					
				
			}
		
		
			// if(e.getSource()==result.b1)
			// {
				// x=0;
				// q=0;
				// ans="";
				// COption="";
				// QID="";
				
				// attemptedQuestion=0;
					// try
					// {
					// Class.forName("com.mysql.cj.jdbc.Driver");
					// Connection con=DriverManager.getConnection("jdbc:mysql:///onlinedb","root","Root");
					// Statement st=con.createStatement();
					// st.executeUpdate("delete from test");
					// con.close();
					// }
					// catch(Exception e1)
					// {
						// System.out.println(e1);
					// }
				   // card.show(cn,"up");
			// }
			
			// if(e.getSource()==up.b2)
			// {
			// SNo=0;
				// try
					// {
					// Class.forName("com.mysql.cj.jdbc.Driver");
					// Connection con=DriverManager.getConnection("jdbc:mysql:///onlinedb","root","Root");
					// Statement st=con.createStatement();
					// ResultSet rs=st.executeQuery("select * from AllResult where UserName='"+name+"'");
					//model=new DefaultTableModel(data,columnNames);
					// AllR.myR.model.setRowCount(0);
					// while(rs.next())
					// {
						// SNo++;
						// System.out.println("a");
			
			// Object[] newRow={""+SNo,""+rs.getString(3),""+rs.getString(4),""+rs.getString(5),""+rs.getString(6),""+rs.getString(7),""+rs.getString(8),""+rs.getString(9),""+rs.getString(10),""+rs.getString(11),""+rs.getString(12)};
			// AllR.myR.model.addRow(newRow);
						
					// }
					// validate();

					// con.close();
				// card.show(cn,"AllR");
					// }
					// catch(Exception e1)
					// {
						// System.out.println(e1);
					// }
				
			// }
		
			
			
			
			
			
			
			
		
		
		
		/////////////////////////////////
		
		
		if(e.getSource() == wel.b1)
		{
			card.show(cn,"wnext");
		}
		if(e.getSource() == wnxt.b1)
		{
			card.show(cn,"admn");
		}
		if(e.getSource() == wnxt.b2)
		{
			card.show(cn,"user");
		}
		if(e.getSource() == adm.b1)
		{
			// card.show(cn,"adpnl");
			
			String s1 = adm.tx1.getText();
			String s2 = adm.tx2.getText();
			
			// System.out.println("Username is "+s1);
			// System.out.println("Password is "+s2);
			
			
			String username = adm.tx1.getText();
			String password = adm.tx2.getText();

			
			String usernamePattern = "^\\w{6,20}@\\w+\\.\\w+$";
			if (!username.matches(usernamePattern)) {
				JOptionPane.showMessageDialog(null, "Username must be in the format of 6-20 characters + @ + gmail.com.");
				return; // Exit the action listener if validation fails
			}

			String passwordPattern = "^(?=.*[a-zA-Z])(?=.*\\d)(?=.*[@#$%^&+=])(?=.*[0-9]).{8,}$";
			if (!password.matches(passwordPattern)) {
				JOptionPane.showMessageDialog(null, "Password must have at least 8 characters including at least one letter, one symbol (@#$%^&+=), one digit, and one of the numbers 0,1, 2, to 9.");
				return; // Exit the action listener if validation fails
			}

			
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?useSSL=false&allowPublicKeyRetrieval=true","root","root");
				
				// Statement st = con.createStatement();
				// ResultSet rs = st.executeQuery("select * from admin where uname='"+s1+"' AND upass='"+s2+"'");
				
				  PreparedStatement ps = con.prepareStatement("select * from admin where uname=? AND upass=?");
				  ps.setString(1, s1);
				  ps.setString(2, s2);
				  ResultSet rs = ps.executeQuery();

				
				if(rs.next())
				{
					card.show(cn,"adpnl");
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Invald id or password","error",JOptionPane.ERROR_MESSAGE);
				}
				adm.tx1.setText("");
				adm.tx2.setText("");
				
				con.close();
			}
			catch(Exception e1)
			{
				JOptionPane.showMessageDialog(null,e1.getMessage(),"Message",JOptionPane.INFORMATION_MESSAGE);
			}
		}
		if(e.getSource() == adm.b3)
		{
			card.show(cn,"wnext");
		}
		if(e.getSource() == usr.b1)
		{
			// card.show(cn,"upn");
			
			String s1 = usr.tx1.getText();
			String s2 = usr.tx2.getText();
			
			rgln = s1;
			name = s1;
			// System.out.println("Username is "+s1);
			// System.out.println("Password is "+s2);
		
			
			String username = usr.tx1.getText();
			String password = usr.tx2.getText();

			
			String usernamePattern = "^\\w{6,20}@\\w+\\.\\w+$";
			if (!username.matches(usernamePattern)) {
				JOptionPane.showMessageDialog(null, "Username must be in the format of 6-20 characters + @ + gmail.com.");
				return; // Exit the action listener if validation fails
			}

			String passwordPattern = "^(?=.*[a-zA-Z])(?=.*\\d)(?=.*[@#$%^&+=])(?=.*[0-9]).{8,}$";
			if (!password.matches(passwordPattern)) {
				JOptionPane.showMessageDialog(null, "Password must have at least 8 characters including at least one letter, one symbol (@#$%^&+=), one digit, and one of the numbers 0,1, 2, to 9.");
				return; // Exit the action listener if validation fails
			}

						
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?useSSL=false&allowPublicKeyRetrieval=true","root","root");
				
				// Statement st = con.createStatement();
				// ResultSet rs = st.executeQuery("select Username,Password from usrdtl where Username='"+s1+"' AND Password='"+s2+"'");
				
				
				  PreparedStatement ps = con.prepareStatement("select Username,Password from userdetail where Username=? AND Password=? AND verify='"+true+"'");
				  ps.setString(1, s1);
				  ps.setString(2, s2);
				  ResultSet rs = ps.executeQuery();

				if(rs.next())
				{
					card.show(cn,"upn");
					JOptionPane.showMessageDialog(null,"User successfully login");
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Invald id or password or VERIFY FIRST","error",JOptionPane.ERROR_MESSAGE);
				}
				usr.tx1.setText("");
				usr.tx2.setText("");
				con.close();
			}
			catch(Exception e1)
			{
				JOptionPane.showMessageDialog(null,e1.getMessage(),"Message",JOptionPane.INFORMATION_MESSAGE);
			}
			
			// user name working on user panel (title)
			// String s1 = (String)vft.cb1.getSelectedItem();
			// vft.cb1.removeAllItems();
			// String gender;
			
			String t1,t2,t3;
			
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?allowPublicKeyRetrieval=true","root","root");
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("Select * from userDetail where Username = '" + s1 + "' ");
				while(rs.next())
				{
					t1 = rs.getString(1);
					t2 = rs.getString(2);
					t3 = rs.getString(3);
					
					up.lname.setText(rs.getString(4));
					
				}
				con.close();
			}
			catch(Exception e1)
			{
				System.out.println(e1);
				JOptionPane.showMessageDialog(null,e1.getMessage(),"Message",JOptionPane.INFORMATION_MESSAGE);
			}
			
			
			
			
			
			
			
		}
		if(e.getSource() == usr.b3)
		{
			card.show(cn,"wnext");
		}
		if(e.getSource() == usr.b4)
		{
			card.show(cn,"rgform");
		}
		
		if(e.getSource() == adpanel.b1)
		{
			card.show(cn,"mcrse");
		}
		if(e.getSource() == adpanel.b2)
		{
			try
			{
				// mcr.ch1.removeAll();
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?useSSL=false&allowPublicKeyRetrieval=true","root","root");
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("select * from course");
				while(rs.next())
				{
					crs.cb1.addItem(rs.getString(1));
					// crs.cb1.getSelectedItem();
				}
				// rs.close();
				con.close();
				
			}
			catch(Exception e1)
			{
				JOptionPane.showMessageDialog(null,e1.getMessage(),"Message",JOptionPane.INFORMATION_MESSAGE);
				// System.out.println(e1);
			}	
					card.show(cn,"course");
		}
		if(e.getSource() == adpanel.b3)
		{
			card.show(cn,"admn");
			JOptionPane.showMessageDialog(null,"Successfully Logout","Message",JOptionPane.INFORMATION_MESSAGE);
		}
		if(e.getSource() == mcr.b1)
		{
			// card.show(cn,"adcrse");
			String s1 = mcr.ch1.getSelectedItem().toString();
			
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?useSSL=false&allowPublicKeyRetrieval=true","root","root");
				Statement st = con.createStatement();
				st.executeUpdate("Delete from course where subject = '" + s1 + "'");
				JOptionPane.showMessageDialog(null,"Course deleted");
				// mcr.cb1.addItem("");
				con.close();
				mcr.ch1.remove(s1);
				
			}
			catch(Exception e1)
			{
				System.out.println(e1);
				JOptionPane.showMessageDialog(null,e1.getMessage(),"Message",JOptionPane.INFORMATION_MESSAGE);
			}
			
		}
		if(e.getSource() == mcr.b3)
		{
			card.show(cn,"adpnl");
		}
		if(e.getSource() == mcr.b2)
		{
			
			s11= mcr.ch1.getSelectedItem();
			/////////////////////////////////////////////////////
			globle=mcr.ch1.getSelectedItem();
			
			edt.upd.cb1.removeAll();
			edt.view.cb3.removeAll();
			edt.rmv.cb3.removeAll();
		  
			  
				edt.rmv.tx2.setText("");
				edt.rmv.tx3.setText("");
				edt.rmv.tx4.setText("");
				edt.rmv.tx5.setText("");
				edt.rmv.tx6.setText("");
				edt.rmv.cb1.removeAll();
				
			edt.view.tx2.setText("");
			//view.tx1.setText("");
			edt.view.tx3.setText("");
			edt.view.tx4.setText("");
			edt.view.tx5.setText("");
			edt.view.tx6.setText("");
			edt.view.lb12.setText("");
			
			edt.upd.cb1.removeAll();
			edt.upd.tx2.setText("");
			edt.upd.tx3.setText("");
			edt.upd.tx4.setText("");
			edt.upd.tx5.setText("");
			edt.upd.tx6.setText("");
			edt.upd.lb12.setText("");
			edt.upd.cb2.removeAll();
			
			
			card.show(cn,"edit");
			   
			try
			 { 
			  // String g=""+FDemo.globle;
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?useSSL=false&allowPublicKeyRetrieval=true","root","root");
				Statement st=con.createStatement();
			   
			   String s1="select QID from "+globle+"";
			   ResultSet rs=st.executeQuery(s1);
			   
			   while(rs.next())
			   {
				   edt.view.cb3.addItem(rs.getString(1));	 
				   edt.rmv.cb3.addItem(rs.getString(1));	 
				   edt.upd.cb1.addItem(rs.getString(1));	 
				  // view.cb1.add(rs.getString(1));	 
				}
			 }
			
			 catch(Exception e1)
			 {
				 System.out.println(e1);
			 }
	 
			//////////////////////////////////////////////////
			edt.nwd.tx11.setText(s11);
			edt.view.tx11.setText(s11);
			edt.upd.tx11.setText(s11);
			edt.rmv.tx11.setText(s11);
			
			
			// try
			// {
				
				// Class.forName("com.mysql.cj.jdbc.Driver");
				// Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?useSSL=false","root","Root");
				// Statement st = con.createStatement();
				// ResultSet rs = st.executeQuery("Select * from subject where course = '"+ s11 +"'");
				// if(rs.next())
				// {
					// System.out.println(s11);
				// }
				// con.close();
				
			// }
			// catch(Exception e1)
			// {
				// System.out.println(e1);
				// JOptionPane.showMessageDialog(null,e1);
			// }
			
			
		}
		
		if(e.getSource() == mcr.b4)
		{
			card.show(cn,"adcrse");
		}
		
		// back button of manage courses page
		if(e.getSource() == edt.view.b2)
		{
			edt.upd.cb1.removeAllItems();
			edt.rmv.cb3.removeAllItems();
			edt.view.cb3.removeAllItems();
			card.show(cn,"mcrse");
		}
		if(e.getSource() == edt.upd.b2)
		{
			edt.rmv.cb3.removeAllItems();
			edt.view.cb3.removeAllItems();
			edt.upd.cb1.removeAllItems();
			card.show(cn,"mcrse");
		}
		if(e.getSource() == edt.rmv.b2)
		{
			edt.view.cb3.removeAllItems();
			edt.upd.cb1.removeAllItems();
			edt.rmv.cb3.removeAllItems();
			card.show(cn,"mcrse");
		}
		
		if(e.getSource() == edt.nwd.b4)
		{	
			
			// String sc = String.valueOf(mcr.cb1.getSelectedItem());
			try
			{
				String sc = edt.nwd.tx11.getText();
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?useSSL=false&allowPublicKeyRetrieval=true","root","root");
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("select * from course where course='"+sc+"'");
				while(rs.next())
				{
				edt.nwd.tx7.setText(rs.getString(1));
				edt.nwd.tx8.setText(rs.getString(2));
				edt.nwd.tx9.setText(rs.getString(3));
				edt.nwd.tx10.setText(rs.getString(4));
				edt.nwd.cb2.setSelectedItem(rs.getString(5));
				}
				// nwdm.tx1.setText("");
				// nwdm.tx2.setText("");
				// nwdm.tx3.setText("");
				// nwdm.tx4.setText("");
				// nwdm.cb1.setSelectedItem("");
				con.close();
			}
			catch(Exception e1)
			{
				System.out.println(e1);
				// JOptionPane.showMessageDialog(null,"Course added");
				JOptionPane.showMessageDialog(null,e1);
			}
		}
	// if(e.getSource() == edt.view.b3)
	// {
		// String s1 = edt.view.tx11.getText();
		// edt.view.cb3.removeAllItems();
		// try
		// {
			// Class.forName("com.mysql.cj.jdbc.Driver");
			// Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?useSSL=false","root","Root");
			// Statement st = con.createStatement();
			// ResultSet rs = st.executeQuery("Select * from qcrse where subject = '" + s1 + "'");
			// while(rs.next())
			// {
			// edt.view.cb3.addItem(rs.getString(1));
			// }
			
			
			// con.close();
		// }
		// catch(Exception e1)
		// {
			// System.out.println(e1);
			// JOptionPane.showMessageDialog(null,e1.getMessage(),"Message",JOptionPane.INFORMATION_MESSAGE);
		// }
		
		// String sc = (String)edt.view.cb3.getSelectedItem();
		// try
		// {
			// Class.forName("com.mysql.cj.jdbc.Driver");
			// Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?useSSL=false","root","Root");
			// Statement st = con.createStatement();
			// ResultSet rs = st.executeQuery("Select * from qcrse where Qid = '" + sc + "'");
			// while(rs.next())
			// {
					//edt.view.cb3.addItem(rs.getString(1));		//line not to be added
			// edt.view.tx2.setText(rs.getString(2));
			// edt.view.tx3.setText(rs.getString(3));
			// edt.view.tx4.setText(rs.getString(4));
			// edt.view.tx5.setText(rs.getString(5));
			// edt.view.tx6.setText(rs.getString(6));
			// edt.view.lb12.setText(rs.getString(7));
			// }
			
			// con.close();
		// }
		// catch(Exception e1)
		// {
			// System.out.println(e1);
		// }
	// }
	
	// if(e.getSource() == edt.view.b1)
	// {
		// String s1 = edt.view.tx11.getText();
		// try
			// {
				// Class.forName("com.mysql.cj.jdbc.Driver");
				// Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?useSSL=false","root","Root");
				// Statement st = con.createStatement();
				// ResultSet rs = st.executeQuery("select * from course where course='"+s1+"'");
				// while(rs.next())
				// {
				// edt.nwd.tx7.setText(rs.getString(1));
				// edt.nwd.tx8.setText(rs.getString(2));
				// edt.nwd.tx9.setText(rs.getString(3));
				// edt.nwd.tx10.setText(rs.getString(4));
				// edt.nwd.cb2.setSelectedItem(rs.getString(5));
				// }
				// con.close();
			// }
			// catch(Exception e1)
			// {
				// System.out.println(e1);
				// JOptionPane.showMessageDialog(null,e1);
			// }
		
	// }
	// if(e.getSource() == edt.upd.b4)
	// {
		
		// String g=""+FDemo.globle;
		// String ss=(String)edt.upd.cb1.getSelectedItem();
		
		// String s1 = edt.upd.tx11.getText();
		// edt.upd.cb1.removeAllItems();
		// try
		// {
			// Class.forName("com.mysql.cj.jdbc.Driver");
			// Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?useSSL=false","root","Root");
			// Statement st = con.createStatement();
			// String s11="Select * from "+g+" where QID='"+ss+"'";
			// ResultSet rs = st.executeQuery(s11);
			// while(rs.next())
			// {
			// edt.upd.cb1.addItem(rs.getString(1));
			// edt.upd.tx2.setText(rs.getString(2));
			// edt.upd.tx3.setText(rs.getString(3));
			// edt.upd.tx4.setText(rs.getString(4));
			// edt.upd.tx5.setText(rs.getString(5));
			// edt.upd.tx6.setText(rs.getString(6));
			// edt.upd.cb2.setSelectedItem(rs.getString(7));
			// }
			
			// con.close();
		// }
		// catch(Exception e1)
		// {
			// System.out.println(e1);
			// JOptionPane.showMessageDialog(null,e1.getMessage(),"Message",JOptionPane.INFORMATION_MESSAGE);
		// }
	// }
	if(e.getSource() == edt.rmv.b3)
	{
		String s1 = edt.rmv.tx11.getText();
		edt.rmv.cb3.removeAllItems();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?useSSL=false&AllowPublicKeyRetrieval=true","root","root");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("Select * from qcrse where subject = '" + s1 + "'");
			while(rs.next())
			{
			edt.rmv.cb3.addItem(rs.getString(1));
			// edt.view.tx2.setText(rs.getString(2));
			// edt.view.tx3.setText(rs.getString(3));
			// edt.view.tx4.setText(rs.getString(4));
			// edt.view.tx5.setText(rs.getString(5));
			// edt.view.tx6.setText(rs.getString(6));
			// edt.view.lb12.setText(rs.getString(7));
			}
			
			con.close();
		}
		catch(Exception e1)
		{
			System.out.println(e1);
			JOptionPane.showMessageDialog(null,e1.getMessage(),"Message",JOptionPane.INFORMATION_MESSAGE);
		}
	}
		if(e.getSource() == nwdm.b1)
		{
			// String sc = nwdm.tx11.getText();
			// String s1 = nwdm.tx1.getText();
			// String s2 = nwdm.tx2.getText();
			// String s3 = nwdm.tx3.getText();
			// String s4 = nwdm.tx4.getText();
			// String s5 = nwdm.tx5.getText();
			// String s6 = nwdm.tx6.getText();
			// String s7 = (String)nwdm.cb1.getSelectedItem().toString();
			// System.out.println(sc);
			// String s7 = ndv.cb1.getSelectedItem().toString();
			
			// try
			// {
				// Class.forName("com.mysql.cj.jdbc.Driver");
				// Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?useSSL=false","root","Root");
				// Statement st = con.createStatement();
				// st.executeUpdate("insert into qcrse values('"+s1+"', '"+s2+"', '"+s3+"', '"+s4+"', '"+s5+"', '"+s6+"', '"+s7+"','"+sc+"')");
				
				// JOptionPane.showMessageDialog(null,"Data inserted");
				// con.close();
			// }
			// catch(Exception e1)
			// {
				// System.out.println(e1);
			// }
		}
		if(e.getSource() == adpanel.b4)
		{
			card.show(cn,"uspage");
		}
		if(e.getSource() == adpanel.b5)
		{
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?useSSL=false&allowPublicKeyRetrieval=true","root","root");
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("Select * from userDetail where verify='false'");
				if(rs.next())
				{
				vft.cb1.addItem(rs.getString(2));
				card.show(cn,"vfytion");
				}
				else
				{
				JOptionPane.showMessageDialog(null,"No user");
				}
				con.close();
			}
			catch(Exception e1)
			{
				System.out.println(e1);
				JOptionPane.showMessageDialog(null,e1.getMessage(),"Message",JOptionPane.INFORMATION_MESSAGE);
			}			

		}
		if(e.getSource() == adcr.b2)
		{
			try
			{
				mcr.ch1.removeAll();
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?useSSL=false&allowPublicKeyRetrieval=true","root","root");
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("select * from course");
				while(rs.next())
				{
					mcr.ch1.addItem(rs.getString(1));
				}
				// rs.close();
				con.close();
				
			}
			catch(Exception e1)
			{
				JOptionPane.showMessageDialog(null,e1.getMessage(),"Message",JOptionPane.INFORMATION_MESSAGE);
				// System.out.println(e1);
			}	
			
			
			
			
			card.show(cn,"mcrse");
		}
		if(e.getSource() == edt.nwd.b2)
		{
			
			edt.view.cb3.removeAllItems();
			edt.upd.cb1.removeAllItems();
			edt.rmv.cb3.removeAllItems();
			
			card.show(cn,"mcrse");
		}
		
		// Add Courses Page
		if(e.getSource() == adcr.b1) // add button
		{
			String s=adcr.tx1.getText();
			mcr.ch1.addItem(s);				
			up.cb1.addItem(s);
			
			try
			 { 
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?useSSL=false&allowPublicKeyRetrieval=true","root","root");
				Statement st=con.createStatement();
			   
			   String s1="create table "+s+" (QID varchar(20),QStatement varchar(10000),A varchar(50),B varchar(50),C varchar(50),D varchar(50),COption varchar(30))";
			   st.executeUpdate(s1);
    		   con.close();
			 }
			
			 catch(Exception e1)
			 {
				 System.out.println(e1);					 
			 }
			
			
			try
			 { 
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?useSSL=false&AllowPublicKeyRetrieval=true","root","root");
				Statement st=con.createStatement();
			   String s1="insert into course values('"+s+"')";
						// String s1="create table "+s+" (QID varchar(20),QStatement varchar(10000),A varchar(50),B varchar(50),C varchar(50),D varchar(50))";
			   st.executeUpdate(s1);
			   
				JOptionPane.showMessageDialog(adcr.b3,"Course Add Successfuly","AddCourse",JOptionPane.INFORMATION_MESSAGE);
			 }
			 catch(Exception e1)
			 {
				 System.out.println(e1);
			 }
			
			adcr.tx1.setText("");
			adcr.tx2.setText("");
			adcr.tx3.setText("");
			adcr.tx4.setText("");
			
			// adcr.cb1.setSelectedItem("");
			// Set the JComboBox to its default first value
			adcr.cb1.setSelectedIndex(0);
			
			card.show(cn,"mcrse");
		
		
		}
		
		
		
		
		
		if(e.getSource() == crs.b2)
		{
			crs.cb1.removeAllItems();
			card.show(cn,"adpnl");
		}
		
		if(e.getSource() == cresult.b1)
		{
			// System.out.println("result page b1 button");
			card.show(cn,"course");
		}
		
		if(e.getSource() == vft.b1)
		{
			String s1 = (String)vft.cb1.getSelectedItem();
			vft.cb1.removeAllItems();
			String gender;
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?useSSL=false&allowPublicKeyRetrieval=true","root","root");
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("Select * from userDetail where Username = '" + s1 + "' ");
				while(rs.next())
				{
					udl.tx1.setText(rs.getString(1));
					udl.tx3.setText(rs.getString(2));
					udl.tx2.setText(rs.getString(3));
					
					// up.lname.setText(rs.getString(4));
					
					udl.tx6.setText(rs.getString(4));
					udl.tx4.setText(rs.getString(5));
					udl.tx5.setText(rs.getString(6));
					udl.tx7.setText(rs.getString(7));
					gender = rs.getString(8);
					if(gender.equals("Male"))
					{
						udl.r1.setSelected(true);
					}
					else
					{
						udl.r2.setSelected(true);
					}
					udl.tx8.setText(rs.getString(9));
					
					String st1 = rs.getString(10);
					udl.cb1.setSelectedItem(Integer.parseInt(st1));
					udl.cb2.setSelectedItem(rs.getString(11));
					String st2 = rs.getString(12);
					udl.cb3.setSelectedItem(Integer.parseInt(st2));
					
					udl.tx9.setText(rs.getString(13));
					udl.tx12.setText(rs.getString(14));
				}
				con.close();
			}
			catch(Exception e1)
			{
				System.out.println(e1);
				JOptionPane.showMessageDialog(null,e1.getMessage(),"Message",JOptionPane.INFORMATION_MESSAGE);
			}
			card.show(cn,"usrdetail");
		}
		if(e.getSource() == vft.b2)
		{
			vft.cb1.removeAllItems();
			card.show(cn,"adpnl");
		}
		if(e.getSource() == vft.b3)
		{
			String s1 = vft.cb1.getSelectedItem().toString();
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?useSSL=false&allowPublicKeyRetrieval=true","root","root");
				Statement st = con.createStatement();
				st.executeUpdate("update userDetail set verify='true' where Username = '"+s1+"'");
				
				JOptionPane.showMessageDialog(null,"User is verified");
				con.close();
			}
			catch(Exception e1)
			{
				System.out.println(e1);
				JOptionPane.showMessageDialog(null,e1.getMessage(),"Message",JOptionPane.INFORMATION_MESSAGE);
			}	
		}
		if(e.getSource() == vft.b4)
		{
			String s1 = vft.cb1.getSelectedItem().toString();
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?useSSL=false&allowPublicKeyRetrieval=true","root","root");
				Statement st = con.createStatement();
				st.executeUpdate("Delete from userDetail where Username = '" + s1 + "'");
				JOptionPane.showMessageDialog(null,"User deleted");
				// mcr.cb1.addItem("");
				con.close();
				
			}
			catch(Exception e1)
			{
				System.out.println(e1);
				JOptionPane.showMessageDialog(null,e1.getMessage(),"Message",JOptionPane.INFORMATION_MESSAGE);
			}
		}
		
		if(e.getSource() == upage.b1)
		{
			card.show(cn,"usrdetail");
		}
		if(e.getSource() == upage.b2)
		{
			card.show(cn,"adpnl");
		}
		if(e.getSource() == udl.b3)
		{
			// card.show(cn,"rsltpage");
			
			String gender;
			
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?useSSL=false&allowPublicKeyRetrieval=true","root","root");
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("Select * from usrdtl");
				while(rs.next())
				{
					udl.tx1.setText(rs.getString(1));
					udl.tx3.setText(rs.getString(2));
					udl.tx2.setText(rs.getString(3));
					udl.tx6.setText(rs.getString(4));
					udl.tx4.setText(rs.getString(5));
					udl.tx5.setText(rs.getString(6));
					udl.tx7.setText(rs.getString(7));
					gender = rs.getString(8);
					if(gender.equals("Male"))
					{
						udl.r1.setSelected(true);
					}
					else
					{
						udl.r2.setSelected(true);
					}
					udl.tx8.setText(rs.getString(9));
					
					String st1 = rs.getString(10);
					udl.cb1.setSelectedItem(Integer.parseInt(st1));
					udl.cb2.setSelectedItem(rs.getString(11));
					String st2 = rs.getString(12);
					udl.cb3.setSelectedItem(Integer.parseInt(st2));
					
					udl.tx9.setText(rs.getString(13));
					udl.tx12.setText(rs.getString(14));
				}
				con.close();
			}
			catch(Exception e1)
			{
				System.out.println(e1);
				JOptionPane.showMessageDialog(null,e1.getMessage(),"Message",JOptionPane.INFORMATION_MESSAGE);
			}
			
		}
		if(e.getSource() == udl.b1)
		{
			card.show(cn,"rspge");
		}
		// if(e.getSource() == test.b1)
		// {
			// card.show(cn,"upn");
		// }
		// if(e.getSource() == test.b3)
		// {
			// String sc = test.lb11.getText();
				// try
				// {
					// Class.forName("com.mysql.cj.jdbc.Driver");
					// Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?useSSL=false","root","Root");
					// PreparedStatement st = con.prepareStatement("Select * from qcrse where subject='"+sc+"'",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
					
					// ResultSet rs = st.executeQuery();
					// while(rs.previous())
					// {
					
					// test.lb2.setText(rs.getString(1));
					// test.tx2.setText(rs.getString(2));
					// test.tx6.setText(rs.getString(3));
					// test.tx7.setText(rs.getString(4));
					// test.tx8.setText(rs.getString(5));
					// test.tx9.setText(rs.getString(6));
					// test.lb11.setText(rs.getString(8));
					// }
					
					// con.close();
				// }
				// catch(Exception e1)
				// {
					// System.out.println(e1);
					// JOptionPane.showMessageDialog(null,e1.getMessage(),"Message",JOptionPane.INFORMATION_MESSAGE);
				// }
		// }
		// if(e.getSource() == test.b5)			// submit data matching
		// {
			// int answer = correct_cnt;
			
			// try
				// {
					// Class.forName("com.mysql.cj.jdbc.Driver");
					// Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?useSSL=false","root","Root");
					// Statement st = con.createStatement();
					// String sq1="Insert into quesdata(answer,Total_Ques,Attempted_Ques_,Correct_Ques_)values (answer,count,attempt_cnt,correct_cnt)";
					// st.executeUpdate(sq1);
					// con.close();
				// }
				// catch(Exception e1)
				// {
					// System.out.println(e1);
				// }
			
			
		// }
		
		// if(e.getSource() == test.b4)
		// {
			// String Cop=null;
			// if(test.r1.isSelected())
			// {
				// Cop="Option A";
			// }
			// else if(test.r2.isSelected())
			// {
				// Cop="Option B";
			// }
			// else if(test.r3.isSelected())
			// {
				// Cop="Option C";
			// }
			// else if(test.r4.isSelected())
			// {
				// Cop="Option D";
			// }
			
			// String s3 = QuesForm.copn;
			
			// System.out.println("s3 = "+s3);
			// System.out.println("answer = "+answer);
			
			// if(s3.equals(answer))
			// {
				// ++count;
				// ++correct_cnt;
				// ++attempt_cnt;
				// obt_mrk+=4;
			// }
			// else
			// {
				// ++wrong_cnt;
				// ++attempt_cnt;
			// }
			// /*
					
					// System.out.println("Correct count is "+correct_cnt);
					// System.out.println("Number of count is "+count);
			
			// */
			// System.out.println("Attempt count is "+attempt_cnt);
		// }
		
		if(e.getSource() == udl.b2)
		{
			card.show(cn,"adpnl");
		}
		if(e.getSource() == crs.b1)
		{
			card.show(cn,"adrt");
		}
		
		if(e.getSource() == up.b1)
		{
			
			// String s1 = rgln;
			// vft.cb1.removeAllItems();
			String gender;
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?useSSL=false&AllowPublicKeyRetrieval=true","root","root");
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("Select * from userDetail where Username = '" + rgln + "' ");
				while(rs.next())
				{
					urfm.tx1.setText(rs.getString(1));
					urfm.tx3.setText(rs.getString(2));
					urfm.tx2.setText(rs.getString(3));
					urfm.tx6.setText(rs.getString(4));
					urfm.tx4.setText(rs.getString(5));
					urfm.tx5.setText(rs.getString(6));
					urfm.tx7.setText(rs.getString(7));
					gender = rs.getString(8);
					if(gender.equals("Male"))
					{
						urfm.r1.setSelected(true);
					}
					else
					{
						urfm.r2.setSelected(true);
					}
					urfm.tx8.setText(rs.getString(9));
					
					String st1 = rs.getString(10);
					urfm.cb1.setSelectedItem(Integer.parseInt(st1));
					urfm.cb2.setSelectedItem(rs.getString(11));
					String st2 = rs.getString(12);
					urfm.cb3.setSelectedItem(Integer.parseInt(st2));
					
					urfm.tx9.setText(rs.getString(13));
					urfm.tx12.setText(rs.getString(14));
				}
				con.close();
			}
			catch(Exception e1)
			{
				System.out.println(e1);
				JOptionPane.showMessageDialog(null,e1.getMessage(),"Message",JOptionPane.INFORMATION_MESSAGE);
			}
			
			card.show(cn,"urfm");
		}
		if(e.getSource() == up.b5)				// user available result page
		{
			// card.show(cn,"csr");
			
			SNo=0;
			try
			{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?useSSL=false&AllowPublicKeyRetrieval=true","root","root");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from AllResult where UserName='"+name+"'");

			AllR.myR2.model.setRowCount(0);
			while(rs.next())
			{
				SNo++;
				// System.out.println("a");
				
				Object[] newRow={""+SNo,""+rs.getString(2),""+rs.getString(3),""+rs.getString(4),""+rs.getString(5),""+rs.getString(6),""+rs.getString(7),""+rs.getString(8),""+rs.getString(9),""+rs.getString(10),""+rs.getString(11)};
				AllR.myR2.model.addRow(newRow);
							
			}
			validate();

			con.close();
			
		card.show(cn,"AllR");
		
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
		
			
			
		}
		// if(e.getSource() == up.b2)				// exam start button
		// {
			// card.show(cn,"test");

			// String sc = (String)up.cb1.getSelectedItem().toString();
			// qf.cb1.removeAllItems();
				// try
				// {
					// Class.forName("com.mysql.cj.jdbc.Driver");
					// Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?useSSL=false","root","Root");
					// Statement st = con.createStatement();
					// String sq1="Select * from qcrse where subject='"+sc+"'";
					// String sq2="Select * from qcrse where subject='"+sc+"'";
					
					// System.out.println("Subject is "+sc);
					
					// ResultSet rs = st.executeQuery(sq1);
					// while(rs.next())
					// {
						// qf.cb1.addItem(rs.getString(1));
						// qf.lb11.setText(rs.getString(8));
					// }
					
					// rs = st.executeQuery(sq2);
					// while(rs.next())
					// {
						// qf.tx3.setText(rs.getString(2));
						// qf.tx4.setText(rs.getString(3));
						// qf.tx5.setText(rs.getString(4));
						// mrks = rs.getString(5);
					// }
					
					// rs.close();
					// con.close();
				// }
				// catch(Exception e1)
				// {
					// System.out.println(e1);
				// }

		// }
		
		if(e.getSource() == up.b2)
		{
			test.t1.setText("");
			test.l1.setText("");
			test.l2.setText("");
			test.l3.setText("");
			test.l4.setText("");
			
			card.show(cn,"test");
			test.l.setText(ques.toUpperCase()+"  TEST");
			nextQuestion(ques);
			test.lq.setText("Q."+x);
			test.l5.setText("Q Attempted : "+attemptedQuestion);
		}
		if(e.getSource() == up.b4)   // up.b4 is back of UserPanel
		{
			JOptionPane.showMessageDialog(null,"Successfully Logout","Message",JOptionPane.INFORMATION_MESSAGE);
			card.show(cn,"user");
		}
		if(e.getSource() == upage.b1)
		{
			// cb1.removeAllItems();
			String sc = (String)upage.cb1.getSelectedItem();
			String gender;
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?useSSL=false&AllowPublicKeyRetrieval=true","root","root");
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("Select * from userDetail where Username='"+sc+"'");
				while(rs.next())
				{
					udl.tx1.setText(rs.getString(1));
					udl.tx3.setText(rs.getString(2));
					udl.tx2.setText(rs.getString(3));
					udl.tx6.setText(rs.getString(4));
					udl.tx4.setText(rs.getString(5));
					udl.tx5.setText(rs.getString(6));
					udl.tx7.setText(rs.getString(7));
					gender = rs.getString(8);
					if(gender.equals("Male"))
					{
						udl.r1.setSelected(true);
					}
					else
					{
						udl.r2.setSelected(true);
					}
					udl.tx8.setText(rs.getString(9));
					
					String st1 = rs.getString(10);
					udl.cb1.setSelectedItem(Integer.parseInt(st1));
					udl.cb2.setSelectedItem(rs.getString(11));
					String st2 = rs.getString(12);
					udl.cb3.setSelectedItem(Integer.parseInt(st2));
					
					udl.tx9.setText(rs.getString(13));
					udl.tx12.setText(rs.getString(14));
				}
				con.close();
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
		}
		
		if(e.getSource() == rgf.b2)
		{
			card.show(cn,"user");
		}
		if(e.getSource() == cusr.b2)
		{
			card.show(cn,"upn");
		}
		if(e.getSource() == cusr.b1)
		{
			card.show(cn,"rsltpage");
		}
		if(e.getSource() == rspge.b1)
		{
			card.show(cn,"csr");
		}
		
		// if(e.getSource() == up.b3)
		// {
			// try
			// {
				// Class.forName("com.mysql.cj.jdbc.Driver");
				// Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?useSSL=false","root","Root");
				// Statement st = con.createStatement();
				// ResultSet rs = st.executeQuery("select * from course");
				// while(rs.next())
				// {
					// up.cb1.addItem(rs.getString(1));
					// up.cb1.getSelectedItem();
				// }
				// con.close();
				
			// }
			// catch(Exception e1)
			// {
				// JOptionPane.showMessageDialog(null,e1.getMessage(),"Message",JOptionPane.INFORMATION_MESSAGE);
				// System.out.println(e1);
			// }
		// }
		
		
		
		// if(e.getSource() == adm.b1)
		// {
			// String s1 = adm.tx1.getText();
			// String s2 = adm.tx2.getText();
			
			// try
			// {
				// Class.forName("com.mysql.cj.jdbc.Driver");
				// Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?useSSL=false","root","Root");
				// Statement st = con.createStatement();
				// ResultSet rs = st.executeQuery("Select * from admin where uname = '" + s1 + "' AND upass = '" + s2 + "'");
				// if(rs.next())
				// {-
					// card.show(cn,"menu");
				// }
				// else
				// {
					// JOptionPane.showMessageDialog(null,"Invald id or password","error",JOptionPane.ERROR_MESSAGE);
				// }
				// con.close();
			// }
			// catch(Exception e2)
			// {
				// System.out.println(e2);
			// }
		// }
		
		if(e.getSource() == qf.b1)
		{
			card.show(cn,"upn");
		}
		
		// test page back button
		if(e.getSource() == test.b3)
		{
			card.show(cn,"upn");
		}
		
		// test page(quick one) back button
		if(e.getSource() == result.b1)
		{
			x=0;
			q=0;
			ans="";
			COption="";
			QID="";
			
			attemptedQuestion=0;
			
			try
			{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?useSSL=false&AllowPublicKeyRetrieval=true","root","root");
			Statement st=con.createStatement();
			st.executeUpdate("delete from test");
	// /*	rs.absolute(x);		*/
			con.close();
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
			
			card.show(cn,"upn");
		}
		
		// User side Result page (exit button)
		if(e.getSource() == AllR.b1)
		{
			card.show(cn,"upn");
		}
		
		if(e.getSource() == urfm.b2)
		{
			card.show(cn,"upn");
		}
		
		// admin page course result back button
		if(e.getSource() == adrt.b1)
		{
			
			String str = (String)crs.cb1.getSelectedItem();
			// System.out.println(str);
			
			SNo=0;
			try
			{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?useSSL=false&AllowPublicKeyRetrieval=true","root","root");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from allresult where Test='" + str + "'");

			adrt.myR.model.setRowCount(0);
			while(rs.next())
			{
				SNo++;
				// System.out.println("a");
				
				Object[] newRow={""+SNo,""+rs.getString(2),""+rs.getString(3),""+rs.getString(4),""+rs.getString(5),""+rs.getString(6),""+rs.getString(7),""+rs.getString(8),""+rs.getString(9),""+rs.getString(10),""+rs.getString(11)};
				adrt.myR.model.addRow(newRow);
							
			}
			validate();

			con.close();
			
			card.show(cn,"course");
		
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
		
			
		}
		
		
	}
	
}

class MainFile
{
	public static void main(String ar[])
	{
		
		int x = 100, y = 100, w = 100, h = 500;
		Toolkit t = Toolkit.getDefaultToolkit();
		
		Image i = t.getImage("online-exams_icon.png");
		
		Dimension d = t.getScreenSize();
		x = (d.width-w)/2;
		y = (d.height-h)/2;
		
		
		
		FDemo f = new FDemo();
		f.setVisible(true);
		f.setIconImage(i);						// Icon image added
		f.setBounds(0,0,1375,750);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);		
		
	}
}