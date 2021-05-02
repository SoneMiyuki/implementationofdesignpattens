package cn.edu.xmu.lazyblock;

/**
 * @author Miyuki
 * createdBy Miyuki 2021/5/2 12:35
 * modifiedBy Miyuki 12:35
 **/

public class Singleton {

    private volatile static Singleton instance;

    private int height;

    private int weight;

    private Singleton (){
        height = 180;
        weight = 180;
        System.out.println("initial");
    }

    //use double block to ensure satefy
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
    //no need for initialization
    public static void sayhihi(){
        System.out.println("hihi");
    }
}