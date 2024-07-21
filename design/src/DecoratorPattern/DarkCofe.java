package DecoratorPattern;

public class DarkCofe extends Beverage{
    public DarkCofe(){
        desc="黑咖啡";
    }
    @Override
    public float cost() {
        return 4;
    }
}
