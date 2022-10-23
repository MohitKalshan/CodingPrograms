package BasicJava;//Write a program to print first 'n' terms of the series 3N + 2 which are not multiples of 4.
import java.util.Scanner;
public class TermOfAP {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
           int num=3*i+2; // Given formula
            if(num%4!=0){ // not multiple of 4 i.e. remainder is not zero.
                System.out.print(num +" ");
            }else{
                n=n+1;
            }
        }
    }
}
