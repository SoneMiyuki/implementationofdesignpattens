package cn.edu.xmu.factory.studentcard;

import cn.edu.xmu.factory.framework.Product;

/**
 * @author Miyuki
 * createdBy Miyuki 2021/5/17 18:03
 * modifiedBy Miyuki 18:03
 **/

public class StudentCard extends Product {
    private String owner;
    StudentCard(String owner) {
        System.out.println("建立" + owner + "的学生卡。");
        this.owner = owner;
    }
    public void use () {
        System.out.println("使用" + owner + "的学生卡。");
    }
    public String getOwner() {
        return owner;
    }
}