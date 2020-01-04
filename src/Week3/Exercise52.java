package Week3;

import java.util.Scanner;

public class Exercise52 {
    public static void main(String[] args) {
        //Exercise 52: Reversing a name

        Scanner in = new Scanner(System.in);
        System.out.println("Type your name: ");
        String userName = in.nextLine();

        int counter = userName.length() - 1;
        while (counter >= 0) {
            System.out.println("In reverse order: " + userName.charAt(counter));
            counter--;
        }
    }
}
