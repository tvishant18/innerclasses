package threadimplementation;

public class Threadinsidemain {

	public static void main(String[] args) {
		Thread t1=new Thread(new Runnable(){
			public void run() {
				try {
					for(int i=0;i<5;i++){
						System.out.println(Thread.currentThread().getName()+" "+i);
					
					Thread.sleep(3000);}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		t1.setName("thread A");
		t1.start();
	}

}
