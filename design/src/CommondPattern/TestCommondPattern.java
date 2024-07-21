package CommondPattern;

public class TestCommondPattern {
    public static void main(String[] args) {
        Light light=new Light();
        CommondOnLight commond = new CommondOnLight(light);
        CommondUperDoor doorcommond = new CommondUperDoor(new GargerDoor());
        SimpleRemoteControl control = new SimpleRemoteControl(commond);
        control.expresButton();
        control.setCommond(doorcommond);
        control.expresButton();
    }
}
