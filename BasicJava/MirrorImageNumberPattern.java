package BasicJava;/*Print the following pattern for the given N number of rows.
        Pattern for N = 4
        ...1
        ..12
        .123
        1234
        The dots represent spaces.
*/
import java.util.Scanner;
public class MirrorImageNumberPattern {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        int n=s.nextInt();
        int i=1;
        while(i<=n) {
            int space=0;
            while(space<n-i) {
                System.out.print(" ");
                space++;
            }
            int j=1;
            while(j<=i) {
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
