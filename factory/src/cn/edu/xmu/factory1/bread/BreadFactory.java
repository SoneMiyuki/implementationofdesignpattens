package cn.edu.xmu.factory1.bread;

/**
 * @author Miyuki
 * createdBy Miyuki 2021/5/17 18:00
 * modifiedBy Miyuki 18:00
 **/

import cn.edu.xmu.factory1.framework.Factory;
import cn.edu.xmu.factory.framework.Product;
import cn.edu.xmu.factory1.cake.Cake;
import cn.edu.xmu.factory1.framework.Goods;

import java.util.ArrayList;
import java.util.Vector;

public class BreadFactory extends Factory {
    private ArrayList<String> names = new ArrayList();
    protected Goods createGoods(String name) {
        return new Bread(name);
    }
    protected void registerGoods(Goods bread) {
        names.add(((Bread)bread).getName());
    }
    public ArrayList getOwners() {
        return names;
    }
}

