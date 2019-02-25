/*1.Write a program which accept one number from user and return
smallest digit*/
import java.lang.*;
import java.util.Scanner;

class One {

    public static void main(String args[]) {

        int r, n, sm = 9;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        n = sc.nextInt();

        while (n > 0) {
            r = n % 10;
            if (sm > r) {
                sm = r;
            }
            n = n / 10;
        }

        System.out.println("\nThe Smallest Digit is :" + sm);

    }
}

