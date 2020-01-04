package Week3;

import java.util.Scanner;

public class Exercise54 {
    public static String lastPart(String userInput, int lengthOfWord) {
        String output = userInput.substring(userInput.length() - lengthOfWord);
        return output;
    }

    public static void main(String[] args) {
        //Exercise 54: Last part

        Scanner in = new Scanner(System.in);
        System.out.println("Type a word: ");
        String userInput = in.nextLine();
        System.out.println("Length of last part: ");
        int lengthOfWord = in.nextInt();

        String lastPartOfWord = lastPart(userInput, lengthOfWord);
        System.out.println(lastPartOfWord);

    }
}
