/*Accept range from user and print all even numbers between that range*/

	public class Eight {

		 
		public static void main(String[] args) {
			
			//define limit
			int limit = 17;
			
			System.out.println("Printing Even numbers between 10 and " + limit);
			
			for(int i=10; i <= limit; i++){
				
				if( i % 2 == 0){
					System.out.print(i + " ");
				}
			}
		}
	}

