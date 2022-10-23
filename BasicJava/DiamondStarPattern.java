package BasicJava;/*Print the following pattern for the given number of rows.
        Note: N is always odd.
        Pattern for N = 5
        ..*
        .***
        *****
        .***
        ..*
        The dots represent spaces.
*/
import java.util.Scanner;
public class DiamondStarPattern {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        int n=s.nextInt();
        int i, j;
        i = 1;
        while(i <= n) // if n=5
        {
            j = 1;
            while(j <= n - i)
            {
                System.out.print(" "); //for spaces
                j=j+2;
            }
            j = 1;
            while(j <= 2*i - 1) // for odd stars.
            {
                System.out.print("*");
                j=j+2;
            }
            System.out.println();
            i=i+2;
        }
//		next
        i = n - 2 ;
        while(i > 0)
        {
            j = 1 ; while( j <= n - i)
        {
            System.out.print(" ");
            j=j+2;
        }
            j = 1 ;
            while(j <= 2*i - 1)
            {
                System.out.print("*");
                j=j+2;
            }
            System.out.println();
            i=i-2;
        }

    }
}
