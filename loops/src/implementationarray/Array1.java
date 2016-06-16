package implementationarray;

public class Array1 {
	// a=[1,2,3,4,5] b=[5,4,3,2,1]

	public static void main(String[] args) {
		int a[]={1,2,3,4,5};
		int b[]=new int[a.length];
		for(int i=a.length-1;i>=0;i--)
		{
			b[i]=a[i];
			System.out.print(b[i]+" ");
		}

	}

}
