interface myinter
{
	void show();
}

class demo
{
	public static void main(String ar[])
	{
		myinter my=()->{System.out.println("hello world");};
	
		my.show();
	}
}