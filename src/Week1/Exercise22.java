package Week1;

import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        //Exercise 22: Password

        Scanner in = new Scanner(System.in);
        String password = "carrot";
        String secretMessage = "GO HABS GO!!";

        while (true) {
            System.out.println("Type the password: ");
            String userPassword = in.nextLine();
            if (userPassword.equals(password)) {
                System.out.println("Right!");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }
        System.out.println("The secret is: " + secretMessage);
    }
}
