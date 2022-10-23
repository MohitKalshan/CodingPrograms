package BasicJava;/*Write a program to print parallelogram pattern for the given N number of rows.
        For N = 4
        ****
         ****
          ****
           ****
        The dots represent spaces.
*/
import java.util.Scanner;
public class ParallelogramPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++)
        {
            for (int j = 2; j <= i; j++)
            {
                System.out.print(" "); // for triangle spaces
            }
            for (int j = 1; j <= n; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
