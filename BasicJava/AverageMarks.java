package BasicJava;

import java.util.Scanner;
public class AverageMarks {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b,c;
        a= s.nextInt();
        b= s.nextInt();
        c= s.nextInt();

        int avg=(a+b+c)/3;
        System.out.println(avg);
    }
}
