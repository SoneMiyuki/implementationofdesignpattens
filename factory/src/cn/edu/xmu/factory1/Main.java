package cn.edu.xmu.factory1;


import cn.edu.xmu.factory1.bread.BreadFactory;
import cn.edu.xmu.factory1.cake.CakeFactory;
import cn.edu.xmu.factory1.framework.Factory;
import cn.edu.xmu.factory1.framework.Goods;

/**
 * @author Miyuki
 * createdBy Miyuki 2021/5/17 17:55
 * modifiedBy Miyuki 17:55
 **/

public class Main {
    public static void main(String[] args) {
        Factory factory = new CakeFactory();
        Goods g1 = factory.create("寿司蛋糕");
        Goods g2 = factory.create("虎皮蛋糕");
        Goods g3 = factory.create("蛋糕");
        g1.showTag();
        g2.showTag();
        g3.showTag();
        Factory factory1 = new BreadFactory();
        Goods g4 = factory1.create("餐包");
        Goods g5 = factory1.create("沙拉包");
        Goods g6 = factory1.create("椰蓉包");
        g4.showTag();
        g5.showTag();
        g6.showTag();

    }
}