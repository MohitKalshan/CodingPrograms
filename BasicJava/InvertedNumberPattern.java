package BasicJava;/*Print the following pattern for the given N number of rows.
        Pattern for N = 4
        4444
        333
        22
        1
*/
import java.util.Scanner;
public class InvertedNumberPattern {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        int n=s.nextInt();
        int i=1;
        while(i<=n) {
            int j=1;
            int count=n-i+1; // for print reverse number.
            while(j<=count) {
                System.out.print(count);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
