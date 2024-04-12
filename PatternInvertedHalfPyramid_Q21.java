/*W.A.P to print Inverted Half Pyramid Pattern by using loops 
1 1 1 1 
 2 2 2 
  3 3 
   4 
*/
package Java.Print_Patterns;
import java.util.Scanner;
public class PatternInvertedHalfPyramid_Q21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the Pattern: ");
        int n=sc.nextInt();
        System.out.println("The Inverted Half Pyramid is : ");
        int count=1;
        for(int i=n;i>=1;i--) {
            for(int k=1;k<=n-i;k++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print(count+" ");
            }
            count++;
            System.out.println();
        }
        sc.close();
    }
}
