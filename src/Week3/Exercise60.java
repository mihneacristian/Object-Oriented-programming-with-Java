package Week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise60 {
    public static void main(String[] args) {
        //Exercise 60: Words in alphabetical order

        Scanner in = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        while (true) {
            System.out.println("Type a word: ");
            String word = in.nextLine();
            if (word.isEmpty()) {
                break;
            } else {
                words.add(word);
            }
            Collections.sort(words);
        }
        System.out.println("You type the following words: ");
        words.forEach(name -> {
            System.out.println(name);
        });
    }
}
