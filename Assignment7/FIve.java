/*Accept one numbers from user and display frequency of each
digit*/

import java.util.Scanner;
public  class Five
{
public static void main(String[] args) {
	
       Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the number");
	int number = scanner.nextInt();
	
	int[]  Array = new int[10];
	int remainder = 0;
	while (number > 0)
		 {
		remainder = number % 10;
		Array[remainder]++;
		number = number / 10;
		}
	System.out.println("Number\tFrequency");
        for (int counter = 0; counter < Array.length; counter++)
       {
		int  Count = Array[counter];
		if (Count != 0) {
			System.out.println(counter + "\t" +Count);
		}
	}
    
     }
}
	

	
	
	
        