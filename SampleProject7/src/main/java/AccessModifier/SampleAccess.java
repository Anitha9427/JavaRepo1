package AccessModifier;

public class SampleAccess {
	public void add()
	{
	System.out.println("This is public");
	}
	private void sub()
	{
	System.out.println("This is private");
	}
	protected void div()
	{
	System.out.println("This is protected")	;
	}
	void multi()
	{
 System.out.println("This is default");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SampleAccess obj=new SampleAccess();
obj.add();
obj.sub();
obj.div();
obj.multi();
	}

}
