package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double rad = 0.0;
        int i = 0;

        System.out.println("Enter the radius of your circle: ");
//        if (input.next(String, ".+")) {
//                i = 1;
//                System.out.println("Not a number. Try again.");
//        }
        while (i <= 0) {
            System.out.println("Enter the radius of your circle: ");
//            rad = input.nextDouble();
            if (input.hasNextDouble()) {
                rad = input.nextDouble();
                i = 1;
                if (rad <= 0.0) {
                    i = 0;
                    System.out.println("Try again.");
                }
            } else {
                    i = 1;
                    rad = input.nextDouble();
                }
        }
//        Double area = PI * rad * rad;
        Double area = GetArea.getArea(rad);
        System.out.println("The area of a circle of radius " + rad + " is: " + area + ".");
        input.close();
    }
}
