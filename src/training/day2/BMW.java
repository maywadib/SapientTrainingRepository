package training.day2;

public class BMW extends FourWheeler {

	private String player;
	public BMW(int noOfDoors, FuelType fuelType, String player) {
		super(noOfDoors, fuelType);
		this.player = player;
	}

	public void musicPlayer()
	{
		System.out.println("BMW comes with sony player" + player + "player");
	}

	@Override
	public void doors() {
		System.out.println("this BMW has " + getNoOfDoors() + " doors");
	}

	@Override
	public void fuelType() {
		System.out.println("this BMW has " + getFuelType() + " fuel type");
	}

	@Override
	public void move() {
		System.out.println("BMW moves with auto gear");
	}

	@Override
	public void stop() {
		System.out.println("BMW Stops, with ABS");
	}
}
