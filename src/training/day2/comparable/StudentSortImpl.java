package training.day2.comparable;

import java.util.Arrays;

public class StudentSortImpl {

	public static void main(String[] args) {

		Student[] students = { new Student(110, "Mayur", 21), new Student(10, "Umang", 21),
				new Student(11, "Abhilash", 21), new Student(4, "Sai", 21), new Student(54, "Unmesh", 21) };

		for (Student temp : students) {
			System.out.println(temp);
		}

		// Arrays.sort(students);

		SortingTemplate.sortByNameAsc(students);

		System.out.println(".................");

		for (Student temp : students) {
			System.out.println(temp);
		}

		SortingTemplate.sortByNameDsc(students);

		System.out.println(".................");

		for (Student temp : students) {
			System.out.println(temp);
		}

		System.out.println(".................");
		System.out.println(SortingTemplate.findStudent(students,110));

	}

}
