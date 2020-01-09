package Week3;

import java.util.ArrayList;

public class Exercise66 {
    public static int greatest(ArrayList<Integer> list) {
        int greatestNumber = list.get(0);
        for (Integer number : list) {
            if (number > greatestNumber) {
                greatestNumber = number;
            }
        }
        return greatestNumber;
    }

    public static void main(String[] args) {
        //Exercise 66: The greatest

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The greatest number is: " + greatest(list));
    }
}
