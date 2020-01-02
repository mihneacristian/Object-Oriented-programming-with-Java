package Week2;

import java.util.Scanner;

public class Exercise31 {
    public static void main(String[] args) {
        //Exercise 31: Lower limit and upper limit

        Scanner in = new Scanner(System.in);
        System.out.println("First: ");
        int firstNumber = in.nextInt();
        System.out.println("Second: ");
        int secondNumber = in.nextInt();
        while (firstNumber <= secondNumber) {
            System.out.println(firstNumber);
            firstNumber++;
        }
    }
}
