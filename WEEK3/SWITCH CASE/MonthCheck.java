// Write a Java program that takes an integer input (1 to 12) representing a month and prints the corresponding season 
import java.util.Scanner;
public class MonthCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number between 1 to 12: ");
        int month = in.nextInt();
        switch (month) {
            case 1:
            case 2:
            case 3:
            System.out.println("Winter season");
            break;
            case 4:
            case 5:
            case 6:
            System.out.println("Spring season");
            break;
            case 7:
            case 8:
            case 9:
            System.out.println("Summer season");
            break;
            case 10:
            case 11:
            case 12:
            System.out.println("Autumn season");
            break;
            default:
            System.out.println("Invalid month");
        }
        in.close();
    }
}
