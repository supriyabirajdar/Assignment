/*Accept one numbers from user and count digits which are
greater than 5*/
  
import java.io.*; 
  
class Seven { 
  
  

static int countSegments(int a[], int n, int x) 
{ 
    boolean flag = false; 
  
    int count = 0; 
  
   
    for (int i = 0; i < n; i++) { 
  
       
        if (a[i] > x) { 
            flag = true; 
        } 
        else { 
  
            // if flag is true 
            if (flag) 
                count += 1; 
  
            flag = false; 
        } 
    } 
  
   
    if (flag) 
        count += 1; 
  
    return count; 
} 
  

  
    public static void main (String[] args) { 
        int a[] = { 8, 25, 10, 19, 19, 18, 20, 11, 18 }; 
    int n =a.length; 
    int x = 13; 
    System.out.println(countSegments(a, n, x)); 
    } 
} 
