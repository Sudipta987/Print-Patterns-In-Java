/*W.A.P to print a pattern4 by using loops 
****
 ***
  **
   *
*/
package Java.Print_Patterns;
import java.util.Scanner;
public class PatternBasic4_Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the pattern length n(row=col): ");
        int n=sc.nextInt();
        System.out.println("The Pattern is -> ");
        for(int i=n;i>=1;i--) {
            for(int k=n;k>i;k--) {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
