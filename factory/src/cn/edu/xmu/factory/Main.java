package cn.edu.xmu.factory;

import cn.edu.xmu.factory.framework.Factory;
import cn.edu.xmu.factory.framework.Product;
import cn.edu.xmu.factory.idcard.IDCardFactory;
import cn.edu.xmu.factory.studentcard.StudentCardFactory;

/**
 * @author Miyuki
 * createdBy Miyuki 2021/5/17 17:55
 * modifiedBy Miyuki 17:55
 **/

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("乔峰");
        Product card2 = factory.create("令狐冲");
        Product card3 = factory.create("武松");
        card1.use();
        card2.use();
        card3.use();
        Factory factory1 = new StudentCardFactory();
        Product product4 = factory1.create("司马懿");
        Product product5 = factory1.create("诸葛亮");
        Product product6 = factory1.create("曹孟德");
        product4.use();
        product5.use();
        product6.use();

    }
}