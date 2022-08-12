package StrategyPattern.SimUduck.v1;

public abstract class DuckV1 {

    public void quack() {
        System.out.println("꽥꽥");
    }

    public void swim() {
        System.out.println("첨벙첨벙");
    }

    public void fly() {
        System.out.println("푸드덕");
    }

    abstract void display();
}
