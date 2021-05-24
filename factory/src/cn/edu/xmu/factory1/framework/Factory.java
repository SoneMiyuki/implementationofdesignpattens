package cn.edu.xmu.factory1.framework;

import cn.edu.xmu.factory.framework.Product;

/**
 * @author Miyuki
 * createdBy Miyuki 2021/5/17 20:14
 * modifiedBy Miyuki 20:14
 **/

public abstract class Factory {
    public final Goods create(String name) {
        Goods p = createGoods(name);
        registerGoods(p);
        return p;
    }
    protected abstract Goods createGoods(String name);
    protected abstract void registerGoods(Goods goods);
}
