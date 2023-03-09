package datastructures;
import java.util.Objects;
public class ShoppingCartList {
    int size = 0;
    ItemNode head;
    ItemNode tail;
    public ShoppingCartList() {
    }

    public void AddItem(ItemNode it) {
        int ReqQunt = it.qun;
        int storeNum = it.storeNum - 1;
        MainLinkedListMol mol = new MainLinkedListMol();
        StoreNode cur = mol.head;
        while (storeNum-- > 0) {
            cur = cur.next;
        }
        StoreLinkedList store = cur.store;
        ItemNode h = store.head;
        while (h != null) {
            if (Objects.equals(h.id, it.id)) {
                if (h.qun >= it.qun) {
                    h.qun -= (it.qun);
                    if (head == null) {
                        head = it;
                        tail = null;

                    } else {
                        tail.next = it;
                        tail = it;
                        tail.next = null;

                    }
                    size++;

                }
                break;
            }
        }

    }

    public void returenItem(String name, int Qun) {
        ItemNode cur = head;
        while (cur != null && cur.name != name) {
            cur = cur.next;
        }
        int storeNum = cur.storeNum;

        MainLinkedListMol mol = new MainLinkedListMol();
        mol.Add(storeNum, cur);

    }

    public void Confirm() {
        ItemNode cur = head;
        double price = 0;
        while (cur != null) {
            price += (cur.price * cur.qun);
        }
        System.out.println(price);
        head = tail = null;

    }

}
