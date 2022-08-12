package StrategyPattern.SimUduck.v3.fly;

public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("펄럭펄럭");
    }
}
