package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double rad = 0.0;

        while (rad <= 0.0) {
            System.out.println("Enter the radius of your circle (positive value): ");
            if (input.hasNextDouble()) {
                rad = input.nextDouble();
            } else {
                System.out.println("Provide a numeric value.");
                input.next();
            }
        }

 /*       do {
            System.out.println("Enter the radius of your circle: ");
            if (!input.hasNextDouble()) {
                System.out.println("Please enter numeric value!");
            }

            if (input.hasNextDouble()) {
                if (input.nextDouble() >= 0.0) {
                    rad = input.nextDouble();
                }
            }
            System.out.println("Try again.");
        } while (rad <= 0.0);

//            input.next();
//        Double area = PI * rad * rad;
  */ // garbage!
        Double area = Circle.getArea(rad);
        System.out.println("The area of a circle of radius " + rad + " is: " + area + ".");
        input.close();
    }
}
