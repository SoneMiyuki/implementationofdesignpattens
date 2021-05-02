package cn.edu.xmu.biapater;

/**
 * @author Miyuki
 * createdBy Miyuki 2021/5/2 15:07
 * modifiedBy Miyuki 15:07
 **/

public class Main {
    public static void main(String[] args) {
        System.out.println("J -> S");
        Senior senior1 = new SeniorI();
        Junior junior1 = new Adapter(senior1);
        junior1.juniorWork();
        System.out.println("-------------------");
        System.out.println("S -> J");
        Junior junior2 = new JuniorI();
        Senior senior2 = new Adapter(junior2);
        senior2.seniorWork();
    }
}
