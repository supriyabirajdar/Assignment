/*  Accept on character from user and check whether that character is vowel
(a,e,i,o,u) or not*/
import java.util.Scanner;
class Ten
{
	void findVowelOrNot(char ch)
	{
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
		System.out.println("True"); 
		}
		else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
			System.out.println("False ");
		      else
			System.out.println("Not an alphabet");		
	}
	public static void main(String[ ] arg)
	{
		Ten c=new Ten();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character : ");
		char in=sc.next( ).charAt(0);	 		
		c.findVowelOrNot(in);
	}
}