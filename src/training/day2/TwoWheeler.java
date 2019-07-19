package training.day2;

public abstract class TwoWheeler extends Vehicle{

	public void selfStart(boolean flag)
	{
		System.out.println(flag?"Two wheeler has self start"
				:"Two wheeler does not have self start");
	}
	
	public void hasNoOfGear(int noOfGears)
	{
		System.out.println("This two wheeler has " + noOfGears + " gears");
	}
	
}
