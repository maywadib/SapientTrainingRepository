package training.day3;

public class SyncronizeTest extends Thread {

	Account account;
	int amount;
	
	public SyncronizeTest(Account account,int withdrawAmount,String name)
	{
		this.account= account;
		this.amount = withdrawAmount; 
		new Thread(this,name).start();
	}
	
	public void run() {
		account.withdraw(amount);
	}
	
	public static void main(String[] args) {
		Account account = new Account(1000);
		
		new SyncronizeTest(account, 500, "Mr A");
		new SyncronizeTest(account, 750, "Mr B");
	}

}
