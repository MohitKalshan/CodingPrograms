package BasicJava;/*Nth term of BasicJava.Fibonacci series F(n), where F(n) is a function, is calculated using the following formula -
        F(n) = F(n-1) + F(n-2),
        Where, F(1) =  0,
        F(2) = 1
        Provided N you have to find out the Nth BasicJava.Fibonacci Number.

    Now the number is ‘6’ so we have to find the “6th” BasicJava.Fibonacci number
    So by using the property of the BasicJava.Fibonacci series i.e
    [ 1, 1, 2, 3, 5, 8]
    So the “6th” element is “8” hence we get the output.
*/

import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = 1;
        int b = 1;
        for (int i = 1; i <n; i++) {
            int c = a + b;
            a = b; // assign b value to a
            b = c; // assign c value to b
        }
        System.out.println(a); // print updated 'a' value at nth element.
    }

}
