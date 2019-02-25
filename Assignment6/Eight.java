/*Accept three numbers from user and return difference between
largest and smallest digit*/ 
import java.util.Scanner;
 public class Eight
  {
       public static void main(String args[]) throws Exception{               
             
              Scanner sc =new Scanner(System.in); 
              
              System.out.println("Enter any Integer Number: \n"); 
              int num,largestNumber,smallestNumber,rem,copyNumber,diff=0;             
              num= sc.nextInt();
              copyNumber = num;
              smallestNumber=largestNumber=num%10;
             
              while(number>0){
                     rem = num%10;
                     num = num/10;
                     if(rem>largestNumber){
                           largestNumber = rem;
                     }else if(rem<=smallestNumber){
                           smallestNumber = rem;     
                     }                   
              }     
              System.out.println("Input Number   : "+copyNumber+"\nSmallest digit : "+smallestNumber+"\nLargest digit  : "+largestNumber);
              diff=largestNumber-smallestNumber;
            System.out.println("Difference between largest and smallest digit is:"+diff);
       }
}