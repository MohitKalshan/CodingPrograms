package BasicJava;/*Write a program to print the pattern for the given N number of rows.
        For N = 4
        1357
        3571
        5713
        7135
*/

import java.util.Scanner;
public class OddSquarePattern {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        int n=s.nextInt();
        int i = 1;
        while(i<=n){
            int odd = (2*i)-1; // odd number initialise
            int j=n; // loop from n to 1.
            while(j>0){
                System.out.print(odd);
                odd = odd +2; // skip 1 number
                if(odd>2*n-1) //for n=4 number exceed  i.e. 2*4-1= 7
                    odd=1; //reset odd as 1.
                j--;
            }
            System.out.println();
            i++;
        }
    }
}
