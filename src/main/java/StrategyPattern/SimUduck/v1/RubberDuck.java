package StrategyPattern.SimUduck.v1;

public class RubberDuck extends DuckV1 {

    @Override
    public void quack() {
        System.out.println("뿌우-");
    }

    @Override
    void display() {
        System.out.println("나는 러버덕이에오리~");
    }

    @Override
    public void fly() {
        System.out.println("난 날지 못해오리...");
    }
}
