package BasicJava;/*Print the following pattern
        Pattern for N = 4
        ...*
        ..***
        .*****
        *******
*/
import java.util.Scanner;
public class PyramidStarPattern {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        int n=s.nextInt();
        int i=1;
        while(i<=n) {
            // for spaces
            int sp=0;
            while(sp<n-i) { //reverse
                System.out.print(" ");
                sp++;
            }
            // for star pattern
            int j=1;
            while(j<=2*i-1) { // odd star.
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
