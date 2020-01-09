package Week3;

import java.util.ArrayList;

public class Exercise65 {
    public static ArrayList<Integer> lengths(ArrayList<String> list) {
        ArrayList<Integer> lengthOfWord = new ArrayList<Integer>();
        for (String lengthWord : list) {
            lengthOfWord.add(lengthWord.length());
        }
        return lengthOfWord;
    }

    public static void main(String[] args) {
        //Exercise 65: The lengths of the Strings

        ArrayList<String> list = new ArrayList<String>();
        list.add("Hallo");
        list.add("Moi");
        list.add("Benvenuto!");
        list.add("badger badger badger badger");
        ArrayList<Integer> lengths = lengths(list);

        System.out.println("The lengths of the Strings: " + lengths);
    }
}
