package StrategyPattern.SimUduck.v1;

public class DecoyDuck extends DuckV1 {

    @Override
    public void quack() {
        System.out.println("...");
    }

    @Override
    public void fly() {
        System.out.println("난 날지못해오리...");
    }

    @Override
    void display() {
        System.out.println("나는 나무오리에오리~");
    }
}
