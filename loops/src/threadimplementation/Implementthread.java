package threadimplementation;
class google implements Runnable{

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
public class Implementthread {

	public static void main(String[] args) {
		
    Thread t1=new Thread(new google());	
    t1.setName("thread 1");
    t1.start();
    Thread t2=new Thread(new google());
    t2.setName("thread b");
    t2.start();
    
	}

}
