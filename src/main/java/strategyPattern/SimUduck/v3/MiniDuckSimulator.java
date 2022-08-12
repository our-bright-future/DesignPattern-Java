package strategyPattern.SimUduck.v3;

import strategyPattern.SimUduck.v3.fly.FlyRocketPowered;

public class MiniDuckSimulator {

    public static void main(String[] args) {

        System.out.println("MallardDuck");
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        System.out.println("\nModelDuck");
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
