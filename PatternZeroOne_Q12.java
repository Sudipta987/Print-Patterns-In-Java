/*W.A.P to print 0-1 Pattern of Numbers by using loops 
1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 
*/
package Java.Print_Patterns;
import java.util.Scanner;
public class PatternZeroOne_Q12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Pattern length: ");
        int n=sc.nextInt();
        System.out.println("The 0-1 Pattern is -> ");
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                if((i+j)%2==0) {
                System.out.print(1+" ");
                }else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();

        }
        sc.close();
    }
}
