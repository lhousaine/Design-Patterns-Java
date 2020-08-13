package patterns.behavioral.iterator.javaIterator;

import patterns.behavioral.iterator.createdIterator.Waitress;
import patterns.behavioral.iterator.createdIterator.diner.DinerMenu;
import patterns.behavioral.iterator.createdIterator.pancakeHouse.PancakeHouseMenu;

public class MainTestClass {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
        waitress.printMenu();
    }
}
