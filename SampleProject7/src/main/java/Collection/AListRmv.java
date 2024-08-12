package Collection;

import java.util.ArrayList;

public class AListRmv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> obj=new ArrayList<String>();
		obj.add("Red");
		obj.add("Yellow");
		obj.add("Green");
		System.out.println(obj);
		obj.remove(0);
		System.out.println(obj);
	}

}
