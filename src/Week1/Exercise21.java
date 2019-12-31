package Week1;

import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
        //Exercise 21: Leap year

        Scanner in = new Scanner(System.in);
        System.out.println("Type a year: ");
        int userYear = in.nextInt();

        if (userYear % 4 == 0 && userYear % 100 == 0 && userYear % 400 == 0) {
            System.out.println("This is a leap year.");
        } else if (userYear % 100 == 0 && userYear % 400 != 0) {
            System.out.println("This is not a leap year.");
        } else if (userYear % 4 == 0) {
            System.out.println("This is a leap year.");
        } else {
            System.out.println("This year is not a leap year.");
        }
    }
}
