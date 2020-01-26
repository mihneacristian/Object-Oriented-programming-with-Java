package Week4;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise79 {
    public static void main(String[] args) {
        //Exercise 79: NumberStatistics
        //Exercise 79.1: Amount of numbers
        //Exercise 79.2: Sum and average
        //Exercise 79.3: Asking for numbers from the user
        //Exercise 79.4: Many sums

        NumberStatistics stats = new NumberStatistics();

        stats.addNumbers(3);
        stats.addNumbers(5);
        stats.addNumbers(1);
        stats.addNumbers(2);
        System.out.println("Amount: " + stats.amountOfNumbers());
        System.out.println("Sum: " + stats.sum());
        System.out.println("Average: " + stats.average());


        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Type numbers: ");
            int userNumber = in.nextInt();
            if (userNumber == (-1)) {
                System.out.println("Sum: " + stats.sum());
                break;
            } else {
                stats.addNumbers(userNumber);
            }
        }

        NumberStatistics sumOfNumbers = new NumberStatistics();
        NumberStatistics evenNumbers = new NumberStatistics();
        NumberStatistics oddNumbers = new NumberStatistics();

        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Type numbers: ");
            int userNumber = in.nextInt();
            if (userNumber == (-1)) {
                sumOfNumbers.addNumbers(evenNumbers.sum() + oddNumbers.sum());
                break;
            } else if (userNumber % 2 == 0) {
                evenNumbers.addNumbers(userNumber);
            } else {
                oddNumbers.addNumbers(userNumber);
            }
        }

        System.out.println("Sum: " + sumOfNumbers.sum());
        System.out.println("Sum of even: " + evenNumbers.sum());
        System.out.println("Sum of odd: " + oddNumbers.sum());
    }
}

class NumberStatistics {
    private int amountOfNumbers;
    private ArrayList<Integer> userNumbers;

    public NumberStatistics() {
        this.userNumbers = new ArrayList<Integer>();
    }

    public void addNumbers(int number) {
        this.userNumbers.add(number);
        this.amountOfNumbers++;
    }

    public int amountOfNumbers() {
        return this.amountOfNumbers;
    }

    public int sum() {
        int sum = 0;
        for (int number : this.userNumbers) {
            sum += number;
        }
        return sum;
    }

    public double average() {
        return (double) sum() / amountOfNumbers();
    }
}
