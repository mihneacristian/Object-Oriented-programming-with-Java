package Week2;

public class Exercise40 {
    public static void printStars (int size) {
        int counter = 1;
        while (size >= counter) {
            System.out.print("*");
            counter++;
        }
        System.out.println("");
    }

    public static void printWhitespaces (int size) {
        int counter = 1;
        while (size >= counter) {
            System.out.print("");
            counter++;
        }
    }

    public static void printTriangle (int size) {
        int counter = 1;
        while (size >= counter) {
            printWhitespaces(counter);
            printStars(counter);
            counter++;
        }
    }

    public static void xmasTree (int height) {
        int counter = 1;
        while (height >= counter) {
            printWhitespaces(height - counter);
            printStars( 2 * counter - 1);
            counter++;
        }
        counter = 2;
        while (--counter >= 0) {
            printWhitespaces(height - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        //Exercise 40: Printing Like A Boss
        //Exercise 40.1: Printing stars and whitespaces
        //Exercise 40.2: Printing a right-aligned triangle
        //Exercise 40.3: Printing a Christmas tree

        //printTriangle(5);
        //xmasTree(4);
        //xmasTree(10);
    }
}
