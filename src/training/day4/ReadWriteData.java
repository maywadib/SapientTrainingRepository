package training.day4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadWriteData {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your Emp ID");
		int empId = Integer.parseInt(br.readLine());
		
		System.out.println("Enter your name");
		String empName = br.readLine();
		
		System.out.println("Enter salary");
		double salary = Double.parseDouble(br.readLine());
		
		//display(empId, empName, salary);
		
		
		//wite data in file
		writeData(empId, empName, salary);
	
		//read content
		
		System.out.println("content....");
		BufferedReader brFile = new BufferedReader(new FileReader("Emp.txt"));
		String line = null;
		
		while((line = brFile.readLine())!=null) {
			System.out.println(line);
		}
	
	
	}

	private static void writeData(int empId, String empName, double salary) throws IOException {
		//write the data in the file
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("Emp.txt",true));
			
			bw.append("EmpID: " + empId );
			bw.newLine();

			bw.write("EmpName: " + empName);
			bw.newLine();
			
			bw.write("Salary :" + salary);
			bw.newLine();
		
			System.out.println("Data written...");
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			bw.close();
		}
	}

	private static void display(int empId, String empName, double salary) {
		System.out.println("empId "+ empId);
		System.out.println("empName "+ empName);
		System.out.println("salary "+ salary);
	}
}
