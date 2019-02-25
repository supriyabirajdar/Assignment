/* Write a program which accept two numbers from user and
calculate its power*/
import java.util.Scanner;
public class One{

    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
        int base , exponent ;
       System.out.println("Enter any number for Base:");
        base =sc.nextInt();
      System.out.println("Enter any number for  exponent:");
       exponent   =sc.nextInt();
        long result = 1;

        for (;exponent != 0; --exponent)
        {
            result *= base;
        }

        System.out.println("Answer = " + result);
    }
}