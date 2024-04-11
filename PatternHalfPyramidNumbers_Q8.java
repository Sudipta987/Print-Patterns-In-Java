/*W.A.P to print Half Pyramid Pattern using numbers by using loops 
1
22
333
4444
55555
*/
package Java.Print_Patterns;
import java.util.Scanner;
public class PatternHalfPyramidNumbers_Q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the pattern length or Pyramid length: ");
        int n=sc.nextInt();
        System.out.println("The Pattern is -> ");
        for(int i=1;i<=n;i++) {
         for(int j=1;j<=i;j++) {
            System.out.print(i+" ");
         }
            System.out.println();
        }
        sc.close();
    }
}
