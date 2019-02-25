/* Accept one numbers from user and display the output as. */

import java.util.*;
import java.io.*;
public class  Four
{
    public static void main(String []args)
    {
        String []nos={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int no=sc.nextInt();
        int r;
        String res="";
         while(n > 0)
        {
            r=no%10;
            res = nos[r] + " " + res;
            no /= 10;
          
        }
        System.out.print("\n " + res);
    }
}