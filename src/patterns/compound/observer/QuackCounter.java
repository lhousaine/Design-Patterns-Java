package patterns.compound.observer;

import patterns.compound.observer.ducks.Quackable;

public class QuackCounter implements Quackable {
    Quackable duck;
    static int numberOfQuacks;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    public void quack() {
        duck.quack();
        numberOfQuacks++;
        notifyObservers();
    }

    public static int getQuacks() {
        return numberOfQuacks;
    }

    public void registerObserver(Observer observer) {
        this.duck.registerObserver(observer);
    }

    public void notifyObservers() {
        this.duck.notifyObservers();
    }
}
