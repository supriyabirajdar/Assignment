/* Write a program which accept 8 numbers from user and print
prime numbers from them */

import java.util.Scanner;
public class Five
{
public static void main(String arg[])
{
     int i,n,j,counter;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the size of the array ");
     n=sc.nextInt();
    int[] ar = new int [100];
      System.out.println("\n Now enter the elements of the array");
     for(i=0;i<n;i++)
     {
             ar[i] = sc.nextInt();
     }
   
     System.out.println("\n All the prime numbers in the array are -");
     for(i=0;i<n;i++)
     {
           counter=0;
           for(j=2;j<ar[i];j++)
           {
                 if(ar[i]%j==0)
                 {
                       counter=1;
                       break;
                 }
           }
           if(counter==0)
           {
                 System.out.println(ar[i]);
           }
     }
     
}
}