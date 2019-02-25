/* Write a program which accept one number from user and
return addition of its odd digits*/

import java.util.Scanner;

class Nine {

    public static void main(String args[]) {

        int n, r, s = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        n = sc.nextInt();

        while (n > 0) {
            r = n % 10;
            if (r % 2 != 0) {
                s = s + r;
            }
            n = n / 10;
        }

        System.out.print("\nSum of odd Digits :" + s);

    }
}