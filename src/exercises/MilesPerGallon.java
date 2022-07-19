package exercises;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the miles you've traveled: ");
        double miles = input.nextDouble();
        System.out.println("Please enter the number of gallons you've consumed: ");
        double gallons = input.nextDouble();
        double mpg = miles / gallons;
        System.out.println("Your MPG is " + mpg);
        input.close();
    }
}
