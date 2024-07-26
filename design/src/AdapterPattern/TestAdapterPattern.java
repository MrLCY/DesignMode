package AdapterPattern;

import StrategyPattern.Duck;

public class TestAdapterPattern {
    public static void main(String[] args) {
        Duck turkey = new TurkeyAdapter(new WildTurkey());
        turkey.performQuack();
        turkey.performFly();
        turkey.display();
    }
}
