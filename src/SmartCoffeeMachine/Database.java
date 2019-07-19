package SmartCoffeeMachine;

import java.util.HashMap;

public class Database {

	HashMap<String, Employee> employeeDirectory = new HashMap<>();

	public void createDatabase() {

		Employee e1 = new Employee("sai", "sai");
		Employee e2 = new Employee("may", "may");
		Employee e3 = new Employee("uma", "uma");

		employeeDirectory.put("sai", e1);
		employeeDirectory.put("may", e2);
		employeeDirectory.put("uma", e3);

	}

	public boolean isUserPresent(String llid) {

		if (employeeDirectory.containsKey(llid)) {
//			System.out.println("Welcome " + llid);
			return true;
		} else {
//			System.out.println("Sorry LLID is not registered, Please sign up");
			
			return false;
		}

	}

	public boolean checkPassword(String llid, String password) {

		Employee e = employeeDirectory.get(llid);

		if (e.getEmpPswd().equals(password)) {
			System.out.println("Welcome "+ llid);
			return true;
		}
		else {
			System.out.println("Incorrect Password..");
			return false;
		}

	}
	
	
	public void signUp(String llid, String password) {
		
		Employee newEmp = new Employee(llid, password);
		
		employeeDirectory.put(llid, newEmp);
		
		System.out.println("User registered");
	}
}
