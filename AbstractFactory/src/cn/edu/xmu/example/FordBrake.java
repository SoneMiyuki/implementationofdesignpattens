package cn.edu.xmu.example;

import cn.edu.xmu.abfactory.Brake;

/**
 * @author Miyuki
 * createdBy Miyuki 2021/5/17 17:05
 * modifiedBy Miyuki 17:05
 **/

public class FordBrake implements Brake {

    @Override
    public void makeBrake() {
        System.out.println("Make brake for Ford");
    }
}
