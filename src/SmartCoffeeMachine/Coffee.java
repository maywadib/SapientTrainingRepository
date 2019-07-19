package SmartCoffeeMachine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public abstract class Coffee {
	public static HashMap<String , Integer> coffCounter = new HashMap<>();
	static {
	coffCounter.put("cappuccino",0);
	coffCounter.put("espresso",0);
	coffCounter.put("latte",0);
	}
	  
		public static List<String> getPopularCoffeeOption() {
				
				

				Set entrySet = Coffee.coffCounter.entrySet();
				Iterator itr = entrySet.iterator();
				
				int hasMaxCount = 0;
				String popularBeverage = null;
				
				while(itr.hasNext()) {
					Entry<String, Integer> next = (Entry) itr.next();
					if(next.getValue() >= hasMaxCount) {
						hasMaxCount = next.getValue();
						popularBeverage = next.getKey();
					}
				}
				
				List<String> popularList = new ArrayList<>();
//				popularList.add(popularBeverage);
				Iterator itr2 = entrySet.iterator();
				
				while(itr2.hasNext()) {
					Entry<String, Integer> next = (Entry) itr2.next();
					if(next.getValue() == hasMaxCount) {
						popularList.add(next.getKey());
					}
				}
				
				return popularList;
				
				
			} 
		 

	
	
	public int milkContain;
	public int coffeeContain;

	public void display() {
	}

	public static void dispalyOptions() {
		System.out.println(
				"Welcome to the Smart Coffee Machine! \nPlease select a choice \n1. Cappuccino \n2. Espresso \n3. Latte \n4. Make your own coffee. \n5.Our recommendation for you.");
	}
}
