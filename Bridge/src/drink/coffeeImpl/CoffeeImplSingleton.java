package drink.coffeeImpl;

/**
 * @author Miyuki
 * createdBy Miyuki 2021/5/23 15:44
 * modifiedBy Miyuki 15:44
 **/

public class CoffeeImplSingleton{
    private static CoffeeImpl coffeeImpl;
    public CoffeeImplSingleton(CoffeeImpl coffeeImpIn){
        this.coffeeImpl = coffeeImpIn;
    }
    public static CoffeeImpl getTheCoffeeImpl(){
        return coffeeImpl;
    }
}
