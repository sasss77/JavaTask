import java.util.Scanner;
public class ScannerInput {
    public static void main(String[] args) {
        //Creasting Scanner object
        // Scanner is used to take input from the user
        //Scanner Class must be imported in order to take user input
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = in.nextInt(); // nextInt()-- for input integer
        System.out.print("Enter second number: ");
        int b = in.nextInt();
        System.out.println("Sum of two numbers is: " + (a + b));
        System.out.println("The product of two numbers is : " + (a * b));
        System.out.println("the product of calculated sum and product is : " + ((a * b) / (a + b)));
        in.close(); // closing the Scanner object
    }
}
