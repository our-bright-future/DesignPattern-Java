package ObserverPattern.v2.display;

import ObserverPattern.v2.WeatherData;
import ObserverPattern.v2.observe.Observer;

public class CurrentConditionsDisplay implements DisplayElement, Observer {

    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("현재 상태: 온도 " + temperature + "C, 습도 " + humidity + "%");
    }
}
