package patterns.compound.adapterDecorator;

public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator.simulate();
    }

    static void simulate() {
        Quackable mallardDuck = new QuackCounter(new MallardDuck());
        Quackable redheadDuck = new QuackCounter(new RedheadDuck());
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
        System.out.println("\nDuck Simulator");
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
    }

    private static void simulate(Quackable duck) {
        duck.quack();
    }
}