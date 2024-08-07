package Interface;

public class Child implements Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Child obj=new Child();
obj.cal();
	}

	@Override
	public void cal() {
		// TODO Auto-generated method stub
		System.out.println("This is java:");
	}

}
