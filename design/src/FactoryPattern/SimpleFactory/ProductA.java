package FactoryPattern.SimpleFactory;

public class ProductA implements Product{

    @Override
    public void createProduct() {
        System.out.println("创建A产品");
    }
}
