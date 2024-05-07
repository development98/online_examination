			String sc = qf.lb11.getText();
			String cid = qf.cb1.getSelectedItem().toString();
			int tq = 5;
			
			String s2 = Integer.parseInt(tq);
			
			int mk = Integer.parseInt(mrks);
			int tc = 5*mk;
			
			String tm = Integer.parseInt(tc);
			
	
			percentage is not working
			int percentage = (obt_mrk/tm)*4;
			String ob = Integer.parseInt(obt_mrk);
			String pnt = Integer.parseInt(percentage);
			
			
			double pnt = 100.0;
			String s1 = qf.tx2.getText();
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb?useSSL=false & AllowPublicKeyRetrieval=true","root","root");
					Statement st = con.createStatement();
					st.executeUpdate("insert into quesdata values('"+sc+"','"+cid+"','"+s3+"','"+count+"','"+tq+"','"+attempt_cnt+"','"+correct_cnt+"','"+tc+"','"+obt_mrk+"','"+wrong_cnt+"','"+pnt+"')");
					JOptionPane.showMessageDialog(null,"Answer submitted","Update",JOptionPane.INFORMATION_MESSAGE);
					
					Commented code
					while(rs.next())
					{
					cb3.addItem(rs.getString(1));
					
					qf.lb2.setText(rs.getString(1));
					qf.tx2.setText(rs.getString(2));
					qf.tx6.setText(rs.getString(3));
					qf.tx7.setText(rs.getString(4));
					qf.tx8.setText(rs.getString(5));
					qf.tx9.setText(rs.getString(6));
					qf.lb11.setText(rs.getString(8));
					}
					
				con.close();
				}
				catch(Exception e1)
				{
					System.out.println(e1);
				}
				
				
				
				
				
				
				
/////////////////////////////////////////////////////
	
	// qf.b5
	
			String Cop=null;
			int marks=0;
			int cmarks=0;
			int wrongQue=0;
			
			if(qf.r1.isSelected())
			{
				Cop="Option A";
			}
			else if(qf.r2.isSelected())
			{
				Cop="Option B";
			}
			else if(qf.r3.isSelected())
			{
				Cop="Option C";
			}
			else if(qf.r4.isSelected())
			{
				Cop="Option D";
			}
			String s3 = Cop;
			
			if(ans == s3)
			{
				marks++;
				cmarks++;
			}
			else
			{
				wrongQue++;
			}
			
						int t = rs.getInt(1);
						commented lines
						System.out.println(t);
						qf.cb1.addItem(rs.getString(1));
						qf.tx2.setText(rs.getString(2));
						qf.tx6.setText(rs.getString(3));
						qf.tx7.setText(rs.getString(4));
						qf.tx8.setText(rs.getString(5));
						qf.tx9.setText();
						qf.lb11.setText(rs.getString(8));
						rs.close();
					
					
					rs = st.executeQuery(sq2);		// resultset2
					while(rs.next())
					{
						qf.tx3.setText(rs.getString(2));
						qf.tx4.setText(rs.getString(3));
						qf.tx5.setText(rs.getString(4));
					}