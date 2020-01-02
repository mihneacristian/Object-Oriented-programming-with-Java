package Week2;

import java.util.Scanner;

public class Exercise32 {
    public static void main(String[] args) {
        //Exercise 32: The sum of a set of numbers

        Scanner in = new Scanner(System.in);
        System.out.println("Until what? ");
        int userNumber = in.nextInt();
        int counter = 0;
        int sumOfNumbers = 0;

        while (userNumber >= counter) {
            sumOfNumbers = sumOfNumbers + counter;
            counter++;
        }
        System.out.println("Sum is " + sumOfNumbers);
    }
}
