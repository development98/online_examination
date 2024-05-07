import mypack1.demo1;
import mypack1.demo2;
import mypack1.inner.demo3;

class test
{
	public static void main (String ar[])
	{
		demo1 d=new demo1();
		d.display();
		demo2 d1=new demo2();
		d1.display();
		demo3 d2=new demo3();
		d2.display();
	}
}