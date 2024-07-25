package CommondPattern;

public class CommondOffLight implements Commond{
    Light light;
    public CommondOffLight(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        this.light.Off();
    }

    @Override
    public void undo() {
        this.light.On();
    }
}
