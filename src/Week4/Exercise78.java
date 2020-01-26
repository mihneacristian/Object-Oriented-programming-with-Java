package Week4;

import java.util.Scanner;

public class Exercise78 {
    public static void main(String[] args) throws InterruptedException {
        //Exercise 78: Clock using a counter
        //Exercise 78.1: BoundedCounter
        //Exercise 78.2: Printing the initial zero
        //Exercise 78.3: The first version of the clock
        //Exercise 78.4: The second version of the clock

        BoundedCounter counter = new BoundedCounter(14);
        System.out.println("Value at start: " + counter);

        int i = 0;
        while (i < 16) {
            counter.next();
            System.out.println("Value: " + counter);
            i++;
        }


        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        int j = 0;
        while (j < 121) {
            minutes.next();
            if (minutes.getValue() == 0) {
                hours.next();
            }
            System.out.println(hours + " : " + minutes);
            j++;
        }


        System.out.println("seconds: ");
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        System.out.println("minutes: ");
        int m = in.nextInt();
        System.out.println("hours: ");
        int h = in.nextInt();

        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);

        int k = 0;
        while (k < 121) {
            seconds.next();
            if (seconds.getValue() == 0) {
                minutes.next();
            } else if (minutes.getValue() == 0) {
                hours.next();
            }
            System.out.println(hours + " : " + minutes + " : " + seconds);
            k++;
        }

        System.out.println("\nBonus: eternal clock (exercise not assessed with TMC!)");

        while (true) {
            System.out.println(hours + " : " + minutes + " : " + seconds);
            Thread.sleep(1000);
            seconds.next();
        }
    }
}

class BoundedCounter {
    private int value;
    private int upperLimit;


    public BoundedCounter(int upperLimit) {
        this.value = 0;
        this.upperLimit = upperLimit;
    }

    public void next() {
        if (this.value < this.upperLimit) {
            this.value++;
        } else if (this.value == upperLimit) {
            this.value = 0;
        }
    }

    public String toString() {
        if (this.value >= 10) {
            return "" + this.value;
        } else {
            return "0" + this.value;
        }
    }

    public int getValue() {
        return + this.value;
    }

    public void setValue(int value) {
        if(value < 0 || value > this.upperLimit) {

        } else {
            this.value = value;
        }
    }
}
