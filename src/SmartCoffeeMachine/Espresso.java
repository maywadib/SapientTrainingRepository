package SmartCoffeeMachine;

public class Espresso extends Coffee{

	
	public Espresso() {
		this.milkContain = 40;
		this.coffeeContain = 60;
	}

	@Override
	public void display() {
		System.out.println("You have selected Expresso  and it contains" + this.coffeeContain + "%of coffee and "
				+ this.milkContain +"% of milk");
	}
	

}
