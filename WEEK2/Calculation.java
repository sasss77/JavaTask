// Take side of a square from user and print area and perimeter of it.
// Also, calculate Simple Interest, Area of triangle and Volume of Cube and Cuboid.
// Take the attributes as user input.
import java.util.Scanner;
public class Calculation {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter side of a square: ");
        int side = in.nextInt();
        System.out.println("Area of square: " + side * side);
        System.out.println("Perimeter of square: " + 4 * side);


        System.out.println("Enter principal amount: ");
        double principal = in.nextDouble();
        System.out.println("Enter rate of interest: ");
        double rate = in.nextDouble();
        System.out.println("Enter time: ");
        double time = in.nextDouble();
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + simpleInterest);


        System.out.println("Enter base of a triangle: ");
        double base = in.nextDouble();
        System.out.println("Enter height of a triangle: ");
        double height = in.nextDouble();
        double areaOfTriangle = 0.5 * base * height;
        System.out.println("Area of triangle: " + areaOfTriangle);


        System.out.println("Enter length of a cube: ");
        double length = in.nextDouble();
        System.out.println("Enter breadth of a cube: ");
        double breadth = in.nextDouble();
        System.out.println("Enter height of a cube: ");
        double heightCube = in.nextDouble();
        double volumeOfCube = length * breadth * heightCube;
        System.out.println("Volume of cube: " + volumeOfCube);


        System.out.println("Enter length of a cuboid: ");
        double lengthCuboid = in.nextDouble();
        System.out.println("Enter breadth of a cuboid: ");
        double breadthCuboid = in.nextDouble();
        System.out.println("Enter height of a cuboid: ");
        double heightCuboid = in.nextDouble();
        double volumeOfCuboid = lengthCuboid * breadthCuboid * heightCuboid;
        System.out.println("Volume of cuboid: " + volumeOfCuboid);
        in.close();
    }
}
