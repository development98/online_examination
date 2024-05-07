String s[]={"<html><body>Manage<br>Courses</body></html>","<html><body>Courses<br> Result</body></html>","<html><body>Logout</body></html)","<html><body> Users </body></html>","<html><body>Verifications</body></html>","<html><body>Change<br>Password</body></html>"};

	int x=250,y=350,w=200,h=93;
		int k=0;
		for(int i=0;i<2;i++)
		{
		for (int j=0;j<3;j++)
		{
		b[k]=new JButton(s[k],im);
		b[k].setBounds(x,y,w,h);

		// b[k].setBackground(new Color (88, 183, 253));

		b[k].setHorizontalTextPosition(sc.CENTER);
		b[k].setContentAreaFilled (false);
		b[k].setBorderPainted(false);
		b[k].setFont(f);
		add(b[k]);

		x=x+500;
		k++;
		}
		x=250;
		y=y+300;
		}