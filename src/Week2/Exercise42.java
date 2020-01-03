package Week2;

import java.util.Scanner;
import hangman.Hangman;

public class Exercise42 {
    public static void main(String[] args) {
        //Exercise 42: A text-based user interface for the Hangman game
        //Exercise 42.1: Loops and ending loops
        //Exercise 42.2: Printing the status
        //Exercise 42.3: Making a guess
        //Exercise 42.4: Printing out the menu
        //Exercise 42.5: Printing the man and the word

        Scanner reader = new Scanner(System.in);
        Hangman hangman = new Hangman();

        System.out.println("************");
        System.out.println("* Hangman *");
        System.out.println("************");
        System.out.println("");
        printMenu();
        System.out.println("");

        // ADD YOUR IMPLEMENTATION HERE

        while (hangman.gameOn()) {
            System.out.println("Type a command: ");
            String command = reader.nextLine();
            if (command.equals("quit")) {
                System.out.println("Thank you for playing!");
                break;
            } else if (command.equals("status")) {
                hangman.printStatus();
            } else if (command.length() == 1) {
                hangman.guess(command);
            } else if (command.isEmpty()) {
                System.out.println("String was empty");
                printMenu();
            } else {
                System.out.println("I found something!");
            }
            hangman.printMan();
            hangman.printWord();
        }

        System.out.println("Thank you for playing!");
    }

    public static void printMenu() {
        System.out.println(" * menu *");
        System.out.println("quit   - quits the game");
        System.out.println("status  - prints the game status");
        System.out.println("a single letter uses the letter as a guess");
        System.out.println("an empty line prints this menu");
    }
}
