package patterns.behavioral.strategy.quacking;

public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack");
    }
}