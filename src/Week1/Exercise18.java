package Week1;

import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        //Exercise 18: Grades and points

        /*
        Points	Grade
        0–29	failed
        30–34	1
        35–39	2
        40–44	3
        45–49	4
        50–60	5
         */

        Scanner in = new Scanner(System.in);
        System.out.println("Type the points [0-60]: ");
        int points = in.nextInt();

        if (points >= 0 && points < 30) {
            System.out.println("failed");
        } else if (points >= 30 && points < 35) {
            System.out.println("Grade: 1");
        } else if (points >= 35 && points < 40) {
            System.out.println("Grade: 2");
        } else if (points >= 40 && points < 45) {
            System.out.println("Grade: 3");
        } else if (points >= 45 && points < 50) {
            System.out.println("Grade: 4");
        } else if (points >= 50 && points <= 60) {
            System.out.println("Grade: 5");
        } else {
            System.out.println("Grade greater than 60!");
        }
    }
}
