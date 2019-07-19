package training.day2;

public class VehicleImpl {
	public static void main(String[] args) {
		Vehicle[] vehicles = new Vehicle[5];
		/*
		 * 5 Null blocks created
		 * vehicles[0].move() => null pointer exception 
		 */
	
		vehicles[0] = new BMW(4,FuelType.PETROL,"Morphy");
		vehicles[1] = new Maruti(4,FuelType.CNG,"eng2");
		vehicles[2] = new BMW(2,FuelType.DIESEL,"Sony");
		vehicles[3] = new BMW(4,FuelType.PETROL,"Sony");
		vehicles[4] = new Maruti(3,FuelType.CNG,"Eng1");
	
		DisplayVehicle.showVehicle(vehicles);
	}
}
