package ObserverPattern.v1.display;

import ObserverPattern.v2.WeatherData;

public class ThirdPartyDisplay implements DisplayElement{

    private float temperature;
    private float humidity;
    private float pressure;

    public void update(float temp, float humidity, float pressure) {

        display();
    }

    @Override
    public void display() {
        //사용자 정의 디스플레이 출력
    }
}
