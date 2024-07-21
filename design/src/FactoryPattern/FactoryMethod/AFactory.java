package FactoryPattern.FactoryMethod;

import FactoryPattern.SimpleFactory.Product;
import FactoryPattern.SimpleFactory.ProductA;
import FactoryPattern.SimpleFactory.ProductB;

public class AFactory implements ProductFactory{
    @Override
    public Product getProduct() {
        return new ProductA();
    }
}
