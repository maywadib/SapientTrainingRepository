package training.day2.comparable;

public class Student implements Comparable<Student> {

	private int sID;
	private String sName;
	private double sMArks;
	
	
	public Student(int sID, String sName, double sMArks) {
		super();
		this.sID = sID;
		this.sName = sName;
		this.sMArks = sMArks;
	}
	
	public int getsID() {
		return sID;
	}
	public void setsID(int sID) {
		this.sID = sID;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public double getsMArks() {
		return sMArks;
	}
	public void setsMArks(double sMArks) {
		this.sMArks = sMArks;
	}
	@Override
	public String toString() {
		return "Student [sID=" + sID + ", sName=" + sName + ", sMArks=" + sMArks + "]";
	}

	@Override
	public int compareTo(Student s) {
		
		//return  s.sID-this.sID;
		
		return this.sName.compareTo(s.sName);
	}
	
}
