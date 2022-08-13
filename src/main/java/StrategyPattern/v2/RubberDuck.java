package StrategyPattern.v2;

public class RubberDuck
        extends DuckV2
        implements Quackable {

    @Override
    void display() {
        System.out.println("나는 러버덕이에오리~");
    }

    @Override
    public void quack() {
        System.out.println("뿌우-");
    }
}
