package package1;

public class Main7 {

	public static void main(String[] args) {
	/* sequence of stars
	* 
   *** 
  ***** 
 ******* 
********* 

	 */
		int i;
		int j;
		int k;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=2*i-1;j++)
			{
				
				for(k=i;k<=4;k++)
				{
					
					if(j<=1){
					System.out.print(" ");
					}
				}
				System.out.print("*");
				
			
			}
			System.out.println(" ");	
		}

	}

}
