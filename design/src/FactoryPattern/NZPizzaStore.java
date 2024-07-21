package FactoryPattern;

public class NZPizzaStore extends PizzaStore{


    public NZPizzaStore(SimplePizzaFactory factory) {
        super(factory);
    }

    @Override
    public Pizza createPizza(String type) {
        if("cheese".equals(type)){
            return new NYStyleCheesePizza();
        }
        return null;
    }
}
