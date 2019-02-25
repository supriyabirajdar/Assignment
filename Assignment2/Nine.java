/*Accept one number and print that number of elements from Fibonacci
series*/
public class Nine {
public static void main(String[] args) 
		{
			
			 int maxNumber = 9; 
			 int previousNumber = 1;
			 int nextNumber = 1;
			 
		        System.out.print("Fibonacci Series of "+maxNumber+" numbers:");
	 
		        for (int i = 1; i <= maxNumber; ++i)
		        {
		            System.out.print(previousNumber+" ");
		            int sum = previousNumber + nextNumber;
		            previousNumber = nextNumber;
		            nextNumber = sum;
		        }
	 
		}
	 
	}
	


