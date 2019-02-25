/* Accept one numbers from user and return its reverse number*/

import java.util.Scanner;
public class Five {

    public static void main(String[] args) {

        int  reversed = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number to be reversed : ");
        int num = s.nextInt();
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}