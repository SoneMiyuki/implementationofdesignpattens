package cn.edu.xmu.builder;

/**
 * @author Miyuki
 * createdBy Miyuki 2021/5/17 17:29
 * modifiedBy Miyuki 17:29
 **/

public abstract class Builder {
    public abstract void makeTitle(String title);
    public abstract void makeString(String str);
    public abstract void makeItems(String[] items);
    public abstract Object getResult();
}

