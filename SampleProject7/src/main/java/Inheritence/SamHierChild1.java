package Inheritence;

public class SamHierChild1 extends SamHierParent {
	int d=25;
	int e=5;
	int f;
	public void sub()
	{
		f=d-e;
		System.out.println(f);
	}

	public static void main(String[] args)
	{
SamHierChild1 obj=new SamHierChild1();
obj.add();
obj.sub();

	}

}
