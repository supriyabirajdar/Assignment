/* Accept on number from user if number is less than 10 then print “Hello”
 otherwise print “Demo”*/

 import java.util.Scanner;
 public class Ten
  {
   public static void main(String[] args) 
     {    	
      Scanner sc=new Scanner(System.in);
	System.out.println("Enter any number:");
           int i=sc.nextInt();
      if (i < 10) 
      {
         System.out.println("Hello");
      }
      else
      {
         System.out.println("Demo");
      }
 
     
   }
}