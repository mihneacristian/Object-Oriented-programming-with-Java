package Week2;

import java.util.Scanner;

public class Exercise30 {
    public static void main(String[] args) {
        //Exercise 30: Up to a certain number

        Scanner in = new Scanner(System.in);
        int number = 1;
        System.out.println("Up to what number ?");
        int userNumber = in.nextInt();
        while (number  <= userNumber) {
            System.out.println(number);
            number++;
        }
    }
}
