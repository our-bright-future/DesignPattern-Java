package ObserverPattern.v2;

import ObserverPattern.v2.display.CurrentConditionsDisplay;
import ObserverPattern.v2.display.ForecastDisplay;
import ObserverPattern.v2.display.StatisticsDisplay;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay =
                new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay =
                new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay =
                new ForecastDisplay(weatherData);

        weatherData.setMeasurements(25, 65, 30.4f);
        weatherData.setMeasurements(23, 70, 29.2f);
        weatherData.setMeasurements(22, 90, 29.2f);

        weatherData.removeObserver(forecastDisplay);
        weatherData.setMeasurements(26, 60, 30.1f);
    }
}
