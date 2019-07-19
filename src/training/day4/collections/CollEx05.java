package training.day4.collections;

import java.util.HashSet;

class Device implements Comparable<Device>{
	private int dId;
	private String dName;
	private double dPrice;
	@Override
	public String toString() {
		return "Device [dId=" + dId + ", dName=" + dName + ", dPrice=" + dPrice + "]";
	}
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public double getdPrice() {
		return dPrice;
	}
	public Device(int dId, String dName, double dPrice) {
		super();
		this.dId = dId;
		this.dName = dName;
		this.dPrice = dPrice;
	}
	public void setdPrice(double dPrice) {
		this.dPrice = dPrice;
	}
	@Override
	public int hashCode() {
		return this.dName.charAt(0);
	}
	@Override
	public boolean equals(Object obj) {
		Device device = (Device)obj;
		
		
		if(this.dId == device.dId && this.dName == device.dName && this.dPrice == device.dPrice)
			return true;
		else
			return false;
	}
	@Override
	public int compareTo(Device o) {
		
		return (o.getdId())- (this.dId);
	}
}
public class CollEx05 {

	public static void main(String[] args) {
		
		HashSet<Device> set = new HashSet<>();
		
		set.add(new Device(101,"laptop" , 500));
		set.add(new Device(102,"Computer" , 900));
		set.add(new Device(103,"smart watch" , 800));
		set.add(new Device(104,"mobile" , 700));
		set.add(new Device(104,"mobile" , 700));
		
		for(Device temp : set)
			System.out.println(temp.hashCode()+ "  " +temp);
	}



}
