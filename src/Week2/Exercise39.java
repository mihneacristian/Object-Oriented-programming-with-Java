package Week2;

public class Exercise39 {
    public static void printStars (int amount) {
        int counter = 1;
        while (amount >= counter) {
            System.out.print("*" + " ");
            counter++;
        }
        System.out.println("");
    }

    public static void printSquare (int sideSize) {
        int counter = 1;
        while (counter <= sideSize) {
            printStars(sideSize);
            counter++;
        }
    }

    public static void printRectangle (int width, int height) {
        int counter = 1;
        while (counter <= height) {
            printStars(width);
            counter++;
        }
    }

    public static void printTriangle (int size) {
        int counter = 1;
        while (counter <= size) {
            printStars(counter);
            counter++;
        }
    }

    public static void main(String[] args) {
        //Exercise 39: Printing
        //Exercise 39.1: Printing stars
        //Exercise 39.2: Printing a square
        //Exercise 39.3: Printing a rectangle
        //Exercise 39.4: Printing a left-aligned triangle

        //printStars(3);
        //printSquare(4);
        //printRectangle(17, 3);
        //printTriangle(4);
    }
}
