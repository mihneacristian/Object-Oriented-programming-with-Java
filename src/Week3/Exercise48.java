package Week3;

import java.util.Scanner;

public class Exercise48 {
    public static char firstCharacter(String text) {
        char character = text.charAt(0);
        return character;
    }

    public static void main(String[] args) {
        //Exercise48: First character

        Scanner in = new Scanner(System.in);
        System.out.println("Type your name: ");
        String nameOfUser = in.nextLine();
        char answer = firstCharacter(nameOfUser);

        System.out.println("First character: " + answer);
    }
}
