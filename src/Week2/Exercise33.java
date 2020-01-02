package Week2;

import java.util.Scanner;

public class Exercise33 {
    public static void main(String[] args) {
        //Exercise 33: The sum between two numbers

        Scanner in = new Scanner(System.in);
        System.out.println("First: ");
        int firstNumber = in.nextInt();
        System.out.println("Second: ");
        int secondNumber = in.nextInt();

        int counter = firstNumber;
        int sumOfNumbers = 0;

        while (counter <= secondNumber) {
            sumOfNumbers = sumOfNumbers + counter;
            counter++;
        }
        System.out.println("The sum is " + sumOfNumbers);
    }
}