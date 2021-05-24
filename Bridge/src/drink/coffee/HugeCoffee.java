package drink.coffee;

import drink.coffeeImpl.CoffeeImpl;

/**
 * @author Miyuki
 * createdBy Miyuki 2021/5/23 15:49
 * modifiedBy Miyuki 15:49
 **/

public class HugeCoffee extends Coffee{
    public HugeCoffee(){
        setCoffee();
    }

    @Override
    public void pourCoffee(){
        CoffeeImpl coffee = this.getCoffeeImpl();
        coffee.pourCoffee();
        System.out.println("大杯");
    }
}