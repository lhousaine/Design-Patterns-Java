package patterns.behavioral.iterator.createdIterator.pancakeHouse;

import patterns.behavioral.iterator.createdIterator.Iterator;
import patterns.behavioral.iterator.javaIterator.MenuItem;

import java.util.ArrayList;

public class PancakeHouseMenu {

    ArrayList<MenuItem> menuItems;

    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();
        addItem("K&B’s Pancake", "Pancakes with scrambled", true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
        addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }
}