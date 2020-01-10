package Week4;

class DecreasingCounter {
    private int value;
    private int initialValue = value;

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.initialValue = valueAtStart;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        if (this.value > 0) {
            this.value--;
        }
    }

    public void reset() {
        this.value = 0;
    }

    public void setInitial() {
        value = initialValue;
    }
}

public class Exercise75 {
    public static void main(String[] args) {
        //Exercise 75: Decreasing counter
        //Exercise 75.1: Implementing method decrease()
        //Exercise 75.2: Value remains positive
        //Exercise 75.3: Counter reset
        //Exercise 75.4: Back to initial value

        DecreasingCounter counter = new DecreasingCounter(5999);

        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.setInitial();
        counter.printValue();
    }
}
