package patterns.behavioral.iterator.createdIterator.pancakeHouse;

import patterns.behavioral.iterator.createdIterator.Iterator;
import patterns.behavioral.iterator.javaIterator.MenuItem;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {
    ArrayList<MenuItem> items;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Object next() {
        MenuItem menuItem = items.get(position);
        position = position + 1;
        return menuItem;
    }

    public boolean hasNext() {
        return position < items.size() && items.get(position) != null;
    }
}
