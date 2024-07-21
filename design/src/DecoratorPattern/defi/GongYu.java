package DecoratorPattern.defi;

public class GongYu extends House{
    public GongYu(){
        desc="公寓住宅";
    }
    @Override
    public float cost() {
        return 100000;
    }
}
