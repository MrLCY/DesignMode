package CommondPattern;

public class CommondOnLight implements Commond{
    Light light;
    public CommondOnLight(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        this.light.On();
    }
}
