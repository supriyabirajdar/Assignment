/* Program to divide two numbers*/
import java.util.Scanner;
 
public class One
{
    public static void main(String args[])
  {
    int first, second;
    float divide;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter Two Numbers : ");
    first = scanner.nextInt();
    second = scanner.nextInt();

    
    divide = (float) first / second;
    System.out.println("Division = " + divide);
  }
}