package Week3;

import java.util.Scanner;

public class Exercise55 {
    public static String wordInsideWord(String firstWord, String secondWord) {
        if (firstWord.indexOf(secondWord) >= 0) {
            System.out.println("The word " + secondWord + " is found in the word " + firstWord);
        } else {
            System.out.println("The word " + secondWord + " is not found in the word " + firstWord);
        }
        return "";
    }

    public static void main(String[] args) {
        //Exercise 55: A word inside a word

        Scanner in = new Scanner(System.in);
        System.out.println("Type the first word: ");
        String firstWord = in.nextLine();
        System.out.println("Type the second word: ");
        String secondWord = in.nextLine();

        String output = wordInsideWord(firstWord, secondWord);
        System.out.println(output);
    }
}
