package Week3;

import java.util.ArrayList;

public class Exercise67 {
    public static double variance(ArrayList<Integer> list) {
        double average = average(list);
        double variance = 0;

        for (int number : list) {
            variance = variance + Math.pow(number - average, 2);
        }

        return variance / (list.size() - 1);
    }

    public static double average(ArrayList<Integer> list) {
        double sumOfNumbers = 0;
        double averageOfNumbers = 0;
        for (int number : list) {
            sumOfNumbers = (sumOfNumbers + number);
            averageOfNumbers = sumOfNumbers / (double) list.size();
        }
        return averageOfNumbers;
    }

    public static void main(String[] args) {
        //Exercise 67: Variance

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The variance is: " + variance(list));
    }
}
