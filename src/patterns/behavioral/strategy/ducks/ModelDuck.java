package patterns.behavioral.strategy.ducks;

import patterns.behavioral.strategy.flying.FlyNoWay;
import patterns.behavioral.strategy.quacking.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}