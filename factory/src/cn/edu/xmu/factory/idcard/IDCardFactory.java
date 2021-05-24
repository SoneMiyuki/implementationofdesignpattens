package cn.edu.xmu.factory.idcard;

/**
 * @author Miyuki
 * createdBy Miyuki 2021/5/17 18:00
 * modifiedBy Miyuki 18:00
 **/

import cn.edu.xmu.factory.framework.Factory;
import cn.edu.xmu.factory.framework.Product;

import java.util.*;

public class IDCardFactory extends Factory {
    private Vector owners = new Vector();
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }
    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }
    public Vector getOwners() {
        return owners;
    }
}

