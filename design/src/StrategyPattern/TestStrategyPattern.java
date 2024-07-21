package StrategyPattern;

import javax.lang.model.element.PackageElement;
import java.util.ServiceLoader;

public class TestStrategyPattern {
    public static void main(String[] args) {

        Duck duck = new ModeDuck();
        duck.setFlyBehavior(new FlyWithWings());
        duck.display();
        duck.performFly();

        duck.performQuack();


    }
}
