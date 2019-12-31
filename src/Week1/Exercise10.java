package Week1;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        //Exercise 10: Calculating the circumference

        System.out.println("Type the radius: ");
        Scanner in = new Scanner(System.in);
        int radius = in.nextInt();
        double circumference = 2 * Math.PI * radius;
        System.out.println("The circumference of the circle is: " + circumference);
    }
}
