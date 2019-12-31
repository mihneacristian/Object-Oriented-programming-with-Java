package Week1;

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        //Exercise 17: Greater number

        Scanner in = new Scanner(System.in);
        System.out.println("Type the first number: ");
        int firstNumber = in.nextInt();
        System.out.println("Type the second number: ");
        int secondNumber = in.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("Greater number: " + firstNumber);
        } else if (secondNumber > firstNumber) {
            System.out.println("Greater number: " + secondNumber);
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}
