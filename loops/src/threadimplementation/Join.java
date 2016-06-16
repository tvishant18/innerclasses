package threadimplementation;
class vishant implements Runnable{

	
	public void run() {
		try {
			for(int i=0;i<5;i++){
			System.out.println(Thread.currentThread().getName()+" "+i);	
			
			Thread.sleep(3000);}
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
	
}
public class Join {

	public static void main(String[] args) {
		Thread t1=new Thread( new vishant());
		Thread t2=new Thread( new vishant());
		Thread t3=new Thread( new vishant());
	t1.setName("thread a");
	t2.setName("thread b");
	t3.setName("thread c");
	t1.start();
	try {
		t1.join();
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	t2.start();
	try {
		t1.join(2000);
		
	} catch (InterruptedException e) {
	
		e.printStackTrace();
	}
	t3.start();
	try {
		t1.join();
		t2.join();
		t3.join();
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	}

}
