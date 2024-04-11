/*W.A.P to print Star Pattern by using loops 
   *
  ***
 *****
*******
*******
 *****
  ***
   *
*/
package Java.Print_Patterns;
import java.util.Scanner;
public class PatternStar_Q16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the Star: ");
        int n=sc.nextInt();
        System.out.println("The Star Pattern is : ");
        for(int i=1;i<=n;i++) {
            for(int k=1;k<=n-i;k++) {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--) {
                System.out.print("*");
            }
            for(int l=2;l<=i;l++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--) {
            for(int k=1;k<=n-i;k++) {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--) {
                System.out.print("*");
            }
            for(int l=2;l<=i;l++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
