//check if the alphabet is vowel or not
import java.util.Scanner;

public class VowelCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any alphabet: ");
        char ch = in.next().charAt(0);
        char ch1 = Character.toUpperCase(ch);
        if (ch1 == 'A' || ch1 == 'E' || ch1 == 'I' || ch1 == 'O' || ch1 == 'U') {
            System.out.println(ch + " is a vowel.");
        }
        else {
            System.out.println(ch + " is consonent.");
        }
        in.close();
    }
}
