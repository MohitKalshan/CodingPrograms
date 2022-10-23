package BasicJava;/*Print the following pattern for the given N number of rows.
        Pattern for N = 4
        *
        **
        ***
        ****
        Note : There are no spaces between the stars (*).
*/
import java.util.Scanner;
public class TriangularStarPattern {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        int n=s.nextInt();
        for (int i=1;i<=n;i++) {
                int j=1;
                while(j<=i) { //column = row.
                System.out.print("*"); // print the row.
                j++;
            }
            System.out.println();
        }


    }
}
