import java.util.Comparator;

class ItemComparator implements Comparator<Item> {
    @Override
    public int compare(Item i1, Item i2) {
        return Integer.compare(i1.room, i2.room);
    }
}