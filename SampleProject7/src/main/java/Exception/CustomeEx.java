package Exception;

public class CustomeEx {

	public static void main(String[] args) throws AgeException {
		// TODO Auto-generated method stub
		int age=15;
		if(age>=18)
		{
			System.out.println("Eligible for voting");
		}
		else
		{
			throw new AgeException("Not Elogible For Voting");//constructor invoking//
			
		}
		
			}

		

	}


