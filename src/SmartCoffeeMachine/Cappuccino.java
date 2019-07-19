package SmartCoffeeMachine;

public class Cappuccino extends Coffee{

	public Cappuccino() {
		this.milkContain = 50;
		this.coffeeContain = 50;
	}

	@Override
	public void display() {
		System.out.println("You have selected Cappuccino and it contains" + this.coffeeContain + "% of coffee and "
				+ this.milkContain +"% of milk");
	}
	
}
