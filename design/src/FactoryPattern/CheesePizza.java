package FactoryPattern;

public class CheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("准备芝士披萨");
    }
}
