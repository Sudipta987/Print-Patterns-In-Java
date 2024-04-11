/*W.A.P to print Number Pyramid Pattern by using loops 
    1 
   2 2 
  3 3 3 
 4 4 4 4 
5 5 5 5 5 
*/
package Java.Print_Patterns;
import java.util.Scanner;
public class PatternNumberPyramid2_Q18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the Pattern: ");
        int n=sc.nextInt();
        System.out.println("The Number Pyramid is : ");
        for(int i=1;i<=n;i++) {
            for(int k=1;k<=n-i;k++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
