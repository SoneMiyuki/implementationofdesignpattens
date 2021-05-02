package cn.edu.xmu.eager;

/**
 * @author Miyuki
 * createdBy Miyuki 2021/5/2 11:07
 * modifiedBy Miyuki 11:07
 **/

public class Singleton {
    // Eager-mode initialize first
    private  static Singleton singleton = new Singleton();

    private int height;

    private int weight;

    Singleton(){
        this.height = 180;
        this.weight = 180;
        System.out.println("initial");
    }

    public static Singleton getInstance(){
        return singleton;
    }

    public void showSigleton(){
        System.out.println("Hello, my height is" + String.valueOf(height) + "my weight is" + String.valueOf(weight));
    }
    //no need for initialization
    public static void sayhihi(){
        System.out.println("hihi");
    }
}
