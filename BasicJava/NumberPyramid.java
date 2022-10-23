package BasicJava;/*Print the following pattern for the given number of rows.
        Pattern for N = 4
        ...1
        ..232
        .34543
        4567654
        The dots represent spaces.
*/
import java.util.Scanner;
public class NumberPyramid {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        int n=s.nextInt();
        int i=1;
        while(i<=n)
        {
            int sp=0;
            while(sp<n-i)//reverse the number
            {
                System.out.print(" "); //for spaces
                sp++;
            }
            //for printing the increasing numbers
            int j=1;
            int temp=i; //reset the number
            while(j<=i)
            {
                System.out.print(temp);//print number
                temp++;
                j++;
            }
            //for print the decreasing numbers
            int k=1;
            int val=2*i-2; // for even number
            while(k<i)
            {
                System.out.print(val);
                val--;
                k++;
            }
            System.out.println();
            i++;
        }
    }
}
