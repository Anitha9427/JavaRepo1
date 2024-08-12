package Collection;

import java.util.LinkedList;


public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String>obj=new LinkedList<String>();
obj.add("Red");
obj.add("Yellow");
obj.add("Green");
System.out.println(obj);

LinkedList<String>obj1=new LinkedList<String>();
obj1.add("Red");
obj1.add("Yellow");
obj1.add("Green");
System.out.println(obj1);
obj.addAll(obj1);
System.out.println(obj);


 

	}

}
