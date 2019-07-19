package SmartCoffeeMachine;

public class YourChoice extends Coffee{

	public YourChoice(int milkContain,int coffeeContain) {
		this.milkContain = milkContain;
		this.coffeeContain = coffeeContain;
		
	}
	@Override
	public void display() {
		System.out.println("You have selected Your Own Choice and it contains" + this.coffeeContain + "% of coffee and "
				+ this.milkContain +"% of milk");
	}
	
}
