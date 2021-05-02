package cn.edu.xmu.templatemethod;

/**
 * @author Miyuki
 * createdBy Miyuki 2021/5/2 16:05
 * modifiedBy Miyuki 16:05
 **/

public class Main {
    public static void main(String[] args) {
        String header = "This is a header";
        String content = "This is a content";

        Method1 method1 = new Method1();
        Method2 method2 = new Method2();
        method1.printMethod(header, content);
        method2.printMethod(header, content);
    }
}
