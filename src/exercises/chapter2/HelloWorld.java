package exercises.chapter2;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, uh... what's your name again?");
        String name = input.nextLine();
        System.out.println("\nThanks! Hello, " + name + ". ");
        input.close();
    }
}
