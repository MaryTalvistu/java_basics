package week4;
import java.util.ArrayList;

public class Ex76 {
    public static void main(String[] args) {
        Menu useStep = new Menu();

        // Here we add deshes to addMeal method
        useStep.addMeal("Pizza");
        useStep.addMeal("Pasta");
        useStep.addMeal("Grilled chicken");

        // Here we print our menu
        useStep.printMeals();
        System.out.println(' ');

        // Here we clear our Menu and print it
        useStep.clearingMeals();
        useStep.printMeals();


    }

    public static class Menu {

        private ArrayList<String> meals;

        // Here we are creating new Array
        public Menu() {
            this.meals = new ArrayList<String>();
        }

        // Here we are adding meal if its not yet in list
        public void addMeal(String meal) {
            if (!this.meals.contains(meal)) {
                this.meals.add(meal);
            }
        }

        // Here we are printing each meal that is in meals array
        public void printMeals() {
            System.out.println("We have these meals: ");
            for (String meal : meals) {
                System.out.println(meal);
            }
        }

        // Here we are clearing Menu list
        public void clearingMeals() {
            this.meals.clear();
        }
    }
}


