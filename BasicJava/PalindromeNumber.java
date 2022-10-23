package BasicJava;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        int n=s.nextInt();
        int temp=n;
        int reverse=0;
        while(temp!=0){
            int rem=temp%10;  //getting remainder
            reverse=(reverse*10)+rem;
            temp=temp/10;
        }
        if(n==reverse)
            System.out.println(true);
        else
            System.out.println(false);
    }
}
