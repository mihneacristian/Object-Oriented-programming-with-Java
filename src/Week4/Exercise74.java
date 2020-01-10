package Week4;

class Multiplier {
    private int number;

    public Multiplier(int number) {
        this.number = number;
    }

    public int multiply(int otherNumber) {
        int multiplication = number * otherNumber;
        return multiplication;
    }
}

public class Exercise74 {
    public static void main(String[] args) {
        //Exercise 74: Multiplier

        Multiplier threeMultiplier = new Multiplier(3);
        System.out.println("threeMultiplier.multiply(2): " + threeMultiplier.multiply(2));

        Multiplier fourMultiplier = new Multiplier(4);
        System.out.println("fourMultiplier.multiply(2): " + fourMultiplier.multiply(2));

        System.out.println("threeMultiplier.multiply(1): " + threeMultiplier.multiply(1));
        System.out.println("fourMultiplier.multiply(1): " + fourMultiplier.multiply(1));
    }
}
