/* Accept rad ius of c irc le from user and ca lcu late its
circumference (2*PI*R)*/

import java.util.Scanner;
class Seven
{
   static Scanner sc = new Scanner(System.in);
   public static void main(String args[])
   {
      System.out.print("Enter the radius: ");
      

      double radius = sc.nextDouble();
     
      

      
      double circumference=  2* Math.PI * radius;

      System.out.println( "The circumference of the circle is:"+circumference) ;
   }
}