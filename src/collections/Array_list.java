package collections;

import java.util.ArrayList;

public class Array_list {
	
	public static void main(String[] args) {
		
		ArrayList<Object> list = new ArrayList<Object>();
		list.add("vikas");
		list.add(7);
		list.add(true);
		
		list.remove(1);
		
		System.out.println(list);
		
		
	}

}
