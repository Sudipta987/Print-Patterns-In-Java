/*W.A.P to print Zig-Zag Pattern by using loops 
  *   *  
 * * * * 
*   *   *
*/
package Java.Print_Patterns;
import java.util.Scanner;
public class PatternZigZag_Q17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the Pattern: ");
        int n=sc.nextInt();
        System.out.println("The Zig Zag Pattern is : ");
        for(int i=1;i<=3;i++) {
            for(int j=1;j<=n;j++) {
                if((i+j)%4==0||(i==2&&j%4==0)) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        } 
        sc.close();
    }
    
}
