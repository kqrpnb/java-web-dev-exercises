package exercises;
import java.util.Scanner;

public class SearchAlice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = "Alice was beginning to get very tired of sitting by her sister on the" +
                "bank, and of having nothing to do: once or twice she ahd peeped into the" +
                "ook her sister was reading, but it had no pictured or conversations in" +
                "it, 'and what is the use of a book,' thought Alice 'without pictures or" +
                "conversation?'";
        System.out.println("Enter a word to search for: ");
        String term = input.nextLine();
        boolean exists = text.toLowerCase().contains(term.toLowerCase());
        System.out.println(term + " does exist in the text");
        input.close();
    }
}
