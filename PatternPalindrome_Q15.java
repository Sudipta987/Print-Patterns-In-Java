/*W.A.P to print Palindromic Number Pattern by using loops 
    1
   212
  32123
 4321234
543212345
*/
package Java.Print_Patterns;
import java.util.Scanner;
public class PatternPalindrome_Q15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the Pattern: ");
        int n=sc.nextInt();
        System.out.println("The Palindromic Pattern is : ");
        for(int i=1;i<=n;i++) {
            for(int k=1;k<=n-i;k++) {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--) {
                System.out.print(j);
            }
            for(int l=2;l<=i;l++) {
                System.out.print(l);
            }
            System.out.println();
        }
        sc.close();
    }
}
