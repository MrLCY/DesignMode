package DecoratorPattern;

public class Moka extends CondimentDecorator{
    Beverage beverage;
    public Moka(Beverage beverage) {
        this.beverage= beverage;
    }
    @Override
    public float cost() {
        return beverage.cost()+1.1f;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc()+ "+摩卡";
    }
}
