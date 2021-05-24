package cn.edu.xmu.factory.idcard;

/**
 * @author Miyuki
 * createdBy Miyuki 2021/5/17 17:59
 * modifiedBy Miyuki 17:59
 **/

import cn.edu.xmu.factory.framework.Product;

public class IDCard extends Product {
    private String owner;
    IDCard(String owner) {
        System.out.println("建立" + owner + "的卡。");
        this.owner = owner;
    }
    public void use () {
        System.out.println("使用" + owner + "的卡。");
    }
    public String getOwner() {
        return owner;
    }
}
