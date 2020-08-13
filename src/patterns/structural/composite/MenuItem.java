package patterns.structural.composite;

import java.util.ArrayList;
import java.util.Iterator;

public class MenuItem extends MenuComponent {
    String name;
    String description;
    boolean vegetarian;
    double price;
    ArrayList<MenuComponent> menuComponents = new ArrayList<>();
    Iterator iterator = null;

    public Iterator createIterator() {
        if (iterator == null) {
            iterator = new CompositeIterator(menuComponents.iterator());
        }
        return iterator;
    }

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void print() {
        System.out.print(" " + getName());
        if (isVegetarian()) {
            System.out.print("(v)");
        }
        System.out.println(" , " + getPrice());
        System.out.println(" -- " + getDescription());
    }
}