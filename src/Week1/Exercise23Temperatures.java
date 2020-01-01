package Week1;

import java.util.Scanner;

public class Exercise23Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.print("Type in today's temperature: ");
            double temp = Double.parseDouble(reader.nextLine());

            if (!(temp < -30) && !(temp > 40)) {
                Exercise23Graph.addNumber(temp);
            }
        }
    }
}
