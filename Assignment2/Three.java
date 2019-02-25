/*  Write a program which accept two numbers from user and display its
common factors*/

import java.util.Scanner;
public class Three
{

 public static void  main(String arg[])

{
    int n1, n2, i=1;
     Scanner sc =new Scanner(System.in);
    System.out.println("Enter two integers: ");
    n1=sc.nextInt();
    n2=sc.nextInt();

    while( (i<= n1/2) && (i<=n2/2) )
        {
        
        if((n1 % i == 0) && (n2 % i == 0))
          System.out.println("Common factors is=" +i);
          i++;
          }

   }
}