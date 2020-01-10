package Week3;

import java.util.Scanner;

public class Exercise69 {
    public static boolean palindrome(String text) {
        if (text.equals(reverse(text))) {
            return true;
        }
        return false;
    }

    public static String reverse(String text) {
        String reverse = "";
        int reversedText = text.length() - 1;
        for (int i = reversedText ; i >= 0 ; i--) {
            reverse = reverse + text.charAt(i);
        }
        return reverse;
    }

    public static void main(String[] args) {
        //Palindrome

        Scanner reader = new Scanner(System.in);

        System.out.println("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
