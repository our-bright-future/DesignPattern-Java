package strategyPattern.SimUduck.v3.quack;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("꽥꽥");
    }
}
