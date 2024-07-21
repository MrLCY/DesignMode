package ObserverPattern;

import java.util.ArrayList;

public class WeatherData implements Subject{
    private ArrayList<Observer> observers;
    private float temp;
    private float hump;
    private float pressure;
    public WeatherData(){
        observers = new ArrayList<Observer>();
    }
    public void addObserver(Observer observser) {
        if(!observers.contains(observser)){
             observers.add(observser);
        }
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(this.temp,this.hump,this.pressure);
        }
    }
    public void measurementsChange(){
        notifyObserver();
    }
    public void setWeatherData(float temp,float hump,float pressure){
        this.temp= temp;
        this.hump = hump;
        this.pressure = pressure;
        measurementsChange();
    }
}
