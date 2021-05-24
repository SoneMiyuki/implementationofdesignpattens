package cn.edu.xmu.example;

import cn.edu.xmu.abfactory.Wheel;

/**
 * @author Miyuki
 * createdBy Miyuki 2021/5/17 17:01
 * modifiedBy Miyuki 17:01
 **/

public class FordWheel implements Wheel {

    public Integer num;

    public FordWheel(Integer num){
        this.num = num;
    }

    @Override
    public void makeWheel() {
        System.out.println("Make Ford for " + num + " Wheels");
    }
}
