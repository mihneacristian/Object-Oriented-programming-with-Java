package Week1;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        //Exercise 12: Sum of the ages

        Scanner in = new Scanner(System.in);
        System.out.println("Type the first name: ");
        String firstName = in.nextLine();
        System.out.println("Type your age: ");
        int firstAge = Integer.parseInt(in.nextLine());

        System.out.println("Type the second name: ");
        String secondName = in.nextLine();
        System.out.println("Type your age: ");
        int secondAge = Integer.parseInt(in.nextLine());

        int sumOfAges = firstAge + secondAge;

        System.out.println(firstName + " and " + secondName + " are " + sumOfAges + " years old in total.");
    }
}
