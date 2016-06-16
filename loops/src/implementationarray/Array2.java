package implementationarray;

public class Array2 {

	public static void main(String[] args) {
		int value1=Integer.parseInt(args[0]);
		int value2=Integer.parseInt(args[1]);
		int a[][]=new int[value1][value2];
		a[0][0]=10;
		a[0][1]=20;
		a[1][0]=30;
		a[1][1]=40;

		for(int i=0;i<value1;i++){
			for(int j=0;j<value2;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
