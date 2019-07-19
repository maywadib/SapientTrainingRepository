package training.day4.collections;

import java.util.ArrayList;

public class CollEx01 {
	public static void main(String[] args) {
		ArrayList list =  new ArrayList<>();
		
		list.add("hii");
		list.add(new Object());
		list.add(12.56);
		list.add(12);
		list.add(true);
		
//		System.out.println(list);
		
		for(Object temp :list)
			System.out.println(temp);
	}
}
