package CommondPattern;

public class Nocommond implements Commond{
    @Override
    public void execute() {
        System.out.println("nothing");
    }

    @Override
    public void undo() {
        System.out.println("nothing");
    }
}
