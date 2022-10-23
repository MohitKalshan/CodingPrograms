package BasicJava;/*Print the following pattern for given number of rows.
    for n=5
        5432*
        543*1
        54*21
        5*321
        *4321
*/
import java.util.Scanner;
public class NumberStarPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=1;j--)
            {
                if(j==i)
                    System.out.print("*");
                else
                    System.out.print(j);
            }
            System.out.println("");
        }
    }
}
