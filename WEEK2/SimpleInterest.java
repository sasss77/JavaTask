// Write a program to calculate SI. 
// Formula Simple Interest = (PrincipleAmount*Time*Rate/100);
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        //creating Scanner object
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the principal amount: $");
        double principle = in.nextDouble();
        System.out.print("Enter the time(year*): ");
        double time = in.nextDouble();
        System.out.print("Enter the rate: ");
        double rate = in.nextDouble();
        //Calculating SI
        double simpleInterest = (principle * time * rate / 100);
        System.out.print("Simple Interest: $" + simpleInterest);
        //Closing Scanner Object
        in.close();
    }
}
