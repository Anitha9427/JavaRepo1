package Collection;

import java.util.ArrayList;

public class Alist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> obj=new ArrayList<String>();
obj.add("Red");
obj.add("Yellow");
obj.add("Green");
System.out.println(obj);
 
ArrayList<String> obj1=new ArrayList<String>();
obj1.add("Red");
obj1.add("Yellow");
obj1.add("Green");
System.out.println(obj1);
obj.addAll(obj1);
System.out.println(obj);
 
	}

}
