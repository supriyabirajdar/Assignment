/* Write a program which accept 10 numbers from user and
display only even numbers from them */

import java.util.Arrays;
import java.util.Scanner;
public class One
{
  
 public static void main(String args[])
    {
   
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the length of the array:");
      int length = s.nextInt();
      int [] myArray = new int[length];
      System.out.println("Enter the elements of the array:");
      for(int i=0; i<length; i++ )
    {
         myArray[i] = s.nextInt();
      }

      for (int i=0; i<myArray.length; i++){
         if(myArray[i]%2 == 0)
       {
            System.out.println(myArray[i]);
         }
      }
      
   }
}