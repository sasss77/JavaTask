//Java program to find maximum between 3 numbers
import java.util.Scanner;
public class FindMaximum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        int num1 = in.nextInt();
        System.out.print("Enter second Number: ");
        int num2 = in.nextInt();
        System.out.print("Enter third Number: ");
        int num3 = in.nextInt();
        System.out.println();
        if (num1 > num2 && num1 > num3) {
            System.out.println("Maximum number is: " + num1);
        }
        if (num2 > num1 && num2 > num3) {
            System.out.println("Maximum number is: " + num2);
        }
        else {
            System.out.println("Maximum number is: " + num3);
        }
        in.close();
    }
}
