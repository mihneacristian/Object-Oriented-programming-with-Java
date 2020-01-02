package Week2;

import java.util.Scanner;

public class Exercise35 {
    public static void main(String[] args) {
        //Exercise 35: Sum of the powers

        Scanner in = new Scanner(System.in);
        System.out.println("Type a number: ");
        int userNumber = in.nextInt();
        int counter = 0;
        int sumOfNumbers = 0;

        while (userNumber >= counter) {
            int powOfNumbers = (int) Math.pow(2, counter);
            sumOfNumbers = sumOfNumbers + powOfNumbers;
            counter++;
        }
        System.out.println("The result is: " + sumOfNumbers);
    }
}
