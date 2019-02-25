/*   Write a program which accept number from user and print even factors of
that number*/
import java.util.Scanner;
public class Two {

    public static void main(String[] args) {

        int number,i;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter any number=");
            number= sc.nextInt();
      
     System.out.println("All Even Factors are:");
    for(i=1; i<=number; i++)
    {
       
        if(number % i == 0)
        {
          if(i%2==0){

           System.out.println(i);}
          }
       }
    }
}
