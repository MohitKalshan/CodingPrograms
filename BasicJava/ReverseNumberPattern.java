package BasicJava;/*Print the following pattern for the given N number of rows.
        Pattern for N = 4
        1
        21
        321
        4321
*/

import java.util.Scanner;
public class ReverseNumberPattern {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        int n=s.nextInt();
        int i=1;
        while(i<=n) {
            int count=i; // make new variable 'count' to avoid changing of 'i' And print the number.
            int j=1;
            while(j<=i) {
                System.out.print(count); // print count.
                count=count-1; // decrement the count.
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
