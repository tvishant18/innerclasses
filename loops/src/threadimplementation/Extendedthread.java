package threadimplementation;
class vish extends Thread{
	public vish(String threadname){
		super(threadname);
	}

	@Override
	public void run() {
		try{
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread()+"="+i);
			
			Thread.sleep(3000);}
		}catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		
	}
	
}
public class Extendedthread {

	public static void main(String[] args) {
		vish obj=new vish("thread 1");
		obj.start();
		vish obj1=new vish("thread 2");
		obj1.start();
	}
	

}
