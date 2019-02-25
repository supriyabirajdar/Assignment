/*Accept radius of circle from user and calculate its area
(PI*R*R)*/

import java.util.Scanner;

class Five
{
  
 
    static Scanner sc = new Scanner(System.in);
   
     public static void main(String args[])
       {
               
          System.out.print("Enter the radius: ");
      
      
            double radius = sc.nextDouble();
            double circumference= Math.PI * 2*radius;
                 
              System.out.println( "The circumference of the circle is:"+circumference) ;
   }
}