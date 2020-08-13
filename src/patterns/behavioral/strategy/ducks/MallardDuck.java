package patterns.behavioral.strategy.ducks;

import patterns.behavioral.strategy.flying.FlyWithWings;
import patterns.behavioral.strategy.quacking.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}