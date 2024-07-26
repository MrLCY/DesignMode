package AdapterPattern;

public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("gegeege");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying  a short distince");
    }
}
