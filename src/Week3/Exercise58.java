package Week3;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise58 {
    public static void main(String[] args) {
        //Exercise 58: Recurring word

        Scanner in = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String word;
        while (true) {
            System.out.println("Type a word: ");
            word = in.nextLine();
            if (words.contains(word)) {
                break;
            }
            else {
                words.add(word);
            }
        }
        System.out.println("You gave the word " + word + " twice");
    }
}
