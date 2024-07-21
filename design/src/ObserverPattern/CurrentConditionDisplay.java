package ObserverPattern;

public class CurrentConditionDisplay implements Observer,DisplayElement{
    private float temp,hump,pressure;
    public CurrentConditionDisplay(Subject weatherData){
        weatherData.addObserver(this);
    }
    public void display() {
        System.out.printf("当前情况布告板："+"%f℃"+"湿度%f压力%f",this.temp,this.hump,this.pressure);
    }

    public void update(float temp, float humity, float pressure) {
        this.temp = temp;
        this.hump = hump;
        this.pressure = pressure;
        display();;
    }
}
