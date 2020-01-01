package Week2;

import java.util.Scanner;

public class Exercise25 {
    public static void main(String[] args) {
        //Exercise 25: Sum of three numbers

        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read;

        // WRITE YOUR PROGRAM HERE
        // USE ONLY THE VARIABLE sum, reader AND read!

        System.out.println("Type the first number: ");
        read = reader.nextInt();
        sum = sum + read;

        System.out.println("Type the second number: ");
        read = reader.nextInt();
        sum = sum + read;

        System.out.println("Type the third number: ");
        read = reader.nextInt();
        sum = sum + read;

        System.out.println("Sum: " + sum);
    }
}
