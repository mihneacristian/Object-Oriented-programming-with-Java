package Week3;

import java.util.Scanner;

public class Exercise51 {
    public static String separateCharacters(String userName) {
        int counter = 0;
        while (counter < userName.length()) {
            System.out.println(counter + 1 + ". character: " + userName.charAt(counter));
            counter++;
        }
        return "";
    }

    public static void main(String[] args) {
        //Exercise 51: Separating characters

        Scanner in = new Scanner(System.in);
        System.out.println("Type your name: ");
        String userName = in.nextLine();

        String answer = separateCharacters(userName);
        System.out.println(answer);
    }
}
