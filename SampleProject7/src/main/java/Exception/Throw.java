package Exception;

public class Throw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age=25;
if(age>=18)
{
	System.out.println("Eligible for voting");
}
else
{
	throw new ArithmeticException("Not Elogible For Voting");
	
}
	}

}
