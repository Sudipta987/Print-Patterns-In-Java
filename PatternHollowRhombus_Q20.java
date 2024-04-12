/*W.A.P to print Hollow Rhombus Pattern by using loops 
    *****
   *   *
  *   *
 *   *
*****
*/
package Java.Print_Patterns;
import java.util.Scanner;
public class PatternHollowRhombus_Q20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the Pattern: ");
        int n=sc.nextInt();
        System.out.println("The Hollow Rhombus is : ");
        for(int i=1;i<=n;i++) {
            for(int k=1;k<=n-i;k++) {
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++) {
            if(i==1||i==n||j==1||j==n) {
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
