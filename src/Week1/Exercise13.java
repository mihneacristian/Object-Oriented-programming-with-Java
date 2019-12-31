package Week1;

import nhlstats.NHLStatistics;
import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) throws Exception {
        //Exercise 13: NHL statistics, part 1

        Scanner reader = new Scanner(System.in);
        System.out.println("Top ten by points");
        NHLStatistics.sortByPoints();
        NHLStatistics.top(10);

        System.out.println("\nTop 10 players based on goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);

        System.out.println("\nTop 25 players based on penalty amounts");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);

        System.out.println("\nThe statistics for Sidney Crosby are: ");
        NHLStatistics.searchByPlayer("Sidney Crosby");

        System.out.println("\nThe statistics for the Philadelphia Flyers are: ");
        NHLStatistics.teamStatistics("PHI");

        System.out.println("\nThe Anaheim Ducks roster is:");
        NHLStatistics.teamStatistics("ANA");
    }
}
