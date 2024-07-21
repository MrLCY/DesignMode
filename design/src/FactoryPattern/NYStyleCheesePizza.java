package FactoryPattern;

public class NYStyleCheesePizza extends Pizza{
    public NYStyleCheesePizza(){
        name="纽约风味披萨";
        dough="大尺寸";
        sauce="Marinara Sauce";
        toppings.add("纽约风味披萨");
    }
    @Override
    public void prepare() {

        System.out.println("NYStyleCheesePizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
