/* Write a program which accept 5 floats from user and display all
such numbers which are greater than 8.9*/

import  java.util.Scanner;

class Four {
public static void main(String a[])
{

    double  greatest = 8.9d;
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the size of an Array");

    int num = input.nextInt();

    System.out.println("Enter the Element "+num+" of an Array");

    double[] numbers = new double[num];

    for (int i = 0; i < numbers.length; i++)
    {

        System.out.println("Please enter number");

        numbers[i] = input.nextDouble();

    }


     for (int i = 0; i < num; i++)
       {  
          if (numbers[i] > greatest)
             {  
               System.out.println("Greatest number is=" +numbers[i]);
              }
        
        } 
     }
}