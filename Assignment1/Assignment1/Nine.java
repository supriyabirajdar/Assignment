/* Accept one number and return that number by subtracting 5 from it. */

import java.util.Scanner;
import java.lang.*;
class Nine
{
    public static void main(String args[])
    {
        int n1;
       Scanner sc=new Scanner(System.in);
        
       System.out.println("Enter any number: ");
          n1=sc.nextInt();
        
         int sub= n1-5;
      System.out.println("Subtraction of the given numbers is: " +sub);
 
    }
}