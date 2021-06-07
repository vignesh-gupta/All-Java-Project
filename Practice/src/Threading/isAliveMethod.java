package Threading;

public class isAliveMethod extends Thread{
	public static int amt=0;
	 public static void main(String[] args) {
		 isAliveMethod thread = new isAliveMethod();
		 thread.start();
		 System.out.println(amt);
		 while(thread.isAlive()) {
			 System.out.println("Thread is alive...");
		 }
		 
		 amt++;
		 System.out.println(amt);
	 }
	 public void run() {
//		 System.out.println("Thread started.");
		 amt++;
	 }
}
