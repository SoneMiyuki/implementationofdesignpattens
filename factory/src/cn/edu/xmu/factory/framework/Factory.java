package cn.edu.xmu.factory.framework;

/**
 * @author Miyuki
 * createdBy Miyuki 2021/5/17 17:56
 * modifiedBy Miyuki 17:56
 **/

public abstract class Factory {
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }
    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);
}