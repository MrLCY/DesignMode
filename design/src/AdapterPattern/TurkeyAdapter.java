package AdapterPattern;

import StrategyPattern.Duck;

public class TurkeyAdapter implements Duck {
    Turkey turkey;
    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    @Override
    public void performQuack() {
        turkey.gobble();
    }

    @Override
    public void performFly() {
        for (int i = 0; i < 3; i++) {
            turkey.fly();
        }
    }

    @Override
    public void display() {
        System.out.println("Turkey display");
    }
}
