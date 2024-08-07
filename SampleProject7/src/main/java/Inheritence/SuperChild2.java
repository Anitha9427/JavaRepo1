package Inheritence;

public class SuperChild2 extends SuperParent1 {
public void hello()
{
	super.hai();
	System.out.println("Hello");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
SuperChild2 obj=new SuperChild2();
obj.hello();
	}

}
