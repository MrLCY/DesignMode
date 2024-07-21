package DecoratorPattern;

public class Expresso extends Beverage{
    public Expresso(){
        desc = "浓缩咖啡";
    }
    @Override
    public float cost() {
        return 1.2f;
    }
}
