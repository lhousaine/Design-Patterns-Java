package patterns.behavioral.strategy.quacking;

public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }
}