package training.day4.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class CollEx02 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		System.out.println("Before :" + list.size());

		list.add("hello");
		list.add("Hi");
		list.add("Hey");

		System.out.println("Before :" + list.size());

		for (String temp : list)
			System.out.println(temp);

		Iterator<String> itr = list.iterator();

		System.out.println("...............................");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("...............................");

		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));

		System.out.println("...............................");

		list.add(2, "Bonjour");

		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));

		System.out.println("...............................");

		System.out.println(list.contains("Bonjour"));

		ArrayList<String> ls2 = new ArrayList<String>();

//	ls2.addAll(0, list);

		ls2.clear();

		for (int i = 0; i < 2; i++) {
			ls2.add(list.get(i));
			System.out.println(ls2.get(i));

		}
	}
}
