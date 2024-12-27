// Write a program to calculate, area of the triangle, and the Volume of the Cube and Cuboid.
import java.util.Scanner;
public class AreaVolume {
    public static void main(String[] args) {
        //creating Scanner object
        Scanner in = new Scanner(System.in);
        System.out.println("Calculating area of triangle...");
        System.out.print("Enter the base of triangle: ");
        int base = in.nextInt();
        System.out.print("Enter the height of triangle: ");
        int height = in.nextInt();
        double area = 0.5 * base * height;
        System.out.println("Area of triangle is: " + area);
        System.out.println("Calculating volume of cube...");
        System.out.print("Enter the side of cube: ");
        int side = in.nextInt();
        int volume = side * side * side;
        System.out.println("Volume of cube is: " + volume);
        in.close();
        
    }}
