/*W.A.P to print a pattern5 by using loops 
  *
 * *
* * *
*/
package Java.Print_Patterns;
import java.util.Scanner;
public class PatternBasic5_Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the pattern length n(row=col): ");
        int n=sc.nextInt();
        System.out.println("The Pattern is -> ");
        for(int i=1;i<=n;i++) {
            for(int k=1;k<=(n-i);k++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
