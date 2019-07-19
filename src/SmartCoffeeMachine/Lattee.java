package SmartCoffeeMachine;

public class Lattee extends Coffee {

	public Lattee() {
		this.milkContain = 80;
		this.coffeeContain = 20;
	}

	@Override
	public void display() {
		System.out.println("You have selected Lattee and it contains" + this.coffeeContain + "% of coffee and "
				+ milkContain +"% of milk");
	}
	
}
