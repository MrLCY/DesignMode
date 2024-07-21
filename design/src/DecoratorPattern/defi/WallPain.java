package DecoratorPattern.defi;

public class WallPain extends MaterialDecorator{
    House house;
    public WallPain(House house){
        this.house=house;
    }
    @Override
    public float cost() {
        return 8+house.cost();
    }
    public String getDesc(){
        return this.house.getDesc()+"+墙漆";
    }
}
