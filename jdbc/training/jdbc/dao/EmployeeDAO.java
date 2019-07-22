package training.jdbc.dao;

import java.sql.SQLException;
import java.util.List;

import training.jdbc.beans.Employee;
import training.jdbc.connection.GetConnection;
import training.jdbc.standards.IEmployeeDAO;


	public class EmployeeDAO implements IEmployeeDAO
	{

		@Override
		public boolean insertEmployee(Employee employee) throws Exception {
			String sql  = "insert into employee values (?,?,?,?,?,?)";
			GetConnection gc = new GetConnection();
			
			gc.ps = GetConnection.getMysqlConnection().prepareStatement(sql);
			
			gc.ps.setInt(1,  employee.getEmpId());
			gc.ps.setString(2,  employee.getEmpName());
			gc.ps.setString(3, employee.getEmpEmail());
			gc.ps.setString(4, employee.getEmpDob());
			gc.ps.setInt(6, employee.getDepartmentId());
			gc.ps.setDouble(5, employee.getEmpSalary());
			
			return gc.ps.executeUpdate()>0;
		}

		@Override
		public boolean deleteEmployee(int empId) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean updateEmployee(int empId, double newSalary) {

			
			
			return false;
		}

		@Override
		public Employee getEmployee(int empId) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Employee> getAllEmployee() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}

