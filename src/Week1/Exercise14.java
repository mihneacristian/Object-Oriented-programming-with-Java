package Week1;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        //Exercise14: A positive number

        Scanner in = new Scanner(System.in);
        System.out.println("Type a number: ");
        int userNumber = in.nextInt();

        if (userNumber > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is not positive.");
        }
    }
}
