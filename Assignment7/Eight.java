/*Accept one character from user and depends on that character
display its type. */

import java.util.Scanner;
public class Eight
  {
    public static void main(String arg[])
     {
	char ch;
       Scanner sc=new Scanner(System.in);
	System.out.println("Enter any value:");
	ch=sc.next().charAt(0);

	if (ch>=65 && ch<=90)
		System.out.println("Character is a capital letter");
	else if (ch>=97 && ch<=122)
		System.out.println("Character is a small letter");
	else if (ch>=48 && ch<=57)
		System.out.println("Character is a digit");
	else if ((ch>0 && ch<=47)||(ch>=58 && ch<=64)||
               (ch>=91 && ch<=96)||(ch>=123 && ch<=127))
		System.out.println("Character is a special symbol");
	
        }
 }

 