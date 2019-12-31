package Week1;

import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        //Exercise 19: Age check

        Scanner in = new Scanner(System.in);
        System.out.println("How old are you?");
        int userAge = in.nextInt();

        if (userAge > -1 && userAge < 121) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }
    }
}
