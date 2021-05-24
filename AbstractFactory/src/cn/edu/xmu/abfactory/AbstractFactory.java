package cn.edu.xmu.abfactory;

import cn.edu.xmu.example.*;

/**
 * @author Miyuki
 * createdBy Miyuki 2021/5/17 16:49
 * modifiedBy Miyuki 16:49
 **/

public abstract class AbstractFactory {

    public abstract Wheel createWheel();

    public abstract Engine createEngine();

    public abstract Brake createBreak();

    public static AbstractFactory getFactory(String name){
        AbstractFactory factory = null;
        try{
            factory = (AbstractFactory)Class.forName(name).newInstance();
        } catch (ClassNotFoundException c){
            System.err.println("Not found for class" + name );
        } catch (Exception e){
            e.printStackTrace();
        }
        return factory;
    }
}
