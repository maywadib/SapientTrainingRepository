package training.day3;

class SomeClass {
}

class MyBussinessLogic extends SomeClass implements Runnable {

	Thread t;

	public MyBussinessLogic() {
	}
	
	
	public MyBussinessLogic(String name, int priority) {
		t = new Thread(this);
		t.setName(name);
		t.setPriority(priority);
		t.start();
	}

	@Override
	public void run() {
		System.out.println("the thread in run is " + Thread.currentThread().getName());
		// simulating to kill some time

		for (int i = 0; i < 1000; i++) {
			System.out.println("Value of i is :" + i + " in  Thread " + Thread.currentThread().getName());
		}

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("exiting: " + Thread.currentThread().getName());

	}

}

public class ThreadEx02 {

	public static void main(String[] args) {

		MyBussinessLogic myBussinessLogic = new MyBussinessLogic("Desktop", 8);
		MyBussinessLogic myBussinessLogic2 = new MyBussinessLogic("Laptop", 6);
		
		//myBussinessLogic.join();
		
		
		MyBussinessLogic myBussinessLogic3 = new MyBussinessLogic();
		Thread tt1 = new Thread(myBussinessLogic3);
		tt1.setName("Daemon");
		tt1.start();
		tt1.setDaemon(true);
		
		MyBussinessLogic myBussinessLogic4 = new MyBussinessLogic();
		Thread tt2 = new Thread(myBussinessLogic3);
		tt2.start();
		
		MyBussinessLogic myBussinessLogic5 = new MyBussinessLogic();
		Thread tt3 = new Thread(myBussinessLogic3);
		tt3.start();
		
		
		
		
		System.out.println("Main exiting...");
		
	}

}
