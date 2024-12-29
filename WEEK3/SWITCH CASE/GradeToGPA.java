// grade to GPA (Conversion)
import java.util.Scanner;
public class GradeToGPA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your grade: ");
        char grade = in.next().charAt(0);
        grade = Character.toUpperCase(grade);
        switch (grade) {
            case 'A':
                System.out.println("Your GPA is 4.0");
                break;
            case 'B':
                System.out.println("Your GPA is 3.6");
                break;
            case 'C':
                System.out.println("Your GPA is 2.6");
                break;
            case 'D':
                System.out.println("Your GPA is 1.6");
                break;
            case 'F':
                System.out.println("Your GPA is 0.0");
                break;
            default:
                System.out.println("Invalid grade");

        }
        in.close();
    }
}
