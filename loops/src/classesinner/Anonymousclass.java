package classesinner;
interface data{
	public void getdata();
}
abstract class information{
	public abstract void getdata();
}
class info{
	public void getdata(){
		System.out.println("info>>>getdata3");
	}
}
class myclass{
	
   	public data getdata1(){
     return new data(){
   	public void getdata(){
   	System.out.println("data>>data1");
   }
    };
	}
public information getdata2(){
	return new information(){
		public void getdata(){
			System.out.println("information >>>getdata2");
		}
	};
}
public info getdata3(){
	return new info(){
		public void getdata(){
			System.out.println("hello world");
		}
	};
}
}
public class Anonymousclass {

	public static void main(String[] args) {
//	data obj4=new data(){
//			public void getdata(){
//				System.out.println("data>>data1");
//			}
//		};
//obj4.getdata();
//		information obj1=new information(){
//			public void getdata(){
//				System.out.println("data>>data1");
//			}
//		};
//	obj1.getdata2();
//		info obj3=new info (){
//			public void getdata(){
//				System.out.println("data>>data1");
//			}
//		};
//	obj3.getdata1();
myclass obj2=new myclass();
obj2.getdata1().getdata();
obj2.getdata2().getdata();
obj2.getdata3().getdata();
	}

}
