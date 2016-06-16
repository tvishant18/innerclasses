package threadimplementation;
class producer extends Thread{
	public void run(){
			for(int i=0;i<5;i++){
				System.out.println(" producer"+i);
			Thread.yield();
				}
	
}
}
class consumer extends Thread{
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println("consumer" +i);
		Thread.yield();
			}
}
}
public class Yield {

	public static void main(String[] args){
	// also same thing producer t1=new producer(); 
		Thread t1=new producer();
		Thread t2=new consumer();
				t1.setPriority(Thread.MAX_PRIORITY);
				t2.setPriority(Thread.MIN_PRIORITY);
				t1.start();
				t2.start();
	}

}
/* Important Comments :-
Created two threads named producer and consumer for no specific reason. Producer is set to minimum priority and
consumer is set to maximum priority. I will run below code with/without commenting the line Thread.yield(). 
- Without  yield(), though the output changes sometimes, but usually first all consumer lines are printed and then all producer lines.
- With using yield() method, both prints one line at a time and pass the chance to another thread, almost all the time.
*/