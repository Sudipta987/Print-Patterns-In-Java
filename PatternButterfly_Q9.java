/*W.A.P to print Butterfly Pattern  by using loops 
*      *
**    **
***  ***
********
********
***  ***
**    **
*      *
*/
package Java.Print_Patterns;
import java.util.Scanner;
public class PatternButterfly_Q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the Butterfly: ");
        int n=sc.nextInt();
        System.out.println("The Butterfly pattern is -> ");
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }for(int  k=1;k<=n*2-i*2;k++) {
                System.out.print(" ");
            }for(int l=1;l<=i;l++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--) {
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }for(int  k=1;k<=n*2-i*2;k++) {
                System.out.print(" ");
            }for(int l=1;l<=i;l++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
