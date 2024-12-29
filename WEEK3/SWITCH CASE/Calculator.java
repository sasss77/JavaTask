// Calculator program
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        // creating Scanner Object
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = in.nextInt();
        System.out.print("Enter second number: ");
        int n2 = in.nextInt();
        System.out.println("Enter your choice: '+', '-', '*', '/'");
        char choice = in.next().charAt(0);
        switch (choice) {
            case '+':
                System.out.println("Result: " + (n1 + n2));
                break;
            case '-':
                System.out.println("Result: " + (n1 - n2));
                break;
            case '*':
                System.out.println("Result: " + (n1 * n2));
                break;
            case '/':
                if (n2 != 0) {
                    System.out.println("Result: " + (n1 / n2));
                }
                else {
                    System.out.println("Error: Division by zero is not allowed");
                }
                break;
            default:
            System.out.println("Error: Invalid choice");
        }
        in.close();
    }
}
