package DecoratorPattern.defi;

public class Residiense extends House{

    public Residiense(){
        desc="住宅房子";
    }
    @Override
    public float cost() {
        return 150000;
    }
}
