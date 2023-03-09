package datastructures;
public class StoreLinkedList {
    int size = 0;
    ItemNode head;
    ItemNode tail;

    public StoreLinkedList() {
    }

    public boolean AddItem(ItemNode it) {

        ItemNode cur = head;
        if (head == null) {
            head = it;
            tail = null;

        } else {
            ItemNode hd = head;
            ItemNode pre = null;
            while (hd != null) {
                if (hd.id == it.id) {
                    hd.qun++;
                    return true;
                }
                if (hd.compare(it) > 0) {
                    if (pre == null) {
                        it.next = head;
                        head = it;

                    } else {
                        pre.next = it;
                        it.next = hd;

                    }
                    it.qun++;
                    size++;
                    break;

                }
                pre = hd;
                hd = hd.next;

            }
            if (hd == null) {
                tail.next = it;
                tail = it;
                tail.next = null;
                it.qun++;
                size++;
            }

        }
        return false;

    }

    public boolean deletItem(String id) {
        ItemNode hd = head;
        ItemNode pre = head;

        int f = 0;
        while (hd != null) {
            pre = hd;
            if (!hd.id.equals(id)) {
                hd = hd.next;
            } else {
                hd.qun--;
                if (hd.qun == 0) {
                    size--;
                    pre.next = hd.next;
                    hd.next = null;
                }
                return true;
            }

        }
        return false;

    }

}
