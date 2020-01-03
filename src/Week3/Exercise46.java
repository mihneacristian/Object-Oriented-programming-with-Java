package Week3;

public class Exercise46 {
    public static double average(int number1, int number2, int number3, int number4) {
        // write your code here
        double averageOfNumbers = (double) (number1 + number2 + number3 + number4) / 4;
        return averageOfNumbers;
    }

    public static void main(String[] args) {
        //Exercise 46: Average of given numbers

        double answer = average(4,3,6,1);
        System.out.println("Average: " + answer);
    }
}
