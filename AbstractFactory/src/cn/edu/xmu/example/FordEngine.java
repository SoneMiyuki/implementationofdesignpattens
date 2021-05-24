package cn.edu.xmu.example;

import cn.edu.xmu.abfactory.Engine;

/**
 * @author Miyuki
 * createdBy Miyuki 2021/5/17 17:03
 * modifiedBy Miyuki 17:03
 **/

public class FordEngine implements Engine {

    Integer pow;

    public FordEngine(Integer p){
        pow = p;
    }

    @Override
    public void makeEngine(){

        System.out.println("Make Ford for Engine = " + pow+" Powers");
    }


}
