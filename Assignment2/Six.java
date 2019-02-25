/*  Accept two integers from user and swap contents of that two integers
without using temporary variable*/

import java.*; 
import java.util.Scanner;  
class Six { 
  
    public static void main(String a[]) 
    { 
        Scanner sc = new Scanner(System.in);
     System.out.println("Enter First values X=:");
         int  x=sc.nextInt();
       System.out.println("Enter Second values Y=:");
         int  y=sc.nextInt();
       
        x = x + y; 
        y = x - y; 
        x = x - y; 
        
      System.out.println("After swaping:"  + " x = " + x + ", y = " + y); 
    } 
} 