package Week2;

import java.util.Scanner;

public class Exercise34 {
    public static void main(String[] args) {
        //Exercise 34: Factorial

        Scanner in = new Scanner(System.in);
        System.out.println("Type a number: ");
        int userNumber = in.nextInt();
        int counter = 1;
        int factorial = 1;

        while (userNumber >= counter) {
            factorial = factorial * counter;
            counter++;
        }
        System.out.println("Factorial is: " + factorial);
    }
}
