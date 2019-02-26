//Write a program which accept one number from user and
//return difference between addition of its even digits and addition of odd digits.
//1234
//2
import java.util.Scanner;
public class Ten
{
public static void main(String args[])
{
int num;
int odd=0;
int even=0;
int rem=0;
int count=0;

Scanner s = new Scanner(System.in);
System.out.print("Enter any number: ");
int n = s.nextInt();
num=n;
while(num!=0)
{
	rem=num%10;
	if(rem%2!=0)
	{ 
		odd=odd+rem;
	}
	if(rem%2==0)
	{ 
		even=even+rem;
	}
	num=num/10;
}
count=even-odd;
System.out.print(""+count);
}
}	
	