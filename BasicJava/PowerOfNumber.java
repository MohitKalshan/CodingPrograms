package BasicJava;//Write a program to find x to the power n (i.e. x^n).
// Take x and n from the user. You need to print the answer.
//Note : For this question, you can assume that 0 raised to the power of 0 is 1.

import java.util.Scanner;
public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        int x=s.nextInt();
        int n=s.nextInt();

       int ans = 1; // initialise 1 because 'x' power 0 is 1.
        for (int i = 1; i <= n; i++) // upto power 'n'

            ans = ans * x; // multiple base value 'x' upto power 'n' times

        System.out.println(ans);
    }
}
