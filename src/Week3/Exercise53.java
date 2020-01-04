package Week3;

import java.util.Scanner;

public class Exercise53 {
    public static String firstPart(String userInput, int lengthOfWord) {
        String output = userInput.substring(0, lengthOfWord);
        return "Result: " + output;
    }

    public static void main(String[] args) {
        //Exercise 53: First part

        Scanner in = new Scanner(System.in);
        System.out.println("Type a word: ");
        String userInput = in.nextLine();
        System.out.println("Length of last part: ");
        int lengthOfUserInput = userInput.length();
        int lengthOfWord = in.nextInt();

        String firstPartOfWord = firstPart(userInput, lengthOfWord);
        System.out.println(firstPartOfWord);

    }
}
