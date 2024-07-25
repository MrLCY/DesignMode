package CommondPattern.test;

public class CellingFan {
    public final Integer HIGH = 3;
    public final Integer MEDIUM = 2;
    public final Integer OFF = 0;
    public final Integer LOW = 1;
    String  locate;
    Integer speed;
    public CellingFan(String locate){
        this.locate = locate;
        this.speed = OFF;
    }
    public void HIGH(){
        this.speed = HIGH;
    }
    public void MEDIUM(){
        this.speed = MEDIUM;
    }
    public void OFF(){
        this.speed = OFF;
    }
    public void LOW(){
        this.speed = LOW;
    }

    public Integer getSpeed(){
        return this.speed;
    }
}
