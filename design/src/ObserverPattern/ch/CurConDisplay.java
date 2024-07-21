package ObserverPattern.ch;

import java.util.Observable;
import java.util.Observer;

public class CurConDisplay implements Observer ,DisplayInterface{

    private Observable weather;
    private float temp,hump,press;
    public CurConDisplay (Observable weather){
        this.weather = weather;
//        weather.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherDataCh){
            WeatherDataCh w = (WeatherDataCh) o;
            this.temp = w.getTemp();
            this.hump =w.getHump();
            this.press =w.getPress();
            display();
        }
    }

    @Override
    public void display() {
        System.out.printf("CurConDisplay:温度 %f 湿度 %f 气压 %f",this.temp,this.hump,this.press);
    }
}
