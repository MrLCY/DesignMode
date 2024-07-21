package DecoratorPattern;

public abstract class Beverage {
    String desc = "unkown beverage";
    public abstract float cost();

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}