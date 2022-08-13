package StrategyPattern.v2;

public class MallardDuck
        extends DuckV2
        implements Quackable, Flyable{

    @Override
    public void quack() {
        System.out.println("꽥꽥");
    }

    @Override
    public void fly() {
        System.out.println("푸드덕");
    }

    @Override
    void display() {
        System.out.println("나는 청둥오리에오리~");
    }
}
