/* Cost of land is 560 rupees per square feet. Accept number of
square feet from user and calculate total cost*/

import  java.util.Scanner;
public class Eight 
{
 public static void main(String arg[])
{

int per_Square_feet=560;
int num;
Scanner sc =new Scanner(System.in);
System.out.println("Enter any Number:-");
num =sc.nextInt();

     int total_cost=  per_Square_feet * num;
    System.out.println("Total Cost of land is:-"+total_cost);
   
    }
}