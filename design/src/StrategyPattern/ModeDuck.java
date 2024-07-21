package StrategyPattern;

public class ModeDuck extends Duck{
    public ModeDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new QuackGua();
    }

    @Override
    public void display() {
        System.out.println("橡皮鸭子");
    }
}
