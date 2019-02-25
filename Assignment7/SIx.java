/*  Accept range from user and perform addition of all elements
form that range. */
import java.util.Scanner;
public class Six {

    public static void main(String[] args) 
 {
         Scanner sc =new Scanner(System.in);
        
          System.out.println("Enter starting value:");
             int n=sc.nextInt();
          System.out.println("Enter Ending value:");
             int num =sc.nextInt();
          int  sum = 0;

        for(int i = n; i <= num; ++i)
        {
            // sum = sum + i;
            sum += i;
        }

        System.out.println("Sum = " + sum);
    }
}