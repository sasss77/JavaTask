//check if the number is divisible by 5 and 11 or not
import java.util.Scanner;

public class DivisibleCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = in.nextInt();
        if (a % 5 == 0 && a % 11 == 0) {
            System.out.println(a + " is divisible by 5 and 11");
        }
        else
            System.out.println(a + " is not divisible by 5 and 11");
        in.close();
    }
}
