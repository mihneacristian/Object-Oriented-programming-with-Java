package Week3;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise68 {
    public static boolean moreThanOnce(ArrayList<Integer> list, int number) {
        int counter = 0;

        for (int numberInList : list) {
            if (numberInList == number) {
                if (counter > 0) {
                    return true;
                }
                counter++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        //Exercise 68: Is the number more than once in the list

        Scanner reader = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        if (moreThanOnce(list, number)) {
            System.out.println(number + " appears more than once.");
        } else {
            System.out.println(number + " does not appear more than once.");
        }
    }
}
