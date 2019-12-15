package Week1;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        //Exercise 8: Adder

        Scanner numberScanner = new Scanner(System.in);
        System.out.println("Type a number:");
        int firstNumber = numberScanner.nextInt();
        System.out.println("Type another:");
        int secondNumber = numberScanner.nextInt();
        int addition = firstNumber + secondNumber;

        System.out.println("The sum of the two numbers is: " + addition);

    }
}
