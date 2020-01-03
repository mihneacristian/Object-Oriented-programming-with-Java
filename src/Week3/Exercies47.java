package Week3;

import java.util.Scanner;

public class Exercies47 {
    public static int calculateCharacters (String text) {
        int lengthOfText = text.length();
        return lengthOfText;
    }

    public static void main(String[] args) {
        //Exercise 47: The length of a name

        Scanner in = new Scanner(System.in);
        System.out.println("Type your name: ");
        String nameOfUser = in.nextLine();
        int answer = calculateCharacters(nameOfUser);
        System.out.println("Number of characters: " + answer);
    }
}
