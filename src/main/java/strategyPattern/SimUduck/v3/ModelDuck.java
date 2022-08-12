package strategyPattern.SimUduck.v3;

import strategyPattern.SimUduck.v3.fly.FlyNoWay;
import strategyPattern.SimUduck.v3.quack.MuteQuack;

public class ModelDuck extends Duck{

    public ModelDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    void display() {
        System.out.println("저는 모형 오리에오리~");
    }
}
