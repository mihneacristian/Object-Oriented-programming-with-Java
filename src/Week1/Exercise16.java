package Week1;

import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        //Exercise 16: Even or odd?

        Scanner in = new Scanner(System.in);
        System.out.println("Type a number: ");
        int userNumber = in.nextInt();

        if (userNumber % 2 == 0) {
            System.out.println("Number " + userNumber + " is even.");
        } else {
            System.out.println("Number " + userNumber + " is odd.");
        }
    }
}
