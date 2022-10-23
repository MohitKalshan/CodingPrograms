package BasicJava;/*Write a program to print N number of rows for Half Diamond pattern using stars and numbers
    for N=3
        *
        *1*
        *121*
        *12321*
        *121*
        *1*
        *
       Note : There are no spaces between the characters in a single line.
*/
import java.util.Scanner;
public class HalfDiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Print upper half
        System.out.println("*");
        for(int i=1; i<=n; i++) // increasing
        {
            System.out.print("*"); // star before number
            for(int j=1; j<=i; j++)
            {
                System.out.print(j);     //triangle
            }
            for(int j=i-1; j>=1; j--)
            {
                System.out.print(j);     //number pattern
            }
            System.out.print("*"); // star after number
            System.out.println();
        }
        // Print lower half
        for(int i=n-1; i>=1; i--) //Decreasing
        {
            System.out.print("*");

            for(int j=1; j<=i; j++)
            {
                System.out.print(j);
            }

            for(int j=i-1; j>=1; j--)
            {
                System.out.print(j);
            }
            System.out.print("*");
            System.out.println();

        }
        System.out.print("*");

    }
}
