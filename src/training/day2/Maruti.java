package training.day2;

public class Maruti extends FourWheeler {
	
	private String engineeStd;
	
	public Maruti(int noOfDoors, FuelType fuelType , String engineStd ) {
		super(noOfDoors, fuelType);
		this.engineeStd = engineStd;

	}

	public void engineeStandard()
	{
		System.out.println("Maruti has "+ engineeStd + " enginee");
	}

	@Override
	public void move() {
		System.out.println("Maruti moves dhire dhire");
	}

	@Override
	public void stop() {
		System.out.println("Maruti stops with lot of noise");
	}

	@Override
	public void doors() {
		System.out.println("this maruti comes with " + getNoOfDoors() + " doors");
	}

	@Override
	public void fuelType() {
		System.out.println("this maruti comes with " + getFuelType() + " fuel");
	}
	
}
