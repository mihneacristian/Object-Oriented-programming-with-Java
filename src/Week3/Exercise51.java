package Week3;

import java.util.Scanner;

public class Exercise51 {
    public static void main(String[] args) {
        //Exercise 51: Separating characters

        Scanner in = new Scanner(System.in);
        System.out.println("Type your name: ");
        String userName = in.nextLine();

        int counter = 0;
        while (counter < userName.length()) {
            System.out.println(counter + 1 + ". character: " + userName.charAt(counter));
            counter++;
        }
    }
}
