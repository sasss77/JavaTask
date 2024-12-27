//checks if the persion is eligible to vote using Ternary operator
import java.util.Scanner;
public class TernaryOperator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int num = in.nextInt();
        
        String result = (num >= 18) ? "Eligible to vote" : "Not eligible to vote";
        System.out.println(result);
    }
}
