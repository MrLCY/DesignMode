package CommondPattern;

public class SimpleRemoteControl {
    Commond commond;
    Commond oncommond[] ,offcommond[],undoCommond;


    public void setCommond(Commond commond) {
        this.commond = commond;
    }

    public SimpleRemoteControl(Commond commond){
        this.commond=commond;
    }
    public void expresButton(){
        commond.execute();
    }
}
