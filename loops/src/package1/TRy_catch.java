package package1;

public class TRy_catch {
	public void getdata(){
		System.out.println("gm");
}
	public static void main(String[] args) {
		try{
			int a=100/2;
			System.out.println(+a);
		}catch(Exception e){
			System.out.println(e);
			System.out.println("in catch block");
		}
		finally{
System.out.println("good morning");
	}
		
		}

}