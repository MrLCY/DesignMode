package DecoratorPattern.defi;

public class Floor extends MaterialDecorator{
    House house;
    public Floor(House house){
        this.house=house;

    }
    @Override
    public float cost() {
        return house.cost()+3;
    }
    public String getDesc(){
        return house.getDesc()+"+地板";
    }
}
