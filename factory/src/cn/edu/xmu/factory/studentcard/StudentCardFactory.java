package cn.edu.xmu.factory.studentcard;

/**
 * @author Miyuki
 * createdBy Miyuki 2021/5/17 18:00
 * modifiedBy Miyuki 18:00
 **/

import cn.edu.xmu.factory.framework.Factory;
import cn.edu.xmu.factory.framework.Product;
import cn.edu.xmu.factory.idcard.IDCard;

import java.util.Vector;

public class StudentCardFactory extends Factory {
    private Vector owners = new Vector();
    protected Product createProduct(String owner) {
        return new StudentCard(owner);
    }
    protected void registerProduct(Product product) {
        owners.add(((StudentCard)product).getOwner());
    }
    public Vector getOwners() {
        return owners;
    }
}

