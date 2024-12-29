//check wherther the number is positive, negatve or zero
import java.util.Scanner;

public class PolarCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer nummber: ");
        int a = in.nextInt();
        if (a > 0) {
            System.out.println("The number is positive");
        } else if (a == 0) {
            System.out.println("The number is zero");
        } else
            System.out.println("The number is negative");
        in.close();

    }
}