package patterns.behavioral.iterator.javaIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
    ArrayList<MenuItem> menus;

    public Waitress(ArrayList<MenuItem> menus) {
        this.menus = menus;
    }

    public void printMenu() {
        for (MenuItem menuItem : menus) {
            Menu menu = (Menu) menuItem;
            printMenu(menu.createIterator());
        }
    }

    void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}