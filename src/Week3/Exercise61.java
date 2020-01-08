package Week3;

import java.util.ArrayList;

public class Exercise61 {
    public static int countItems(ArrayList<String> list) {
        return list.size();
    }

    public static void main(String[] args) {
        //Exercise 61: Amount of items in a list

        ArrayList<String> list = new ArrayList<String>();
        list.add("Hallo");
        list.add("Ciao");
        list.add("Hello");
        System.out.println("There are this many items in the list: " + "\n" +countItems(list));
    }
}
