package training.day4.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//show working of maps (hashmap)
public class CollEx07 {
public static void main(String[] args) {
	HashMap<String, Integer> map = new HashMap<>();
	map.put("Harry",200);
	map.put("potter",300);
	map.put("Ramesh",400);
	
	System.out.println(map.get("Harry"));
	
	
	Set<Entry<String, Integer>> entrySet = map.entrySet();

	Iterator itr = entrySet.iterator();
	
	while(itr.hasNext())
	{
		Map.Entry temp = (Entry) itr.next();
		
		System.out.println("key is " + temp.getKey() + " Value is "+ temp.getValue());
	}
	
}
}
