package patterns.creational.factory.concreteCreator;

import patterns.creational.factory.abstractCreator.PizzaStore;
import patterns.creational.factory.abstractProduct.Pizza;
import patterns.creational.factory.concreteProducts.nyProducts.NYStyleCheesePizza;
import patterns.creational.factory.concreteProducts.nyProducts.NYStyleClamPizza;
import patterns.creational.factory.concreteProducts.nyProducts.NYStylePepperoniPizza;
import patterns.creational.factory.concreteProducts.nyProducts.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {
    public Pizza createPizza(String item) {
        switch (item) {
            case "cheese":
                return new NYStyleCheesePizza();
            case "veggie":
                return new NYStyleVeggiePizza();
            case "clam":
                return new NYStyleClamPizza();
            case "pepperoni":
                return new NYStylePepperoniPizza();
            default:
                return null;
        }
    }
}