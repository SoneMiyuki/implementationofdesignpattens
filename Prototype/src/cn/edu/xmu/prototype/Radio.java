package cn.edu.xmu.prototype;

import cn.edu.xmu.prototype.framework.Product;

/**
 * @author Miyuki
 * createdBy Miyuki 2021/5/17 16:29
 * modifiedBy Miyuki 16:29
 **/

public class Radio implements Product {
    private char pixel;
    public Radio(char p){
        this.pixel = p;
    }
    public void show(String s){
        int length = s.length()+4;
        for (int i=0;i<length;i++){
            System.out.print(pixel);
        }System.out.print("\n\n ");

        System.out.print(s);
        System.out.print(" \n\n");

        for (int i=0;i<length;i++){
            System.out.print(pixel);
        }
        System.out.print("\n");
    }

    public Product createClone(){
        Product product = null;
        try{
            product = (Product)clone();
        }catch (Exception e){
            e.printStackTrace();
        }
        return product;
    }
}
