package drink.coffee;

import drink.coffeeImpl.CoffeeImpl;

/**
 * @author Miyuki
 * createdBy Miyuki 2021/5/23 15:46
 * modifiedBy Miyuki 15:46
 **/

public class SmallCoffee extends Coffee{
    public SmallCoffee(){
        setCoffee();
    }
    public void pourCoffee(){
        CoffeeImpl coffee = this.getCoffeeImpl();
        coffee.pourCoffee();
        System.out.println("小杯");
    }
}
