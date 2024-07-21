package FactoryPattern;

public class OrderPizza {
    public static void main(String[] args) {
        Pizza pizza = null;
        pizza.prepare();
        pizza.bake();;
        pizza.cut();
        pizza.box();
    }
}
