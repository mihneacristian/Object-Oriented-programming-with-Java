package Week1;

import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        //Exercise 20: Usernames

        /*
        Username	Password
        alex	    mightyducks
        emily	    cat
         */

        Scanner in = new Scanner(System.in);
        System.out.println("Type your username: ");
        String username = in.nextLine();
        System.out.println("Type your password: ");
        String password = in.nextLine();

        if (username.equals("alex") && password.equals("mightyducks") ||
                username.equals("emily") && password.equals("cat") ) {
            System.out.println("You are now logged into the system!");
        } else {
            System.out.println("Your username or password was invalid!");
        }
    }
}
