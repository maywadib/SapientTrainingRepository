package SmartCoffeeMachine;

import java.util.HashMap;

public class Database {

	HashMap<String, Employee> employeeDirectory = new HashMap<>();
	
	public void createDatabase()
	{
	
	Employee e1 = new Employee("sai", "sai");
	Employee e2 = new Employee("may", "may");
	Employee e3 = new Employee("uma", "uma");
	

	employeeDirectory.put("sai", e1);
	employeeDirectory.put("may", e2);	
	employeeDirectory.put("uma", e3);
	}
	
	public boolean checkUser(String key)
	{
		
		
		Employee e = employeeDirectory.get(key);
		if(e==null) {
			System.out.println(e);
			return false;
		}
		else{
			return true;
		}
		
	}
}
