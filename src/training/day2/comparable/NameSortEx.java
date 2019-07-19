package training.day2.comparable;

import java.util.Arrays;

public class NameSortEx {

	public static void main(String[] args) {
		String[] names = { "Mayur", "Umang", "Abhilash", "Anurag" };

		for (String temp : names) {
			System.out.println(temp);
		}

		System.out.println("..................");
		Arrays.sort(names);

		for (String temp : names) {
			System.out.println(temp);
		}

	}
}
