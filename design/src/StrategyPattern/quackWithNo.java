package StrategyPattern;

public class quackWithNo implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("no quack ");
    }
}
