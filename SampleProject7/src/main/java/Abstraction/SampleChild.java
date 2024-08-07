package Abstraction;

public class SampleChild extends SampleParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SampleChild obj=new SampleChild();
obj.dis();
obj.det();
	}

	@Override
	public void det() {
		// TODO Auto-generated method stub
		System.out.println("This is the details");
	}

}
