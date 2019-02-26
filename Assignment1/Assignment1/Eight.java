/*Accept one character from user and display that character on screen. */
import java.util.Scanner; 
public class Eight
{ 
    public static void main(String[] args) 
    { 
         
        Scanner sc = new Scanner(System.in); 
   
        System.out.println("Enter any Character:");
        char c = sc.next().charAt(0); 
   
         
        System.out.println("character is = "+c); 
    } 
}