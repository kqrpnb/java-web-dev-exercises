package exercises.chapter2;
import java.util.Scanner;

public class SearchAliceExtended {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = "Alice was beginning to get very tired of sitting by her sister on the " +
                "bank, and of having nothing to do:\n once or twice she had peeped into the " +
                "book her sister was reading, \nbut it had no pictured or conversations in " +
                "it, 'and what is the use of a book,' thought Alice \n'without pictures or " +
                "conversation?'";
        System.out.println("Enter a word to search for: ");
        String term = input.nextLine();
        int index = text.toLowerCase().indexOf(term.toLowerCase());
        System.out.println("The first index of " + term + " is [" + index + "] and has a length of " + term.length() + ".");
        String newText = text.replaceFirst(term + " ", "");
        System.out.println("If you remove \"" + term + "\" the text becomes:" + text.replaceFirst(term + " ", ""));
//        System.out.println(newText);
        input.close();
    }
}
