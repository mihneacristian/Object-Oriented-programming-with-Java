package Week4;

import java.util.ArrayList;

class Menu {
    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }

    public void addMeal(String meal) {
        if (meals.contains(meal) == false) {
            meals.add(meal);
        }
    }

    public void printMeals() {
        for (String meal : meals) {
            System.out.println(meal);
        }
    }

    public void clearMenu() {
        this.meals.clear();
    }
}

public class Exercise76 {
    public static void main(String[] args) {
        //Exercise 76: Menu
        //Exercise 76.1: Adding a meal to menu
        //Exercise 76.2: Printing the menu
        //Exercise 76.3: Clearing a menu

        Menu restaurantMenu = new Menu();
        restaurantMenu.addMeal("Popeyes Fried Chicken");
        restaurantMenu.addMeal("Bonafide Fried Chicken");
        restaurantMenu.addMeal("Delta Mini Sandwich");

        restaurantMenu.printMeals();

        restaurantMenu.clearMenu();

        restaurantMenu.printMeals();
    }
}
