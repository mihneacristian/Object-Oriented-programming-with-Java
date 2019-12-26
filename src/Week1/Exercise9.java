package Week1;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        //Exercise 9: Divider

        Scanner numberScanner = new Scanner(System.in);
        System.out.println("Type a number:");
        float firstNumber = numberScanner.nextInt();
        System.out.println("Type another:");
        float secondNumber = numberScanner.nextInt();
        float divider = firstNumber / secondNumber;

        System.out.println("The division of the two numbers is: " + divider);
    }
}
