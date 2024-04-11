/*W.A.P to print Inverted Pattern of Numbers by using loops 
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 
*/
package Java.Print_Patterns;
import java.util.Scanner;
public class PatternInvertedNumbers_Q11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Pattern length: ");
        int n=sc.nextInt();
        System.out.println("The Inverted Pattern is -> ");
        for(int i=n;i>=1;i--) {
            for(int j=1;j<=i;j++) {
                System.out.print(j+" ");
            }
            System.out.println();

        }
        sc.close();
    }
}
