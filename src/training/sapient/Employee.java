package training.sapient;

class Employee {
	private int empId;
	private String empName;
	private double empSal;

	void display() {
		// System.out.println(this.empId);
		System.out.println(this.empName);
		// System.out.println(this.empId);
	}

	public void setName(String empName) {
		if (empName.length() < 3) {
			System.out.println("Name too small");
			this.empName = "No Name";
		}
	}

	public void setId(int empId) {

	}

	public void setSal(int empSal) {

	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public double getEmpSal() {
		return empSal;
	}
}
