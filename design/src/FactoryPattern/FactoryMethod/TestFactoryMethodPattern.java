package FactoryPattern.FactoryMethod;

public class TestFactoryMethodPattern {
    public static void main(String[] args) {
        ProductFactory factory = new AFactory();
        factory.getProduct().createProduct();
    }
}
