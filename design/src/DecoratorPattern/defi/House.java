package DecoratorPattern.defi;

public abstract class House {
    protected String desc="";
    public abstract float cost();
    public String getDesc(){
        return desc;
    }
}
