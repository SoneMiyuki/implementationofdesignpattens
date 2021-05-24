package cn.edu.xmu.example;

import cn.edu.xmu.abfactory.AbstractFactory;
import cn.edu.xmu.abfactory.Brake;
import cn.edu.xmu.abfactory.Engine;
import cn.edu.xmu.abfactory.Wheel;

/**
 * @author Miyuki
 * createdBy Miyuki 2021/5/17 17:00
 * modifiedBy Miyuki 17:00
 **/

public class FordFactory extends AbstractFactory {

    @Override
    public Wheel createWheel() {
        return new FordWheel(4);
    }

    @Override
    public Engine createEngine() {
        return new FordEngine(220);
    }

    @Override
    public Brake createBreak() {
        return new FordBrake();
    }
}
