package Week3;

import java.util.ArrayList;

public class Exercise63 {
    public static int sum(ArrayList<Integer> list) {
        int sumOfNumbers = 0;
        for (int number : list) {
            sumOfNumbers = sumOfNumbers + number;
        }
        return sumOfNumbers;
    }

    public static void main(String[] args) {
        //Exercise 63: Sum of numbers

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The sum: " + sum(list));

        list.add(10);

        System.out.println("the sum: " + sum(list));
    }
}
