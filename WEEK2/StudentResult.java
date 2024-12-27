// Write a program to calculate the total marks of four subjects
//  of a student and the total percentage secured
//  using ternary operator.
// a. If equal to or more than 70 -> First Class

// b. If more than 59 -> Upper Second Class

// c. If more than 49 -> Second class

// d. If more than 39 -> Third class and if below than 40 the result is fail. 
import java.util.Scanner;
public class StudentResult {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter marks of subject 1: ");
        int marks1 = in.nextInt();
        System.out.println("Enter marks of subject 2: ");
        int marks2 = in.nextInt();
        System.out.println("Enter marks of subject 3: ");
        int marks3 = in.nextInt();
        System.out.println("Enter marks of subject 4: ");
        int marks4 = in.nextInt();
        int total = marks1 + marks2 + marks3 + marks4;
        double percentage = (total * 100) / 400;
        String result = (percentage >= 70) ? "First Class"
                : 
                (percentage >= 60) ? "Upper Second Class"
                        : 
                        (percentage >= 50) ? "Second Class" : 
                            (percentage >= 40) ? "Third Class" : "Fail";
        System.out.println("Total marks: " + total);
        System.out.println("Total percentage: " + percentage + "%");
        System.out.println("Result: " + result);
        in.close();

    }
}
