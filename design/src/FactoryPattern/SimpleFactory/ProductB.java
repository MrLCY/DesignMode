package FactoryPattern.SimpleFactory;

public class ProductB implements Product{
    @Override
    public void createProduct() {
        System.out.println("生产B产品");
    }
}
