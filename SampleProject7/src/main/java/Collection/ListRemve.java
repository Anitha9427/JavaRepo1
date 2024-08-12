package Collection;

import java.util.ArrayList;
import java.util.List;

public class ListRemve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>obj=new ArrayList<String>();
		obj.add("Hello");
		obj.add("hai");
		obj.add("Anu");
		System.out.println(obj);
		obj.remove("Anu");
		System.out.println(obj);
	}

}
