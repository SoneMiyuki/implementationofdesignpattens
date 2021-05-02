package cn.edu.xmu.templatemethod;

/**
 * @author Miyuki
 * createdBy Miyuki 2021/5/2 15:56
 * modifiedBy Miyuki 15:56
 **/

public class Method2 extends TemplateMethod{

    //With head

    @Override
    void printBegin() {
        System.out.println("Begin: ----------");
    }

    @Override
    boolean hasHead() {
        return true;
    }

    @Override
    void printHead(String s) {
        System.out.println("Head: ----------");
        System.out.println(s);
    }

    @Override
    void printContent(String s) {
        System.out.println("Content: ----------");
        System.out.println(s);
    }

    Method2 (){}
}
