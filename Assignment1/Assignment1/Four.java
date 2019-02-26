/* Accept one number and check whether is is divisible by 5 or not*/
import java.util.Scanner;
public class Four
{
  public static void main(String arg[])
{
        int a;
        
        Scanner sc= new Scanner(System.in);
         System.out.println("Enter the no.");
         a= sc.nextInt();
         
     if(a%5==0)
          {
             System.out.println("No.is Divisible by 5");
          }
         else
         {
               System.out.println("No is not Divisible by 5");
         }
              
}
}