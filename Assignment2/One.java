/*  Write a program which accept one number from user and print that
number of even numbers on screen.*/
import java.util.Scanner;
import java.*;
public class One 
{

 public static void main(String arg[])

{
    int  i,n ,even=0;
     Scanner sc =new Scanner(System.in);
      
        System.out.println("enter any value:-");
        n = sc.nextInt();
         int arr[]=new int[n];
        
      System.out.println("enter elements");

        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }
     System.out.println("Even numbers are:");
    for(i=0; i<n; i++)
    {
      
        if(arr[i] %2 == 0)
        {
           even= arr[i];
            System.out.println(even);
         }
    
     
       }
   }
}