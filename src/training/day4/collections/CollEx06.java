package training.day4.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class CollEx06 {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		
		set.add("mayur");
		
		
		
		TreeSet<Device> device = new TreeSet<>(new Comparator<Device>() {

			@Override
			public int compare(Device o1, Device o2) {
				return o1.getdName().compareTo(o2.getdName());
			}

		});
		
		device.add(new Device(101,"laptop" , 500));
		device.add(new Device(102,"Computer" , 900));
		device.add(new Device(103,"smart watch" , 800));
		device.add(new Device(104,"mobile" , 700));
		
		
		
		
		
	}
}
