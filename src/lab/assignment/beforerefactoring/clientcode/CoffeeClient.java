package lab.assignment.beforerefactoring.clientcode;

import lab.assignment.beforerefactoring.CoffeeMakerTemplate;
import lab.assignment.beforerefactoring.MochaCoffee;
import lab.assignment.beforerefactoring.CapuccinoCoffee;
import lab.assignment.beforerefactoring.AmericanoCoffee;

public class CoffeeClient {
    
    public static void main(String[] args) {
       
        CoffeeMakerTemplate starbuzz = new MochaCoffee();
        starbuzz.makeCoffee();
        System.out.println("********************");

        starbuzz = new CapuccinoCoffee();
        starbuzz.makeCoffee();
        System.out.println("********************");

        starbuzz = new AmericanoCoffee();
        starbuzz.makeCoffee();
        
    }

}
