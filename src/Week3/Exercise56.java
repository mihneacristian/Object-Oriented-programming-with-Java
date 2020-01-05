package Week3;

import java.util.Scanner;

public class Exercise56 {
    public static String reverse(String text) {
        int counter = text.length() - 1;
        String help = "";
        while (counter >= 0) {
            char letter = text.charAt(counter);
            help = help + letter;
            counter--;
        }
        return "In reverse order: " + help;
    }

    public static void main(String[] args) {
        //Exercise 56: Reversing text

        Scanner in = new Scanner(System.in);
        System.out.println("Type in your text: ");
        String text = in.nextLine();
        System.out.println(reverse(text));
    }
}
