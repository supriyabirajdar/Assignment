//Accept range from user and addition of all numbers between that range.
 import java.util.Scanner;
 public class Nine
 {
	  public static void main(String[] args)
	  {
		  Scanner s = new Scanner(System.in);
		  System.out.println("Enter the first number:");
		  int a = s.nextInt();
		  System.out.println("Enter the second number:");
		  int b = s.nextInt();
		  sumRange(a,b);
	  }
	  
	  public static void sumRange(int x,int y)
	  {
		  while(x<=y)
		  {
			  int sum = 0;
			  sum = sum + x;
			  System.out.print(" "+sum+" ");
			  x++; 
		  }
	  }
 }