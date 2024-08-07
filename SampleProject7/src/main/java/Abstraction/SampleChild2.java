package Abstraction;

public class SampleChild2 extends SampleParent2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SampleChild2 obj=new SampleChild2();
obj.add();
obj.sub();
obj.Multi();

	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		c=a+b;
		System.out.println(c);
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		c=a-b;
		System.out.println(c);
	}

}
