package StrategyPattern;

public class QuackGua implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("gu gu gu");
    }
}
