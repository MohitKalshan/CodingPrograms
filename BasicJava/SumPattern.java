package BasicJava;/*Write a program to print triangle of user defined integers sum.
    for N=3
        1=1
        1+2=3
        1+2+3=6
*/
import java.util.Scanner;
public class SumPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum=0;
        int i=1;
        while(i<=n)
        {
            sum=sum+i;
            int j=1;
            while( j<=i)
            {
                System.out.print(j);
                if (j==i) {
                    System.out.print("=");
                }else {
                    System.out.print("+");
                }
                j++;
            }
            System.out.println(sum);
            i++;
        }
    }
}
