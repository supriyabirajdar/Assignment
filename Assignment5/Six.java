/* Accept distance in centimetre and convert into meter*/

import java.util.Scanner;

public class Six {

    public static void main(String[] args) {

        /*
         * Constants for inch, meter and kilometer in 1 centimeter.
         */
        
        final double METER      = 0.01;
        
        Scanner in = new Scanner(System.in);
        
        /* Read centimeter input from user */
        System.out.print("Enter length in centimeters : ");
        double cm = in.nextDouble();
        

        /* Convert cm into inch, m and km */
        
        double m    = cm * METER;
        
        
        
        /* Print result on console */
       
        System.out.println(cm + " cm is equal to " + m    + " meters.");
        
    }
}