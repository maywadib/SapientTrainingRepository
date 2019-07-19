package training.day2;

public class NightLamp extends Lamp implements RemoteControl{

	@Override
	public void on() {
		System.out.println("Night lamp ON");
	}

	@Override
	public void off() {
		System.out.println("Night lamp OFF");
	}

	
}
