package cn.edu.xmu.prototype;

import cn.edu.xmu.prototype.framework.Manager;
import cn.edu.xmu.prototype.framework.Product;

/**
 * @author Miyuki
 * createdBy Miyuki 2021/5/17 16:32
 * modifiedBy Miyuki 16:32
 **/

public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager();

        TV tv0 = new TV('*');
        Radio radio0 = new Radio('-');

        manager.register("tv",tv0);
        manager.register("radio",radio0);

        Product p1 = manager.create("tv");

        Product p2 = manager.create("radio");

        p1.show("It's a TV Programe");

        p2.show("It's a Radio Programe");
    }


}
