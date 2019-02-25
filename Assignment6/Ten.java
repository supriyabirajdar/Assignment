import java.util.Scanner;
public class Ten 
{
     public static void main(String args[])
     {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();
        int ld = 0;
        int ldf = 0;//Last digit Factorial
       
       for(int i=num; i>0;i=i/10){
            ld = i%10;//Getting last digit
            for(int j=1; j<=ld;j++){
                ldf=ldf*j;//Calculating factorial of last digit
            }
        }
        System.out.println(ldf);
        
    }
}