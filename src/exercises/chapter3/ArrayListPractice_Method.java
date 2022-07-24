package exercises.chapter3;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice_Method {
    public static void sumEvenNumbers (ArrayList<Integer> list) {
        int total = 0;
        for (int i : list) if (i % 2 == 0) total += i;
        System.out.println("Total: " + total);
//        return total;
    }

    public static void findWordsOfLength(ArrayList<String> list, int length) {
        for (String str : list) if (str.length() == length) System.out.println(str);
    }

    public static ArrayList<String> stringToArray(String phrase, String delim) {

        String[] words = phrase.split(delim);
        System.out.println("wordlist split " + Arrays.asList(words));

        // check each word for non-alpha
        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            // create ch[] from words.word
            char[] ch = new char[word.length()];
            for (int j = 0; j < word.length(); j++) {
                ch[j] = word.charAt(j);
            } //j for

            // create newChar[] of ch[].length
            char[] newCh = new char[word.length()];
            int newLength = 0;

            // check each ch[].isLetter()
            for (int k = 0; k < ch.length; k++) {
                // if ch[].isletter() add to newChar[]
                if (Character.isLetter(ch[k])) {
                    newCh[newLength] = ch[k];
                    newLength++;
                } // if
            } //k for
            // create newWord with newCh[]
            String newWord = Arrays.toString(newCh);
            // trim newWord
            // replace words.word with newWord
            System.out.println(newWord); //This worked, but it isn't actually a F$^%#ing 'string'
        } //i for

 /*       for (int i = 0; i < words.length; i++) {
            String word = words[i];
//            System.out.println(word);
            char[] letters = new char[words.length];
            int newLength = 0;
            for (int j = 0; j < letters.length; j++) {
                char letter = letters[j];
//                System.out.println(letter);
                if (Character.isLetter(letters[j])) {
                    letters[j] = letter;
                    newLength++;
                }
            }
            word = Arrays.toString(letters);
            words[i] = word.substring(0, newLength);
        }*/
        return new ArrayList<>(Arrays.asList(words));
    }
}

