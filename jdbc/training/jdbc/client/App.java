package training.jdbc.client;

import training.jdbc.beans.Employee;
import training.jdbc.dao.EmployeeDAO;
import training.jdbc.standards.IEmployeeDAO;

public class App {
	public static void main(String[] args) throws Exception {
		Employee employee = new Employee(1001, "Raj", "raj@ps.com", 
				"1980-04-20", 20, 40000);
		
		IEmployeeDAO dao = new EmployeeDAO();
		
		System.out.println(dao.insertEmployee(employee)?"Inserted":"Not Inserted");
	}
}
