package Week2;

import java.util.Scanner;

public class Exercise36 {
    public static void main(String[] args) {
        //Exercise 36: Loops, ending and remembering
        //Exercise 36.1: Reading numbers
        //Exercise 36.2: The sum of the numbers
        //Exercise 36.3: Summing and counting the numbers
        //Exercise 36.4: Counting the average
        //Exercise 36.5: Even and odd numbers

        Scanner in = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        int evenNumbers = 0;
        int oddNumbers = 0;

        while (true) {
            System.out.println("Type the numbers: ");
            int userNumber = in.nextInt();
            if (userNumber == (-1)) {
                System.out.println("Thank you and see you later!");
                break;
            } else {
                sum = sum + userNumber;
                counter++;
            } if (userNumber % 2 == 0) {
                evenNumbers++;
            } else {
                oddNumbers++;
            }
            System.out.println(userNumber);
        }

        double average = ((double) sum / counter);
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + counter);
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd numbers: " + oddNumbers);
    }
}
