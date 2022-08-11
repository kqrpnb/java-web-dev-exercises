package exercises.chapter2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, uh... what's your name again?");
        String name = input.nextLine();
        System.out.println("\nThanks! Hello, " + name + ". ");
        input.close();

        Integer[] intArray = new Integer[]{1, 2, 3, 4, 5};
        String[] nameArray = new String[]{"John", "Mark", "Joe", "Bill", "Connor"};

        List<Integer> intList = new ArrayList<>(Arrays.asList(intArray));
        List<String> nameList = new ArrayList<>(Arrays.asList(nameArray));

        System.out.println(intList.contains(12));
        System.out.println(nameList.contains("John"));
    }
}
