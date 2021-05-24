package drink;

import drink.coffee.HugeCoffee;
import drink.coffee.MediumCoffee;
import drink.coffeeImpl.CoffeeImplSingleton;
import drink.coffeeImpl.SugarCoffeeImpl;

/**
 * @author Miyuki
 * createdBy Miyuki 2021/5/23 15:41
 * modifiedBy Miyuki 15:41
 **/

public class CoffeeMain {

    public static void main(String[] args) {
        CoffeeImplSingleton coffeeImplSingleton = new CoffeeImplSingleton(new SugarCoffeeImpl());

        HugeCoffee hugeCoffee = new HugeCoffee();

        hugeCoffee.pourCoffee();

        MediumCoffee midiumCoffee = new MediumCoffee();

        midiumCoffee.pourCoffee();
    }
}
