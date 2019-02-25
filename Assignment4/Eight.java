/* Accept three numbers from user and count occurrence of 0*/

import java.util.Scanner;
public class Eight
{
    public static void main(String[] args) 
    {
     int num,i,n,k;
     Scanner s = new Scanner(System.in);
     System.out.print("\nEnter any number:");
     num = s.nextInt();
     n=num;
     i=0;
      while(n!=0)
        {
          k=n%10;
          n=n/10;
           if(k==0)
             {
                i++;
             }
          }
      System.out.println("\nThe occurrence of 0 is times:-"+i);

int num1,i1,n1,k1;
     
     System.out.print("Enter any number:");
     num1 = s.nextInt();
     n1=num1;
     i1=0;
      while(n1!=0)
        {
          k1=n1%10;
          n1=n1/10;
           if(k1==0)
             {
                i1++;
             }
          }
      System.out.println("\nThe occurrence of 0 is times:-"+i1);
     int num2,i2,n2,k2;
     
     System.out.print("\n Enter any number:");
     num2 = s.nextInt();
     n2=num2;
     i2=0;
      while(n2!=0)
        {
          k2=n2%10;
          n2=n2/10;
           if(k2==0)
             {
                i2++;
             }
          }
      System.out.println("\nThe occurrence of 0 is times:-"+i2);

   }
}