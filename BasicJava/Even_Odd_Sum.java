package BasicJava;

import java.util.Scanner;
public class Even_Odd_Sum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        int digit;
        int even=0,odd=0;
        while(n>0)// until number become zero
        {
            digit=n%10; //for remainder for unit digit.
            n=n/10; // for dividing the number into smaller part.
            if(digit%2==0) { // if remainder is zero then even
                even=even+digit;
            }
            else {
                odd=odd+digit;
            }
        }
        System.out.println(even+" "+odd);
    }
}
