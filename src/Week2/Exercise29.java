package Week2;

public class Exercise29 {
    public static void main(String[] args) {
        //Exercise 29: Even numbers

        int evenNumbers = 1;
        while (evenNumbers <= 100) {
            if (evenNumbers % 2 == 0) {
                System.out.println(evenNumbers);
            }
            evenNumbers++;
        }
    }
}
