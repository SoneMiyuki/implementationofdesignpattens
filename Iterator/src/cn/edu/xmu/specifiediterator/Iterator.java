package cn.edu.xmu.specifiediterator;

/**
 * @author Miyuki
 * createdBy Miyuki 2021/5/17 15:23
 * modifiedBy Miyuki 15:23
 **/
public interface Iterator {
    public abstract boolean hasNext();

    public abstract Object next();

    public abstract Object getElementByName(String name);
}
