package patterns.compound.observer.ducks;

import patterns.compound.observer.QuackObservable;

public interface Quackable extends QuackObservable {
    public void quack();
}