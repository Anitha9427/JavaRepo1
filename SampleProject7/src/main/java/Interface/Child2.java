package Interface;

public class Child2 implements Parent2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Child2 obj=new Child2();
obj.det();
obj.dis();
	}

	@Override
	public void dis() {
		// TODO Auto-generated method stub
		System.out.println("hai");
	}

	@Override
	public void det() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}

}
