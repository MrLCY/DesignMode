package DecoratorPattern;

public class IceCofe extends Beverage{
    public IceCofe(){
        desc="冰咖啡";
    }
    @Override
    public float cost() {
        return 3;
    }
}
