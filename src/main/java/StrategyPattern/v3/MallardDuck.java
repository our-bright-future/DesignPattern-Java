package StrategyPattern.v3;

import StrategyPattern.v3.fly.FlyWithWings;
import StrategyPattern.v3.quack.Quack;

public class MallardDuck extends Duck{

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    void display() {
        System.out.println("나는 청둥오리에오리~");
    }
}
