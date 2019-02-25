/*  Write a program which accept 7 number from user and return
number which is nearest to 90 */

import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class Ten { 
      
  public static int findClosest(int arr[], int target) 
    { 
        int n = arr.length; 
   if (target <= arr[0]) 
            return arr[0]; 
        if (target >= arr[n - 1]) 
            return arr[n - 1]; 
      int i = 0, j = n, mid = 0; 
        while (i < j) { 
            mid = (i + j) / 2; 
  
            if (arr[mid] == target) 
                return arr[mid]; 
            if (target < arr[mid]) { 
         
                if (mid > 0 && target > arr[mid - 1])  
                    return getClosest(arr[mid - 1],  
                                  arr[mid], target); 
                   j = mid;   
               
                    } 
            else { 
                if (mid < n-1 && target < arr[mid + 1])  
                    return getClosest(arr[mid],  
                          arr[mid + 1], target);                 
                i = mid + 1; // update i 
            } 
        } 
          return arr[mid]; 
    } 
  
 public static int getClosest(int val1, int val2, int target) 
    { 
        if (target - val1 >= val2 - target)  
            return val2;         
        else 
            return val1;         
    } 
   public static void main(String[] args) 
    { 
         int [] arr = new int[7];
     int i;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter array Element:-");
       for (i = 0; i < 7; i++)
		{
			arr[i] = sc.nextInt();
		}   
        int target = 90; 
        System.out.println(findClosest(arr, target)); 
    } 
} 