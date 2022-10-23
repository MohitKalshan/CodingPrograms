package BasicJava;//Write a program to print all the factors of a number other than 1 and the number itself.
//No output for prime numbers.
import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        int n=s.nextInt();
        int i = 2; // excluding 1 so starts from 2.
        while(i<= n/2) { //
            if (n % i == 0) { //if divisible by i then its remainder is zero hence factor
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
