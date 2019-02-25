/*  Write a program which accept 8 numbers from user and print
number of digits of each number*/

import java.util.Scanner;
public class Seven {
    public static void main(String[] args) {
        int num, i, digSum = 0;
        Scanner scanner;
        scanner = new Scanner(System.in);
 
        System.out.println("Enter an Integer");
        num = scanner.nextInt();
 
        while (num != 0) {
            digSum += num % 10;
             num = num / 10;
        }
 
        System.out.format("Sum of Digits = "+digSum);
    }
}