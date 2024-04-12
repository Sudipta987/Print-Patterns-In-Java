/*W.A.P to print Hollow Butterfly Pattern by using loops 
*     *
**   **
* * * *
*  *  *
* * * *
**   **
*     *
*/
package Java.Print_Patterns;
import java.util.Scanner;
public class PatternHollowButterfly_Q19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the Butterfly(Input=Odd): ");
        int n=sc.nextInt();
       
        System.out.println("The Butterfly pattern is -> ");
      for(int i=1;i<=n;i++) {
        for(int j=1;j<=n;j++) {
            if(j==1||j==n||i==j||i+j==n+1) {
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
      }

	    sc.close();	
		}
    
    }
        
    

