package cn.edu.xmu.specifiediterator;

/**
 * @author Miyuki
 * createdBy Miyuki 2021/5/17 15:25
 * modifiedBy Miyuki 15:25
 **/

public class Book {

    private String name = "";

    private String code = "";

    public Book(String s,String code){
        this.name = s;this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
