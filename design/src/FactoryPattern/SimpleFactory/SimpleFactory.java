package FactoryPattern.SimpleFactory;

public class SimpleFactory {
    public static Product createPrpduct(String n){
        if ("A".equals(n)){
            return new ProductA();
        }
        if ("B".equals(n)){
            return new ProductB();
        }
        return null;
    }

    public static void main(String[] args) {
        Product p = SimpleFactory.createPrpduct("A");
        System.out.println(p.toString());
    }
}
