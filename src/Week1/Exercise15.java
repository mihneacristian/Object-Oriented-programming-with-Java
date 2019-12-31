package Week1;

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        //Exercise 15: Age of majority

        Scanner in = new Scanner(System.in);
        System.out.println("How old are you?");
        int userAge = in.nextInt();

        if (userAge < 18) {
            System.out.println("You have not reached the age of majority yet!");
        } else {
            System.out.println("You have reached the age of majority!");
        }
    }
}
