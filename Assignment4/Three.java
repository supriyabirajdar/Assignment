/*Write a program which accept one number from user and
return the occurrence of digit 5 */

import java.util.Scanner;
public class Three
{
    public static void main(String[] args) 
    {
     int num,i,n,k;
     Scanner s = new Scanner(System.in);
     System.out.print("Enter any number:");
     num = s.nextInt();
     n=num;
     i=0;
      while(n!=0)
        {
          k=n%10;
          n=n/10;
           if(k==5)
             {
                i++;
             }
          }
      System.out.println("\nThe occurrence of 5 is times:-"+i);

   }
}