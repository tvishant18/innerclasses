package classesinner;
class outer1{
	private int i=10;
	
	public void outerclass(){
		System.out.println("i am in outer class");
		abstract class inner3{
			public void innerclass4getdata(){
				
			};
		public void innerclass3getdata(){
			System.out.println("i am in inner3 and value is"+i);
		}
		}
		final class inner4 extends inner3{
			public void innerclass4getdata(){
				System.out.println("i am in inner4 and value is"+i);
			}
		}
			class inner5{ 
				public void innerclass5getdata(){
	
				System.out.println("i am in inner5 and value is"+i);
			}
				
			}
inner4 obj=new inner4();
obj.innerclass3getdata();
obj.innerclass4getdata();

inner5 obj1=new inner5();
obj1.innerclass5getdata();
		}
}
	

public class Localclass {

	public static void main(String[] args) {
		outer1 obj2=new outer1();
		obj2.outerclass();
	}

}
