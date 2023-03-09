package datastructures;

import java.util.*;

public class MainLinkedListMol {

    int size = 0;
    StoreNode head;
    StoreNode tail;
    ShoppingCartList cart;

    public MainLinkedListMol() {
    }

    public void Add(int StoreNumber, ItemNode it) {

        StoreNode cur = head;
        for (int i = 1; i < StoreNumber; i++) {
            cur = cur.next;
        }
        it.storeNum = StoreNumber;
        StoreLinkedList store = cur.store;
        if (store.head == null) {
            store.head = it;
            store.tail = null;

        } else {
            ItemNode hd = store.head;
            ItemNode pre = null;
            while (hd != null) {

                if (hd.id == it.id) {
                    hd.qun += it.qun;
                    break;
                } else if (hd.compare(it) > 0) {

                    if (pre == null) {
                        it.next = store.head;
                        store.head = it;

                    } else {
                        pre.next = it;
                        it.next = hd;

                    }
                    store.size++;
                    break;

                }
                pre = hd;
                hd = hd.next;

            }
            if (hd == null) {
                store.tail.next = it;
                store.tail = it;
                store.tail.next = null;
                store.size++;
            }

        }

    }

    public void SearchItem(String name, String id) { // mol
        StoreNode cur = head;
        int f = 1;
        while (cur != null) {

            StoreLinkedList store = cur.store;
            ItemNode hd = store.head;

            while (hd != null) {

                if (hd.name.equals(name) && hd.id.equals(id)) {
                    System.out.println(hd.id + "  " + hd.qun);
                    f = 0;
                    break;

                }
                if (f == 0) {
                    break;
                }
                hd = hd.next;

            }

            cur = cur.next;

        }

    }

}
