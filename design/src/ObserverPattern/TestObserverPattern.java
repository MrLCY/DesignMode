package ObserverPattern;

public class TestObserverPattern {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setWeatherData(10,11,234);
        weatherData.setWeatherData(14,11,234);
        weatherData.setWeatherData(16,11,234);
    }
}
