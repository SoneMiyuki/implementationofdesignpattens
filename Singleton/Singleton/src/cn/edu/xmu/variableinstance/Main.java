package cn.edu.xmu.variableinstance;

/**
 * @author Miyuki
 * createdBy Miyuki 2021/5/2 11:15
 * modifiedBy Miyuki 11:15
 **/

public class Main {
    public static void main(String[] args) {
        //this sentence can be used for debuger to see if singleton has been initialized;
        System.out.println("Start...");

        Singleton.sayhihi();

//        Singleton singleton1 = Singleton.getInstance();
//
//        Singleton singleton2 = Singleton.getInstance();
//
//        if(singleton1 == singleton2){
//            System.out.println("s1 and s2 are the same man.");
//        } else {
//            System.out.println("s1 and s2 are not the same man.");
//        }

        Mulgleton mulgleton = new Mulgleton();

        Singleton singleton3 = mulgleton.getInstance();

        Singleton singleton4 = mulgleton.getInstance();

        if(singleton3 == singleton4){
            System.out.println("s3 and s4 are the same man.");
        } else {
            System.out.println("s3 and s4 are not the same man.");
        }

        Mulgleton.turnNumTo(5);

        Singleton singleton5 = mulgleton.getInstance();

        Singleton singleton6 = mulgleton.getInstance();

        if(singleton5 == singleton6){
            System.out.println("s5 and s6 are the same man.");
        } else {
            System.out.println("s5 and s6 are not the same man.");
        }


        System.out.println("End...");

    }
}
