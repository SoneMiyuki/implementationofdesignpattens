package cn.edu.xmu.factory1.cake;

/**
 * @author Miyuki
 * createdBy Miyuki 2021/5/17 18:00
 * modifiedBy Miyuki 18:00
 **/

import cn.edu.xmu.factory1.framework.Factory;
import cn.edu.xmu.factory.framework.Product;
import cn.edu.xmu.factory1.framework.Goods;

import java.util.ArrayList;
import java.util.Vector;

public class CakeFactory extends Factory {
    private ArrayList<String> names = new ArrayList();
    protected Goods createGoods(String name) {
        return new Cake(name);
    }
    protected void registerGoods(Goods cake) {
        names.add(((Cake)cake).getName());
    }
    public ArrayList getOwners() {
        return names;
    }
}

