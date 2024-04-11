/*W.A.P to print Hollow Rectangle Pattern by using loops 
****
*  *
*  *
*  *
****
*/
package Java.Print_Patterns;
import java.util.Scanner;
public class PatternHollowRectangle_Q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row & col: ");
        int row=sc.nextInt();
        int col=sc.nextInt();
        System.out.println("Now the Hollow Rectangle Pattern is -> ");
        for(int i=1;i<=row;i++) {
            for(int j=1;j<=col;j++) {
            if(i==1||i==row||j==1||j==col) {
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
            }System.out.println();
        }
        sc.close();
    }
}
