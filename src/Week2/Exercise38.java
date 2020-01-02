package Week2;

import java.util.Scanner;

public class Exercise38 {
    public static void main(String[] args) {
        //Exercise 38: Many prints

        Scanner in = new Scanner(System.in);
        System.out.println("How many ?");
        int userNumber = in.nextInt();
        int counter = 1;

        while (userNumber >= counter) {
            printText();
            counter++;
        }

        /*
         for (int i = 0; i < userNumber ; i++) {
                    printText();
                    }
         */
    }

    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
}
