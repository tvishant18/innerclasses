package classesinner;
class outer{
	private int i=10;
	private static int j=20;
	class inner1{
		public inner1(){
			System.out.println("i am in innerclass1 constructor");
		}
		public void getinnerclassdata1(){
			System.out.println("i am in innerclass1 method and value is"+ i);
		}
	}
		static class inner2{
			public inner2(){
				System.out.println("i am in innerclass2 constructor");
			}
			public static void getinnerclassdata2(){
				System.out.println("i am in innerclass2 static method and value is"+ j);
			}
			public void getanotherdata(){
				System.out.println(" i am in anotherdata and value is"+j);
			}
		}
			public void outerclass(){
	System.out.println("i am in outer class");
				inner1 obj = new inner1();
				obj.getinnerclassdata1();
				
				inner2 obj1=new inner2();
				obj1.getinnerclassdata2();
				obj1.getanotherdata();
				
				inner2.getinnerclassdata2();
			}
	
}
public class Memberlevel {

	public static void main(String[] args) {
		outer obj2=new outer();
		obj2.outerclass();
		outer.inner1 obj3=new outer().new inner1();
		obj3.getinnerclassdata1();
		outer.inner2 obj4=new outer.inner2();
		obj4.getinnerclassdata2();
	}
		
	}


