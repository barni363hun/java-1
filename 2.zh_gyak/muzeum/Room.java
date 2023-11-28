import java.util.LinkedList;

public class Room {
    String name;
    LinkedList<Item> items = new LinkedList<Item>();
    public Room(String n,Item[] _items) {
        name = n;
        for (Item i : _items) {
            items.add(i);
        }
    }
}
