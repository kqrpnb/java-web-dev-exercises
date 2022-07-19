package org.launchcode.java.demos.lsn1datatypes;
import java.util.Scanner;

public class HelloMethods {

    public static void main(String[] args) {
        Scanner input;
        String lang = "en";
        input = new Scanner(System.in);
        System.out.println("Select a language:\n1. French\n2. Spanish\n3. Frisco Slang");
        int num = input.nextInt();
        if (num == 1) {
            lang = "fr";
        } else if (num == 2) {
            lang = "sp";
        } else if (num == 3) {
            lang = "fs";
        }
        String message= Message.getMessage(lang);
        System.out.println(message);
    }

}
