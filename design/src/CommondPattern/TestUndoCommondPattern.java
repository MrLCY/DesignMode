package CommondPattern;

public class TestUndoCommondPattern {
    public static void main(String[] args) {
        Light light = new Light();
        CommondOnLight  onlight = new CommondOnLight(light);
        Commond offlight = new CommondOffLight(light);
        SimpleControlWithUndo simpleControlWithUndo = new SimpleControlWithUndo();
        simpleControlWithUndo.setCommond(0,onlight,offlight);
        simpleControlWithUndo.onCommondPush(0);;
        simpleControlWithUndo.offCommondPush(0);
        simpleControlWithUndo.offCommondPush(0);
    }
}
