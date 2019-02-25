/*  Accept one numbers from user and display below pattern as. */

public class Seven{

    public static void main(String[] args) {
        int rows = 3;

        for(int i = rows; i >= 1; --i) {
            for(int j = i; j >= 1; --j) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}