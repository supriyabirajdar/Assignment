/* Write a program which accept principle amount, time and
create of interest from user and calculate simple interest.*/

import java.util.Scanner;
public class Three
{
    public static void main(String args[]) 
    {
        float principal, rate, time;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Principal : ");
        principal = s.nextFloat();
        System.out.print("Enter the Rate of interest : ");
        rate= s.nextFloat();
        System.out.print("Enter the Time period : ");
        time = s.nextFloat();
       
          float si = (principal * time * rate ) / 100;

        System.out.print("The Simple Interest is : " + si);
    }
}