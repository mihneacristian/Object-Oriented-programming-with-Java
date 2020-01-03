package Week3;

import java.util.Scanner;

public class Exercise49 {
    public static char lastCharacter(String text) {
        char character = text.charAt(text.length() - 1);
        return character;
    }

    public static void main(String[] args) {
        //Exercise 49: Last character

        Scanner in = new Scanner(System.in);
        System.out.println("Type your name: ");
        String nameOfUser = in.nextLine();
        char answer = lastCharacter(nameOfUser);

        System.out.println("Last character: " + answer);
    }
}
