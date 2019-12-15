package Week1;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        //Exercise 6: Addition

        Scanner numberScanner = new Scanner(System.in);
        System.out.println("Please enter the first number:");
        int firstNumber = numberScanner.nextInt();
        System.out.println("Please enter the second number:");
        int secondNumber = numberScanner.nextInt();
        int addition = firstNumber + secondNumber;

        System.out.println("The sum of the two numbers is: " + addition);

    }
}
