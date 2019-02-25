import java.util.Scanner;

public class Three {

    public static void main(String[] args) {

        long hours;

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter hours:");

        hours = in.nextLong();
        long minutes = hours * 60;

        System.out.println(minutes + " Minutes");

    }
}