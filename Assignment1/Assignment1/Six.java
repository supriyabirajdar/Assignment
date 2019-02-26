/* Accept one number from user and print that number of * on screen. */

import java.util.Scanner;
public class Six
{

  public static void main(String arg[]) 
  
   {
    int i, n;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter any Number: ");
     n= sc.nextInt();

    i=n;                                                                       
                                                          
      int j=1;                                                                    
      while(j<=i)                                                             
       {                                                                      
          System.out.print(" * ");                                                       
         j++;                                                                 
       }                                                                      
                                                             
                                                                         
     }  
     
  }