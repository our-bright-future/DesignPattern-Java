package ObserverPattern.v2.display;

import ObserverPattern.v2.WeatherData;
import ObserverPattern.v2.observe.Observer;

public class StatisticsDisplay implements DisplayElement, Observer {

    private float maxTemperature;
    private float minTemperature = 60;
    private float meanTemperature;
    private int counter = 0;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure) {
        if (temp > maxTemperature) {
            maxTemperature = temp;
        }
        if (temp < minTemperature) {
            minTemperature = temp;
        }
        meanTemperature = (meanTemperature * counter + temp) / ++counter;

        display();
    }

    @Override
    public void display() {
        System.out.printf("평균/최고/최저 온도 = %.1f/%.1f/%.1f\n",
                meanTemperature, maxTemperature, minTemperature);
    }
}
