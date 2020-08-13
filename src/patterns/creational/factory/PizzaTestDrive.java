package patterns.creational.factory;

import patterns.creational.factory.abstractCreator.PizzaStore;
import patterns.creational.factory.abstractProduct.Pizza;
import patterns.creational.factory.concreteCreator.ChicagoPizzaStore;
import patterns.creational.factory.concreteCreator.NYPizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
