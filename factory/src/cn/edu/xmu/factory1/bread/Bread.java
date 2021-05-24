package cn.edu.xmu.factory1.bread;

/**
 * @author Miyuki
 * createdBy Miyuki 2021/5/17 17:59
 * modifiedBy Miyuki 17:59
 **/

import cn.edu.xmu.factory.framework.Product;
import cn.edu.xmu.factory1.framework.Goods;

public class Bread extends Goods {
    private String name;
    Bread(String name) {
        System.out.println("为面包"+name+"建立档案");
        this.name = name;
    }
    public void showTag() {
        System.out.println("查询" + name + "的档案。");
    }
    public String getName() {
        return name;
    }
}
