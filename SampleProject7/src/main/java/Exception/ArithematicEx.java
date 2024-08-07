package Exception;

public class ArithematicEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		int a=25;
		int b=0;
		int c=a/b;
		System.out.println(c);	
	}
		/*catch(ArithmeticException x)
		{
		System.out.println("Check The Code Again");
		System.out.println(x);
		}*/
		finally
		{
			System.out.println("Hello world");
		}
		}

}
