package StrategyPattern.v3;

import StrategyPattern.v3.fly.FlyBehavior;
import StrategyPattern.v3.quack.QuackBehavior;
import lombok.Setter;

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
