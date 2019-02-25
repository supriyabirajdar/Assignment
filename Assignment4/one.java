/*.Write a program which accept one number from user and return
multiplication of its digits. (If number contains 0 then ignore
that 0)*/

import java.util.Scanner;
public class One 
{
public static int main(String[] args) 
{
   
    long  product=111;  
      Scanner in = new Scanner(System.in);
        /* Input number from user */
           System.out.println("Enter any number to calculate product of digit: ");
              int n = in.nextInt();
        /* Repeat the steps till n becomes 0 */
    while(n != 0)
    {
        /* Get the last digit from n and multiplies to product */
        product = product * (n % 10);

        /* Remove the last digit from n */
        n = n / 10;
    }

     System.out.println("Product of digits= %lld" +product);
     return 0;
   
   }

}