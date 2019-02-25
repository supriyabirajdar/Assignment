/*. Accept number from user and check whether it is Armstrong
number or not. Armstrong number is a number that is the sum of
its own digits each raised to the power of the number of digits is
same as the given number. */
import java.util.Scanner;
public class Four {

    public static void main(String[] args) {
 
        Scanner sc=new Scanner(System.in);
        int  originalNumber, remainder, result = 0;

        System.out.println("Enter any number:");
         int number=sc.nextInt();
        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}