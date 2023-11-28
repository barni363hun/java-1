public class Item {
    int id;
    String name;
    String desc;
    int room;

    public Item(int i, String n, String d, int r) {
        id = i;
        name = n;
        desc = d;
        room = r;
    }
    public void printData(){
        System.out.print(" Item ID: " + id);
        System.out.print(" Name: " + name);
        System.out.print(" Description: " + desc);
        System.out.println(" Room: " + room);
    }
}
