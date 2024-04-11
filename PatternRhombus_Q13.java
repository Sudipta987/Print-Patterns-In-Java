/*W.A.P to print Rhombus Pattern by using loops 
     *****
   *****
  *****
 *****
*****
*/
package Java.Print_Patterns;
import java.util.Scanner;
public class PatternRhombus_Q13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the Pattern: ");
        int n=sc.nextInt();
        System.out.println("The Pattern is -> ");
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            for(int k=1;k<=n;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
