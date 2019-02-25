/*. Accept radius from user and return circumference of circle*/

import java.util.Scanner;
class  Five
{
   static Scanner sc = new Scanner(System.in);
   public static void main(String args[])
   {
      System.out.print("Enter the radius: ");
      double radius = sc.nextDouble();
    
      double area = Math.PI * (radius * radius);
      System.out.println("The area of circle is: " + area);
   }
}