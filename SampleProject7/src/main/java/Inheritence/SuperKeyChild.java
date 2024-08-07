package Inheritence;

public class SuperKeyChild extends SuperKeyParent{
	String a="Purple";
	public void diss()
	{
		super.dis();
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SuperKeyChild obj=new SuperKeyChild();
obj.diss();
	}

}
