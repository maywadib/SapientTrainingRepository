package training.day4.collections;

import java.util.*;
import java.util.Map.Entry;

//fpr dictionary
public class CollEx08 {

	public static void main(String[] args) {
		
		List<String> goodmorning = Arrays.asList("good morning", "namaskara","bon jour");
		List<String> goodevening = Arrays.asList("good evening", "shubh sanje","bon soir");
		List<String> goodnight = Arrays.asList("good night", "Shubh ratri","Bonne nuit");
		
		HashMap<String, List<String>> map = new HashMap<>();
		
		map.put("goodmorning",goodmorning);
		map.put("goodevening",goodevening);
		map.put("goodnight",goodnight);
		
		Iterator<Entry<String, List<String>>> iterator = map.entrySet().iterator();
		
		while(iterator.hasNext())
		{
			Entry<String, List<String>> next = iterator.next();
			
			System.out.println("word " + next.getKey());
			
			for(String temp : next.getValue())
			{
				System.out.println(temp);
				
			}
			
			System.out.println();
		}
		
 	}
}
