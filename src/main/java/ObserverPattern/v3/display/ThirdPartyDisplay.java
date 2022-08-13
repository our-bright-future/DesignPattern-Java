package ObserverPattern.v3.display;

import ObserverPattern.v3.WeatherData;
import ObserverPattern.v3.observe.Observer;

public class ThirdPartyDisplay implements DisplayElement, Observer {

    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    public ThirdPartyDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        display();
    }

    @Override
    public void display() {
        //사용자 정의 디스플레이 출력
    }
}
