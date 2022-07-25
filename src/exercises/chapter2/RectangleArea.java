package exercises.chapter2;
import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the length: ");
        double len = input.nextDouble();
        System.out.println("Please enter the width: ");
        double wid = input.nextDouble();
        double area = wid * len;
        System.out.println("The area is " + area);
        input.close();
    }
}
