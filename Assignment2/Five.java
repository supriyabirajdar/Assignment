/* Accept two characters from user and swap contents of that two
characters*/

import java.util.Scanner;
class Five
{
	public static void main(String []s)
	{
		
		
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter value of ch1: ");
		char ch1 = sc.next().charAt(0);
		System.out.print("Enter value of ch2: ");
		char ch2 = sc.next().charAt(0);

		System.out.println("Before swapping - ch1: "+ ch1 +", ch2: " + ch2);
		
		char temp;
		temp=ch1;
		ch1=ch2;
		ch2=temp;
		
		System.out.println("\nAfter swapping  - ch1: "+ ch1 +", ch2: " + ch2);
	}
}