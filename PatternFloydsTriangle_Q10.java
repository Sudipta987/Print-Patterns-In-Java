/*W.A.P to print Floyds Triangle Pattern  by using loops 
1 
2 3 
4 5 6 
7 8 9 10 
*/
package Java.Print_Patterns;
import java.util.Scanner;
public class PatternFloydsTriangle_Q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Triangle length: ");
        int n=sc.nextInt();
        System.out.println("The Floyd's Triangle is -> ");
        int count=1;
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();

        }
        sc.close();
    }
}
