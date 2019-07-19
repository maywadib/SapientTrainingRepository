package training.day3;

public class Account {
	private int balance;
	
	public Account (int balance) {
		this.balance = balance;
		
	}
	
	public synchronized void withdraw(int amount)
	{
		if (amount<balance)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			this.balance = balance - amount;
			
			System.out.println("Amount of " + amount + "has been deducted Balance is "+ this.balance);
		}else
		{
			System.out.println("WSorry you dont have sufficient balance for amount: " + amount);
			
		}
	}
}
