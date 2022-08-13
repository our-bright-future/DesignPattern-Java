package ObserverPattern.v1;

import ObserverPattern.v1.display.CurrentConditionsDisplay;
import ObserverPattern.v1.display.ForecastDisplay;
import ObserverPattern.v1.display.StatisticsDisplay;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WeatherData {

    private float temperature;
    private float humidity;
    private float pressure;

    private CurrentConditionsDisplay currentConditionsDisplay;
    private StatisticsDisplay statisticsDisplay;
    private ForecastDisplay forecastDisplay;

    public void measurementsChanged() {

        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        currentConditionsDisplay.update(temp, humidity, pressure);
        statisticsDisplay.update(temp, humidity, pressure);
        forecastDisplay.update(temp, humidity, pressure);
    }

}
