package datastructures;
import java.util.Comparator;
public class ItemNode {

    String name;
    String id;
    double price;
    int qun;
    int storeNum;
    ItemNode next;

    public ItemNode() {
    }

    public ItemNode(String name, String id, double price, int qun) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.qun = qun;
    }

    public int compare(Object o1) {
        ItemNode a1 = (ItemNode) (o1);
        return (a1.name.compareTo(this.name));

    }

}
