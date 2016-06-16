package implementationarray;
import package1.TRy_catch;
public class array4 {
//multiplication
	public static void main(String[] args) {
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int c[][]=new int[3][3];
		a[0][0]=1;
		a[0][1]=2;
		a[0][2]=3;
		a[1][0]=4;
		a[1][1]=5;
		a[1][2]=6;
		a[2][0]=7;
		a[2][1]=8;
		a[2][2]=9;
		b[0][0]=1;
		b[0][1]=2; 
		b[0][2]=3;b[1][0]=4;b[1][1]=5;b[1][2]=6;b[2][0]=7;
		b[2][1]=8;
		b[2][2]=9;
		
for(int i=0;i<=2;i++){
	for( int j=0;j<=2;j++){
		c[i][j]=0;
		for(int k=0;k<=2;k++){
			c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
		}

		System.out.print(c[i][j]+" ");
	}
	System.out.println();
}

TRy_catch obj=new TRy_catch();
obj.getdata();

	}

}
