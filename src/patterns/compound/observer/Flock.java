package patterns.compound.observer;

import patterns.compound.observer.ducks.Quackable;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {

    ArrayList<Quackable> quackers = new ArrayList<>();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    public Iterator createIterator() {
        return quackers.iterator();
    }

    public void quack() {
        Iterator iterator = this.createIterator();
        while (iterator.hasNext()) {
            Quackable quacker = (Quackable) iterator.next();
            quacker.quack();
            quacker.notifyObservers();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        Iterator iterator = this.createIterator();
        while (iterator.hasNext()) {
            Quackable quacker = (Quackable) iterator.next();
            quacker.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {
        System.out.println("notify all flock quackers");
    }
}
