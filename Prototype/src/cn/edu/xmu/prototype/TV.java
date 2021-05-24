package cn.edu.xmu.prototype;

import cn.edu.xmu.prototype.framework.*;
/**
 * @author Miyuki
 * createdBy Miyuki 2021/5/17 16:17
 * modifiedBy Miyuki 16:17
 **/

public class TV implements Product{
    private char pixel;
    public TV(char p){
        this.pixel = p;
    }
    public void show(String s){
        int length = s.length()+4;
        for (int i=0;i<length;i++){
            System.out.print(pixel);
        }System.out.print("\n|");
        for (int i=0;i<length-2;i++){
            System.out.print(" ");
        }System.out.print("|\n| ");
        System.out.print(s);
        System.out.print(" |\n|");
        for (int i=0;i<length-2;i++){
            System.out.print(" ");
        }System.out.print("|\n");
        for (int i=0;i<length;i++){
            System.out.print(pixel);
        }System.out.print("\n");
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
