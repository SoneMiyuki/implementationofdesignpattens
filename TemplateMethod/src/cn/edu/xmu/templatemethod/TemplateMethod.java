package cn.edu.xmu.templatemethod;

/**
 * @author Miyuki
 * createdBy Miyuki 2021/5/2 15:51
 * modifiedBy Miyuki 15:51
 **/

public abstract class TemplateMethod {
    //final is the key to this method for the child cannot control the parent
    public final void printMethod(String head,String content){
        printBegin();
        if(hasHead()){
            printHead(head);
        }
        printContent(content);
    }

    abstract void printBegin();

    abstract boolean hasHead();

    abstract void printHead(String s);

    abstract void printContent(String s);
}
