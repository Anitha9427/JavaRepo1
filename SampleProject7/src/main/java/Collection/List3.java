package Collection;

import java.util.ArrayList;
import java.util.List;

public class List3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>obj=new ArrayList<String>();
		obj.add("How");
		obj.add("hai");
		obj.add("Hello");
		obj.add("Anu");
		obj.add("Hello");
		System.out.println(obj);
		int x=obj.indexOf("Hello");
		int y=obj.lastIndexOf("Hello");
		System.out.println(x);
		System.out.println(y);
	}

}
