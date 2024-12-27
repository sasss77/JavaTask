// Take the name, roll number, and field of interest from the user
// and print in the format below: Hey, my name is XYZ and my roll number is XYZ. My field of interest are xyz.

import java.util.Scanner;
public class UserData {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = in.nextLine(); // nextString() --takes String input
        System.out.println("Enter your roll number:");
        int rollNumber = in.nextInt(); // nextInt() --takes int input
        in.nextLine();
        System.out.println("Enter your field of interest:");
        String fieldOfInterest = in.nextLine(); // nextLine() --takes String input
        System.out.println("Hey, my name is " + name + " and my roll number is " + rollNumber
                + " and my field of Interest is " + fieldOfInterest);
        in.close();
    }
}
