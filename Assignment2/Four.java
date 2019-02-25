/*   Write a program which accept two numbers from user and display its
largest common factors.*/

import java.util.Scanner;
public class Four
{

 public static void  main(String arg[])

{
    int n1, n2, i, gcd=0;
     Scanner sc =new Scanner(System.in);
    System.out.println("Enter two integers: ");
    n1=sc.nextInt();
    n2=sc.nextInt();

    for(i=1; i <= n1 && i <= n2; ++i)
    {
        // Checks if i is factor of both integers
        if(n1%i==0 && n2%i==0)
            gcd = i;
    }

   System.out.println("G.C.D is-"+ gcd);

   }
}