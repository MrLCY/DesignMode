package FactoryPattern;

public class SimplePizzaFactory {
    public Pizza createPizza(String pizname){

        Pizza pizza = null;
        if("cheese".equals(pizname)){
            pizza = new CheesePizza();
        }
        return pizza;
    }
}
