/*  Accept range from user and display below output*/
import java.util.Scanner;
public class Seven {

	    public static void main(String[] args) {

                Scanner sc =new Scanner(System.in);
                       int low ,high;
                System.out.println("Enter low value:");
                  low=sc.nextInt();
	        System.out.println("Enter high value:");
                  high=sc.nextInt();

	        while (low <= high) {
	            boolean flag = false;

	            if (!flag)
	                System.out.print(low + " ");

	            ++low;
	        }
	    }
	}

