package FactoryPattern;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings  = new ArrayList();
    public  void prepare(){
        System.out.println("准备"+name);
        for (Object topping : toppings) {
            System.out.println("   "+topping);
        }
    }
    public   void bake(){
        System.out.println("烤20-40分钟");
    };
    public   void cut(){
        System.out.println("切披萨");
    };
    public   void box(){
        System.out.println("打包披萨");
    };
}
