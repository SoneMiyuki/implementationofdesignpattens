package cn.edu.xmu.prototype.framework;

/**
 * @author Miyuki
 * createdBy Miyuki 2021/5/17 16:10
 * modifiedBy Miyuki 16:10
 **/

public interface Product extends Cloneable{
    public abstract void show(String s);

    public abstract Product createClone();
}
