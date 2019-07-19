package training.day2;

public abstract class FourWheeler extends Vehicle{
	
	private int noOfDoors;
	private FuelType fuelType;
	
	
	
	public FourWheeler(int noOfDoors, FuelType fuelType) {
		super();
		this.noOfDoors = noOfDoors;
		this.fuelType = fuelType;
	}

	public void doors()
	{
		System.out.println("Four wheeler has "+ noOfDoors + " doors");
	}

	protected int getNoOfDoors() {
		return noOfDoors;
	}

	protected void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}

	protected FuelType getFuelType() {
		return fuelType;
	}

	protected void setFuelType(FuelType fuelType) {
		this.fuelType = fuelType;
	}

	public void fuelType()
	{
		System.out.println("This four wheeler runs on " + fuelType);
	}

	
}
