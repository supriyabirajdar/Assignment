/*  Accept one number from user and print that number of * on screen. */
import java.util.Scanner;
public class Five
{

  public static void main(String arg[]) 
  
   {
    int i, n;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter any Number: ");
     n= sc.nextInt();

    i = 0;
    for (i=0; i < n; i++) 
     {
        System.out.println("*\n");
     }
 
   
   
     } 
  }