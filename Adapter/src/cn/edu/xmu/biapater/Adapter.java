package cn.edu.xmu.biapater;

/**
 * @author Miyuki
 * createdBy Miyuki 2021/5/2 14:53
 * modifiedBy Miyuki 14:53
 **/

public class Adapter implements Senior,Junior{

    Senior senior;

    Junior junior;

    public Adapter(Senior senior){
        this.senior = senior;
    }

    public Adapter(Junior junior){
        this.junior = junior;
    }

    @Override
    public void juniorWork(){
        senior.seniorWork();
    }

    @Override
    public void seniorWork(){
        junior.juniorWork();
    }
}
