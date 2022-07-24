package exercises.chapter3;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Word length to search: ");
        int length = input.nextInt();
//        int length = 4;
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(13);
        integers.add(15);
        integers.add(76);
        integers.add(34);
        integers.add(79);
        integers.add(132);
        integers.add(7);
        integers.add(134);
        integers.add(89);
        integers.add(45);
        integers.add(234);
        integers.add(12);
        integers.add(23);
        integers.add(727);
        integers.add(53);
        integers.add(134);
        integers.add(58);

        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("bob");
        wordList.add("cat");
        wordList.add("patio");
        wordList.add("mobster");
        wordList.add("the");
        wordList.add("builder");
        wordList.add("flout");
        wordList.add("speck");
        wordList.add("arose");
        wordList.add("louder");
        wordList.add("pea");
        wordList.add("notes");
        wordList.add("exacerbate");
        wordList.add("LaunchCode");
        wordList.add("watch");

        String str = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        ArrayList<String> altWordList = ArrayListPractice_Method.stringToArray(str, " ");
//        System.out.println("wordlist" + altWordList);
        ArrayListPractice_Method.sumEvenNumbers(integers);
        ArrayListPractice_Method.findWordsOfLength(altWordList, length);
    }
}
