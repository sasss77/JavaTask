// Ask user to give two double input for length 
// and breadth of a rectangle and print area type casted to int.
import java.util.Scanner;
public class TypeCasting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of rectangle: ");
        double length = in.nextDouble();
        System.out.println("Enter breadth of rectangle: ");
        double breadth = in.nextDouble();
        
        int area = (int) (length * breadth); // -- (int) will convert double type to int type here.
        System.out.println("Area of rectangle is: " + area);
        in.close();
    }
}
