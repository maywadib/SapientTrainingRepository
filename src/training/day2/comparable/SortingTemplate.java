package training.day2.comparable;

import java.util.Arrays;
import java.util.Comparator;

public class SortingTemplate {
	public static Student[] sortByNameAsc(Student[] students) {
	
		Arrays.sort(students, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.getsName().compareTo(o2.getsName());
			}

		});

		return students;
	}

	public static Student[] sortByNameDsc(Student[] students) {
		Arrays.sort(students, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o2.getsName().compareTo(o1.getsName());
			}

		});
		
		return students;
	}
	
	public static  boolean findStudent(Student[] students, int id)
	{
		int arr[] = new int[students.length];
		
		for(int i=0;i<students.length;i++)
		{
			arr[i] = students[i].getsID();
		}
		return Arrays.binarySearch(arr,id)>-1;
	}

}
