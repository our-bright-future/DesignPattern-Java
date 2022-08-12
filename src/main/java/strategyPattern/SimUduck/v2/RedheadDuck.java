package strategyPattern.SimUduck.v2;

public class RedheadDuck
        extends DuckV2
        implements Quackable, Flyable {

    void display() {
        System.out.println("나는 아메리카흰죽지에오리~");
    }

    @Override
    public void fly() {
        System.out.println("푸드덕");
    }

    @Override
    public void quack() {
        System.out.println("꽥꽥");
    }
}
