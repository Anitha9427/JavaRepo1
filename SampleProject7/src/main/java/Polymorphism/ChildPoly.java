package Polymorphism;

public class ChildPoly extends ParentPoly {
	float a=12.5f;
	float b=18.3f;
	public void add()
	{
		super.add();
		float c=a+b;
		System.out.println("The result is: "+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChildPoly obj=new ChildPoly();
obj.add();

	}

}
