package strategyPattern.SimUduck.v3.quack;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("삑삑");
    }
}
