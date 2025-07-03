import java.util.ArrayList;
import java.util.List;
/**
 * This class represents a checklist that contains a list of items.
 * Each item can be added or removed from the checklist.
 */

class Checklist {
    private List<Item> items;

    public Checklist() {
        List items = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void addItem(String name, boolean completed, String description) {
        Item item = new Item(name, completed, description);
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public List<Item> getItems() {
        return items;
    }
}
