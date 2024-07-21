package DecoratorPattern;

public class TestDecoratorPattern {
    public static void main(String[] args) {
        Beverage beverage = new Expresso();
        beverage = new Moka(beverage);
        beverage = new Moka(beverage);
        System.out.println(beverage.getDesc()+beverage.cost());
    }
}
