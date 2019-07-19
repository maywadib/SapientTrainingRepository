package training.day4.collections;

import java.util.Vector;

//show working of vector
public class CollEx03 {
	public static void main(String[] args) {
		Vector<String> list = new Vector<>(7,5);
		
		
		System.out.println("initial capacity ;" + list.capacity());
		System.out.println("initial size ;" + list.size());
		
		
		list.add("one");
		list.add("one1");
		list.add("one2");
		list.add("one3");
		
		list.add("one4");
		list.add("one5");
		list.add("one6");
		list.add("one4");
		list.add("one5");
		list.add("one6");
		list.add("one4");
		list.add("one5");
		list.add("one6");
		list.add("one4");
		list.add("one5");
		list.add("one6");

		System.out.println("later capacity ;" + list.capacity());
		System.out.println("later size ;" + list.size());
	}
}
