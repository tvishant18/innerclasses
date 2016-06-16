package classesinner;
class A{
public static int i=10;
public  int j=20;
public  void getdata(){
	System.out.println("value of a="+i);
	System.out.println("value of b="+ j);
}
}
public class Statickey {

	public static void main(String[] args) {
		A obj=new A();
		obj.getdata();
		obj.i=20;
		obj.j=10;
		A obj1=new A();
		obj1.getdata();
		
	}

}
