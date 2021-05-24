package cn.edu.xmu.example;

import cn.edu.xmu.abfactory.AbstractFactory;
import cn.edu.xmu.abfactory.Brake;
import cn.edu.xmu.abfactory.Engine;
import cn.edu.xmu.abfactory.Wheel;
import cn.edu.xmu.example.*;


/**
 * @author Miyuki
 * createdBy Miyuki 2021/5/17 17:11
 * modifiedBy Miyuki 17:11
 **/

public class Main {
    public static void main(String[] args) {
        AbstractFactory factory = AbstractFactory.getFactory("cn.edu.xmu.example.FordFactory");
        //AbstractFactory factory = new FordFactory();
        factory.createBreak().makeBrake();
        factory.createEngine().makeEngine();
        factory.createWheel().makeWheel();
    }
}
