package lab.assignment.afterrefactoring.clientcode;

import lab.assignment.afterrefactoring.CoffeeMakerTemplate;
import lab.assignment.afterrefactoring.MochaCoffee;
import lab.assignment.afterrefactoring.CapuccinoCoffee;
import lab.assignment.afterrefactoring.AmericanoCoffee;

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
