package training.day3;


class BussinessLogic extends Thread{
	
	public void run() {
		System.out.println("the thread in run is " + Thread.currentThread().getName());
		//simulating to kill some time
		
		for (int i = 0;i<1000;i++) {
			System.out.println("Value of i is :" + i + " in  Thread "+Thread.currentThread().getName()) ;
		}
		
		try {
			sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("exiting: "+ Thread.currentThread().getName());
		
	}
}


public class ThreadEx01 {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName());
		//if we invoke run it is single threaded
		//new BussinessLogic().run();
		
		BussinessLogic bussinessLogic = new BussinessLogic();
		bussinessLogic.setName("Laptop");
		bussinessLogic.start();
		//the method start() will 
		
		BussinessLogic bussinessLogic2 = new BussinessLogic();
		bussinessLogic2.setPriority(bussinessLogic.getPriority()+1);
		bussinessLogic2.setName("Desktop");
		bussinessLogic2.start();
		
		
		
		for (int i = 0;i<1000;i++) {
			System.out.println("Value of i is :" + i + " in  Thread "+Thread.currentThread().getName()) ;
		}
		
		try {
			bussinessLogic.join();
			bussinessLogic2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("main existing");
		
	}

}
