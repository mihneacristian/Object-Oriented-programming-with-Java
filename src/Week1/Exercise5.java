package Week1;

public class Exercise5 {
    public static void main(String[] args) {
        //Exercise 5: Seconds in a year

        int daysInYear = 365;
        int daysInLeapYear = 366;
        int secondsInDay = 86400;

        // Seconds in a non-leap year
        int secondsInYear = daysInYear * secondsInDay;

        // Seconds in a leap year
        int secondsInLeapYear = daysInLeapYear * secondsInDay;

        System.out.println("There are " + secondsInYear + " seconds in a non-leap year.");
        System.out.println("There are " + secondsInLeapYear + " seconds in a leap year.");
    }

}
