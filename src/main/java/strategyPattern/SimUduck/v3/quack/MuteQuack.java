package strategyPattern.SimUduck.v3.quack;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("...");
    }
}
