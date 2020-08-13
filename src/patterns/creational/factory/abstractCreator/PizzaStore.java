package patterns.creational.factory.abstractCreator;

import patterns.creational.factory.abstractProduct.Pizza;

/*The Factory Method Pattern defi nes an interface
for creating an object, but lets subclasses decide which
class to instantiate. Factory Method lets a class defer
instantiation to subclasses.*/

public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);// abstract patterns.creational.factory method
}