package Week3;

import java.util.Scanner;

public class Exercise51 {
    public static char separatingCharacters(String text, int number) {
        return text.charAt(number);
    }

    public static char numberOfCharacters (String text) {
        return (char) (text.length() - 1);
    }

    public static void printCharacters(String text, int numberOfLetters) {
        int counter = 0;
        while (numberOfLetters >= counter) {
            char characters = separatingCharacters(text, numberOfLetters);
            System.out.println((counter + 1) + ". character: " + characters);
            counter++;
        }

    }
    public static void main(String[] args) {
        //Exercise 51: Separating characters

        Scanner in = new Scanner(System.in);
        System.out.println();
    }
}
