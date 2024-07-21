package CommondPattern;

public class CommondUperDoor implements Commond{
    GargerDoor gargerDoor;
    public CommondUperDoor(GargerDoor gargerDoor){
        this.gargerDoor = gargerDoor;
    }
    @Override
    public void execute() {
        gargerDoor.uper();
    }
}
