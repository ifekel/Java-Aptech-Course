package Decision_Making;

import java.util.Scanner;

public class VowelsAndConsonants {
    public static void main(String[] args) {
        System.out.println("Welcome to the Vowels And Consonant Letters Checker System");
        System.out.println("OK, we will start by you entering a letter and we'll check if it is a consonant or a vowel");
        System.out.print("Alright, Enter A letter: ");
        Scanner input = new Scanner(System.in);
        String letter = input.next();

        while (true) {
            if (letter.length() > 1) {
                System.out.println("Sorry, you can only enter one letter");
                break;
            }
            else {
                switch (letter) {
                    case "A", "E", "I", "O", "U", "a", "e", "i", "o", "u" -> {
                        System.out.printf("'%s' is a VOWEL", letter);
                    }
                    case "B", "C", "D", "F", "G", "H", "J", "K", "L", "M", "N", "P", "Q", "R", "S", "T", "V", "W", "X", "Y", "Z",
                            "b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z"-> {
                        System.out.printf("'%s' is a CONSONANT", letter);
                    }
                }
                break;
            }
        }
    }
}
