package cn.edu.xmu.variableinstance;

import java.util.ArrayList;

/**
 * @author Miyuki
 * createdBy Miyuki 2021/5/2 13:48
 * modifiedBy Miyuki 13:48
 **/

public class Mulgleton {

    private static ArrayList<Singleton> s;

    private static int num;

    private static int index;

    public static void turnNumTo(int number){
        num = number;
        index = 0;
        s = new ArrayList<>();
        for(int i = 0;i < number; i++){
            s.add(new Singleton());
        }
    }

    public Mulgleton(int number){
        num = number;
        index = 0;
        s = new ArrayList<>();
        for(int i = 0;i < number; i++){
            s.add(new Singleton());
        }
    }
    public Mulgleton(){
        this.num = 1;
        index = 0;
        s = new ArrayList<>();
        s.add(new Singleton());
    }
    public Singleton getInstance(){
        index++;index %= num;
        return s.get(index);
    }

}
