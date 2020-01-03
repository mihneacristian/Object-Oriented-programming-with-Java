package Week3;

public class Exercise44 {
    public static int least(int number1, int number2) {
        // write program code here
        // do not print anything inside the method

        // method needs a return in the end
        int least = 0;
        if (number1 > number2) {
            least = number2;
        } else if (number1 < number2) {
            least = number1;
        } else {
            least = number1;
            System.out.println("The numbers are equal!");
        }
        return least;

        //return Math.min(number1, number2);
    }

    public static void main(String[] args) {
        //Exercise 44: Least

        int answer = least(2,7);
        System.out.println("Least: " + answer);
    }
}
