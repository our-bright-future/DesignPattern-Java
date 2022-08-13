package StrategyPattern.v3.fly;

public class FlyNoWay implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("...");
    }
}
