package CommondPattern;

public class SimpleControlWithUndo {
    Commond oncommond[],offcommond[],undocommond;
    public SimpleControlWithUndo(){
        oncommond = new Commond[2];
        offcommond = new Commond[2];
        Commond nocommond = new Nocommond();
        for(int i = 0; i<2; i++){
            oncommond[i] = new Nocommond();
            offcommond[i] = new Nocommond();
        }
        undocommond = nocommond;
    }
    public void setCommond(int slot,Commond oncommond,Commond offcommond){
        this.oncommond[slot] = oncommond;
        this.offcommond[slot] = offcommond;
    }
    public void onCommondPush(int slot){
        oncommond[slot].execute();
        undocommond = oncommond[slot];
    }
    public void offCommondPush(int slot){
        offcommond[slot].execute();
        undocommond = oncommond[slot];
    }
    public void setUndocommond(){
        this.undocommond.undo();
    }
}
