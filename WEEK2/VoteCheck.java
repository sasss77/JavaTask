// Write a program to check whether a person can cast a vote or not. 
// The condition is you must be over 18 years old to vote.
import java.util.Scanner;
public class VoteCheck {
    public static void main(String[] args) {
        int age = 18;
        //creating Scanner object
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the age of a person: ");
        int input = in.nextInt();
        //check the condition
        if (input >= 18) {
            System.out.println("The person is eligible to vote");
        }
        else {
            System.out.println("The person is not eligible to vote");
        }
        //Closing Scanner Object
        in.close();
    }
}
