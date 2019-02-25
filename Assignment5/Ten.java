/*   Write a program which accept length of three sides of triangle
and check whether it is Pythagorean triple or not*/
import java.util.*;
class Ten
{
  
     
  
     public static void main(String args[])
     
        {
           Scanner sc = new Scanner(System.in);
         int a,b,c;
     
        System.out.print("Enter the three number: ");
       
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
 
      if(a*a+b*b==c*c)
         
          System.out.println("Pythagorean triple") ;
      
      else
          System.out.println("Not Pythagorean triple") ;
   }
}