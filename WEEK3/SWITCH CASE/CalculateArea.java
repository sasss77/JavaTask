
// Implement a Java program that calculates the area of different shapes (circle, rectangle, square, triangle) based on the user's choice using a switch case.
import java.util.Scanner;

public class CalculateArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Choose a shape to calculate its area: ");
        System.out.println("Circle\nRectangle\nSquare\nTriangle");
        System.out.println("Enter your choice:");
        String choice = in.nextLine();
        switch (choice) {
            case "Circle":
                System.out.println("Enter radius:");
                double radius = in.nextDouble();
                System.out.println("Area of circle: " + Math.PI * radius * radius);
                break;
            case "Rectangle":
                System.out.println("Enter length and breadth:");
                double length = in.nextDouble();
                double breadth = in.nextDouble();
                System.out.println("Area of rectangle: " + length * breadth);
                break;
            case "Square":
                System.out.println("Enter side:");
                double side = in.nextDouble();
                System.out.println("Area of square: " + side * side);
                break;
            case "Triangle":
                System.out.println("Enter base and height:");
                double base = in.nextDouble();
                double height = in.nextDouble();
                System.out.println("Area of triangle: " + 0.5 * base * height);
                break;

            default:
                System.out.println("Invalid choice");
        }
        in.close();
    }
}
