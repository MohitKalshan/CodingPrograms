package BasicJava;

import java.util.Scanner;
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int  S ,E , W, C1 ;
        S=s.nextInt();
        E=s.nextInt();
        W=s.nextInt();

        if((0 <= S && S<= 90) &&
                (S <= E && E<=  900)&&
                (0 <= W && W<= 80) )
        {
            while(S<=E) {
                C1=((5*(S-32))/9);
                System.out.println(S+"\t"+C1);
                S=S+W;
            }
        }
    }
}
