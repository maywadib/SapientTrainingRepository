package training.day3;

public class DemonThreadEx extends Thread{

	
	public void run() 
    { 
        System.out.println("Thread name: " + Thread.currentThread().getName()); 
        System.out.println("Check if its DaemonThread: " 
                        + Thread.currentThread().isDaemon()); 
    } 
  
    public static void main(String[] args) 
    { 
        DemonThreadEx t1 = new DemonThreadEx(); 
        DemonThreadEx t2 = new DemonThreadEx(); 
        t1.start(); 
          
        // Exception as the thread is already started 
        t1.setDaemon(true); 
       //  t1.setDaemon(); 
        t2.start(); 
    } 
	
}
