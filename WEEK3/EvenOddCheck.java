
//Check if the number is even or odd
import java.util.Scanner;

public class EvenOddCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        if (num == 0) {
            System.out.println("The number is zero.");
        } else {
            if (num % 2 == 0) {
                System.out.println("The number is even.");
            } else {
                System.out.println("The number is odd.");
            }
        }
    }
}