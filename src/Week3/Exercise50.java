package Week3;

import java.util.Scanner;

public class Exercise50 {
    public static char separatingCharacters(String text, int number) {
        return text.charAt(number - 1);
    }

    public static void printCharacters(char firstCharacter, char secondCharacter, char thirdCharacter) {
        System.out.println("1. character: " + firstCharacter);
        System.out.println("2. character: " + secondCharacter);
        System.out.println("3. character: " + thirdCharacter);
    }

    public static void main(String[] args) {
        //Exercise 50: Separating first characters

        Scanner in = new Scanner(System.in);
        System.out.println("Type your name: ");
        String userName = in.nextLine();

        if (userName.length() < 3) {
            System.out.println("");
        } else {
            char firstCharacter = separatingCharacters(userName, 1);
            char secondCharacter = separatingCharacters(userName, 2);
            char thirdCharacter = separatingCharacters(userName, 3);
            printCharacters(firstCharacter, secondCharacter, thirdCharacter);
        }
    }
}
