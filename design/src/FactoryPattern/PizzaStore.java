package FactoryPattern;

public abstract class PizzaStore {
    SimplePizzaFactory factory;
    public PizzaStore(SimplePizzaFactory factory){
        this.factory= factory;
    }
    public Pizza orderPizza(String pizname){
        Pizza pizza;
        pizza = createPizza(pizname);
        pizza.prepare();
        pizza.bake();;
        pizza.cut();
        pizza.box();
        return pizza;
    }
    public abstract Pizza createPizza(String type);
}
