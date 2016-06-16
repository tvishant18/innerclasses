package threadimplementation;

public class Join1 {

	public static void main(String[] args) throws InterruptedException {
	Thread t1=new Thread(new Runnable(){
			public void run(){
			try {
				for(int i=0;i<5;i++){
					System.out.println("first task started");
					System.out.println("first start completed");
				Thread.sleep(3000);}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}	
			});		
	Thread t2=new Thread(new Runnable(){
		public void run(){
			System.out.println("second task completed");
		}
		
	});		
			
		t1.start();
		t1.join();
		t2.start();
			
			
			}
	

}

