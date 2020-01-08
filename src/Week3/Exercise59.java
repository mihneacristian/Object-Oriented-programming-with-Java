package Week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise59 {
    public static void main(String[] args) {
        //Exercise 59: Words in reverse order

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
            Collections.reverse(words);
        }
        System.out.println("You type the following words: ");
        words.forEach(name -> {
            System.out.println(name);
        });
    }
}
