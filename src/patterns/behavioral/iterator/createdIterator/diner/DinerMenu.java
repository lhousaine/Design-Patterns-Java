package patterns.behavioral.iterator.createdIterator.diner;

import patterns.behavioral.iterator.createdIterator.Iterator;
import patterns.behavioral.iterator.javaIterator.MenuItem;

public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT", "(Fakin’) Bacon with lettuce", true, 2.99);
        addItem("BLT", "Bacon with lettuce & tomato", false, 2.99);
        addItem("Soup of the day", "Soup of the day,", false, 3.29);
        addItem("Hotdog", "A hot dog, with saurkraut,", false, 3.05);
    }

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
    // other menu methods here

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full! Can’t add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }
}
