package BasicJava;//Given a binary number as an integer N, convert it into decimal and print.
import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        int binary=s.nextInt();
        int decimal = 0;
        int n = 0;
        while(true){
            if(binary == 0){
                break;
            } else {
                int temp = binary%10;
                decimal += temp*Math.pow(2, n);
                binary = binary/10;
                n++;
            }
        }
        System.out.println(decimal);


        //Coding Ninja Solution
//        int num=s.nextInt();
//        int decimal = 0, pow=1;
//        while(num>0) {
//            int last = num % 10;
//            decimal = decimal + last * pow;
//            pow = pow + 2;
//            num = num / 10;
//        }
//        System.out.println(decimal);
    }
}
