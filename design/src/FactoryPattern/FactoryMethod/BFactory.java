package FactoryPattern.FactoryMethod;

import FactoryPattern.SimpleFactory.Product;
import FactoryPattern.SimpleFactory.ProductB;

public class BFactory implements ProductFactory{
    @Override
    public Product getProduct() {
        return new ProductB();
    }
}
