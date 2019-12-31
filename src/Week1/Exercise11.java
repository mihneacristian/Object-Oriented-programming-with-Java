package Week1;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        //Exercise 11: Bigger Number

        Scanner in = new Scanner(System.in);
        System.out.println("Type your first number: ");
        int firstNumber = in.nextInt();
        System.out.println("Type your second number: ");
        int secondNumber = in.nextInt();
        int biggerNumber = Math.max(firstNumber, secondNumber);
        System.out.println("The bigger number of the two given numbers was: " + biggerNumber);
    }
}
