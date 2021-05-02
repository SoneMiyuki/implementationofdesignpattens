package cn.edu.xmu.trditionaladepter;

/**
 * @author Miyuki
 * createdBy Miyuki 2021/5/2 14:27
 * modifiedBy Miyuki 14:27
 **/

public class Employer extends Work{

    Employee employee;

    public Employer(){
        employee = new Employee();
    }

    //adapter need to adapt the int into string and call employee
    public void printFile(int num){
        String s = String.valueOf(num);
        employee.print(s);
    }

}
