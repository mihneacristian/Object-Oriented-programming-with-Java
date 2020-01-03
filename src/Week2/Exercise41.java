package Week2;

import java.util.Random;
import java.util.Scanner;

public class Exercise41 {
    public static void main(String[] args) {
        //Exercise 41: Guessing a number game
        //Exercise 41.1: Guessing a number
        //Exercise 41.2: Repeated guessing
        //Exercise 41.3: Counting the guesses

        Scanner in = new Scanner(System.in);
        int randomNumber = drawNumber();
        int counter = 0;

        while (true) {
            System.out.println("Guess a number: ");
            int userNumber = in.nextInt();
            counter++;
            if (userNumber > randomNumber) {
                System.out.println("The number is lesser, guesses made: " + counter);
            } else if (userNumber < randomNumber) {
                System.out.println("The number is greater, guesses made: " + counter);
            } else {
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
        }
    }

    public static int drawNumber() {
        return new Random().nextInt(101);
    }
}
