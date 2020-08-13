package patterns.behavioral.strategy;

import patterns.behavioral.strategy.ducks.Duck;
import patterns.behavioral.strategy.ducks.MallardDuck;
import patterns.behavioral.strategy.ducks.ModelDuck;
import patterns.behavioral.strategy.flying.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}