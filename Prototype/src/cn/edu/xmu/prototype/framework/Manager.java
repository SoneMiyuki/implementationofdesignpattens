package cn.edu.xmu.prototype.framework;

import java.util.Hashtable;

/**
 * @author Miyuki
 * createdBy Miyuki 2021/5/17 16:12
 * modifiedBy Miyuki 16:12
 **/

public class Manager {
    private Hashtable dic = new Hashtable();

    public void register(String name, Product product){
        dic.put(name, product);
    }

    public  Product create(String name){
        Product p = (Product)dic.get(name);
        return p.createClone();
    }
}
