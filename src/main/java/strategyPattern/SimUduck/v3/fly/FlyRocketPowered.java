package strategyPattern.SimUduck.v3.fly;

public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("푸슝");
    }
}
