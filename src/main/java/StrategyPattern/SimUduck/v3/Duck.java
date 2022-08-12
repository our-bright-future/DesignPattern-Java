package StrategyPattern.SimUduck.v3;

import lombok.Setter;
import StrategyPattern.SimUduck.v3.fly.FlyBehavior;
import StrategyPattern.SimUduck.v3.quack.QuackBehavior;

@Setter
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void swim() {
        System.out.println("첨벙첨벙");
    }

    abstract void display();
}
