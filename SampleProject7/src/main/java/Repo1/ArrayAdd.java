package Repo1;

public class ArrayAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int even=0;
int odd=0;
int a[]={1,2,3,4,5,6,7,8,9,10};
for(int i=0;i<=9;i++)
{
	System.out.println(a[i]);
	if(a[i]%2==0)
	{
	even=even+a[i];
	}
	else
	{
	odd=odd+a[i];
}
}
System.out.println("The sum of even numbers: "+even);
System.out.println("The sum of odd numbers: "+odd);
	}

}
