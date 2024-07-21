package ObserverPattern.ch;

public class TestObserverP {
    public static void main(String[] args) {
        WeatherDataCh weatherDataCh = new WeatherDataCh();
        CurConDisplay curConDisplay = new CurConDisplay(weatherDataCh);
        weatherDataCh.setWeatherDataCH(100,45,34);
    }
}
