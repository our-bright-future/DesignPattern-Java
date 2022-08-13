package ObserverPattern.v1.display;

public class CurrentConditionsDisplay implements DisplayElement{

    private float temperature;
    private float humidity;

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
