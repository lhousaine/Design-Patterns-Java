package patterns.structural.decorator.decorators;

import patterns.structural.decorator.products.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    public abstract String getDescription();
}