/* Accept one number from user and print that number of * on screen*/

import java.util.Scanner;
public class Seven
{

  public static void main(String arg[]) 
  
   {
    int i=1,j, n;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter any Number: ");
     n= sc.nextInt();

    j=n;                                                                       
                                                          
       while(j>=i )                                                             
       {                                                                      
          System.out.print(" * ");                                                       
          j--;                                                                 
       }                                                                      
                                                             
                                                                         
     }  
     
  }