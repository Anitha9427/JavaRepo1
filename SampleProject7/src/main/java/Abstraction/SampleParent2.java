package Abstraction;

public abstract class SampleParent2 {
	int a=25;
	int b=10;
	int c;
	public abstract void add();
	public abstract void sub();
	public void Multi()
	{
		 c=a*b;
		 System.out.println(c);
	}

}
