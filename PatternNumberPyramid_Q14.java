/*W.A.P to print Number Pattern by using loops 
    1 
   1 2 
  1 2 3 
 1 2 3 4 
1 2 3 4 5 
*/
package Java.Print_Patterns;
import java.util.Scanner;
public class PatternNumberPyramid_Q14 {
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
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
