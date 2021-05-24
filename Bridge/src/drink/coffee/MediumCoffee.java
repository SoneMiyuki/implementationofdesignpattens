package drink.coffee;

import drink.coffeeImpl.CoffeeImpl;

/**
 * @author Miyuki
 * createdBy Miyuki 2021/5/23 15:48
 * modifiedBy Miyuki 15:48
 **/

public class MediumCoffee extends Coffee{
    public MediumCoffee(){
        setCoffee();
    }
    public void pourCoffee(){
        CoffeeImpl coffee = this.getCoffeeImpl();
        coffee.pourCoffee();
        System.out.println("中杯");
    }
}
