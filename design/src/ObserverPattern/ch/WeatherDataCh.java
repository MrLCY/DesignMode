package ObserverPattern.ch;

import java.util.Observable;
import java.util.Observer;

public class WeatherDataCh extends Observable {
    private float temp,hump,press;
    public WeatherDataCh(){

    }
    public void setWeatherDataCH(float temp,float hump,float press){
        this.temp =temp;
        this.hump = hump;this.press=press;
        weatherChange();
    }
    public void weatherChange(){
        setChanged();
        notifyObservers();
    }

    public float getTemp() {
        return temp;
    }

    public float getHump() {
        return hump;
    }

    public float getPress() {
        return press;
    }
}
