package Week4;

import java.util.ArrayList;

public class Exercise71 {
    public static void smartCombine(ArrayList<Integer> first, ArrayList<Integer> second) {
        for(int number : second) {
            if (first.contains(number) == false) {
                first.add(number);
            }
        }
    }

    public static void main(String[] args) {
        //Exercise 71: Smart combining

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        list1.add(4);
        list1.add(3);

        list2.add(5);
        list2.add(3);
        list2.add(10);
        list2.add(7);
        list2.add(6);
        list2.add(3);

        smartCombine(list1, list2);

        System.out.println(list1);
    }
}
