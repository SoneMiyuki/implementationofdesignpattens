package drink.coffee;

import drink.coffeeImpl.CoffeeImpl;
import drink.coffeeImpl.CoffeeImplSingleton;

/**
 * @author Miyuki
 * createdBy Miyuki 2021/5/23 15:42
 * modifiedBy Miyuki 15:42
 **/

public abstract class Coffee {
    CoffeeImpl coffee;
    // Singleton for only 1 remaining
    public void setCoffee(){
        this.coffee = CoffeeImplSingleton.getTheCoffeeImpl();
    }
    public CoffeeImpl getCoffeeImpl(){return this.coffee;}

    public abstract void pourCoffee();
}
