package Threading;

class Bank{
	float balAmt;

	public Bank(float balAmt) {
		super();
		this.balAmt = balAmt;
	}
	
	
	synchronized public void depositeAmt(float depAmt) {
		balAmt = balAmt + depAmt;
		System.out.println("total ammout after deposite" + balAmt);
		notify(); //notify to the waiting thread and context switch to waiting thread
	}
	
	synchronized  public void withdrawAmt(float withdrwAmt) throws InterruptedException {
		 	if(balAmt > withdrwAmt) {
		 		balAmt = balAmt -withdrwAmt;
		 		System.out.println("Reamaining balance after withdraw" + balAmt);
		 	}
		 	else {
		 		System.out.println("Waiting for ammount to deposite, Beacause of low balance");
		 		wait(); //to wait the thread and switch control to another thread
		 		System.out.println("After wait method ");
		 		balAmt = balAmt -withdrwAmt;
		 		System.out.println("Reamaining balance after withdraw" + balAmt);
		 		}
	}
	
}

public class BankApp {

	public static void main(String[] args) {
		Bank ob = new Bank(1000);
		
		//create thread object
		Thread t1 = new Thread() {
			public void run() {
				try {
					ob.withdrawAmt(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		t1.start();
		
		Thread t2 = new Thread() {
			public void run() {
				ob.depositeAmt(5000);
			}
		};
		t2.start();
		
		
//		Thread t3 = new Thread() {
//
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				super.run();
//			}
//			
//		};
//		t3.start();
	}

}
