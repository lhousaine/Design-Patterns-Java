package patterns.creational.factory.concreteCreator;

import patterns.creational.factory.abstractCreator.PizzaStore;
import patterns.creational.factory.abstractProduct.Pizza;
import patterns.creational.factory.concreteProducts.chicagoProducts.ChicagoStyleCheesePizza;
import patterns.creational.factory.concreteProducts.chicagoProducts.ChicagoStyleClamPizza;
import patterns.creational.factory.concreteProducts.chicagoProducts.ChicagoStylePepperoniPizza;
import patterns.creational.factory.concreteProducts.chicagoProducts.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

    public Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new ChicagoStyleCheesePizza();
            case "pepperoni":
                return new ChicagoStylePepperoniPizza();
            case "clam":
                return new ChicagoStyleClamPizza();
            case "veggie":
                return new ChicagoStyleVeggiePizza();
            default:
                return null;
        }
    }
}