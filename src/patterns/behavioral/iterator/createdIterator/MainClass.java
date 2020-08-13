package patterns.behavioral.iterator.createdIterator;

import patterns.behavioral.iterator.createdIterator.diner.DinerMenu;
import patterns.behavioral.iterator.createdIterator.pancakeHouse.PancakeHouseMenu;
import patterns.behavioral.iterator.javaIterator.CafeMenu;

public class MainClass {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
        waitress.printMenu();
    }
}
