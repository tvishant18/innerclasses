package threadimplementation;
class Share{
	public  synchronized void getdata(String threadname){
		for(int i=0;i<5;i++){
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
		
				e.printStackTrace();
			}
		System.out.println(threadname +" "+ i);
		}
	}
}
class mythread extends Thread{
private Share share;
public mythread(Share shareobject,String pthreadname){
	super(pthreadname);
	share= shareobject;
}

public void run() {
	share.getdata(Thread.currentThread().getName());
}

}
public class threadsynchronize {

	public static void main(String[] args) {
	Share shareobject=new Share();	
	mythread obj1=new mythread(shareobject ,"thread a");
	
	obj1.start();
	mythread obj2=new mythread(shareobject,"thread b");
	
	obj2.start();
	}

}
