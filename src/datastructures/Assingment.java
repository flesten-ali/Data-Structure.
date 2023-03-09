package datastructures;

import java.util.Date;

public class Assingment {

    public static void main(String[] args) {
        System.out.print("BST: ");
        BST bst = new BST();
        Date d = new Date();
        long time1 = d.getTime();
        for (int i = 1; i <= 5000; i++) {
            bst.add(i);
        }
        Date dd = new Date();
        long time2 = dd.getTime();
        System.out.print(time2 - time1 + "ms  ");
        // -------------------------------------------------
        d = new Date();
        time1 = d.getTime();
        for (int i = 1; i <= 5000; i++) {
            bst.delete(i);
        }
        dd = new Date();
        time2 = dd.getTime();
        System.out.print(time2 - time1 + "ms  ");
        //-------------------------------------------------
        for (int i = 1; i <= 5000; i++) {
            bst.add(i);
        }
        d = new Date();
        time1 = d.getTime();
        for (int i = 1; i <= 5000; i++) {
            bst.search(i);
        }
        dd = new Date();
        time2 = dd.getTime();
        System.out.print(time2 - time1 + "ms  ");
        //-------------------------------------------------
        d = new Date();
        time1 = d.getTime();
        int k = 2;
        for (int i = 1; i <= 5000; i++) {
            bst.update(i, k++);
        }
        dd = new Date();
        time2 = dd.getTime();
        System.out.print(time2 - time1 + "ms  ");
        //-------------------------------------------------

        d = new Date();
        time1 = d.getTime();
        bst.Preorder();
        dd = new Date();
        time2 = dd.getTime();
        System.out.print(time2 - time1 + "ms  ");
        System.out.println("");
        //-------------------------------------------------
        //-------------------------------------------------
        //-------------------------------------------------
        System.out.print("DLL: ");

        MyDoublyLinkedList l = new MyDoublyLinkedList();
        d = new Date();
        time1 = d.getTime();
        for (int i = 1; i <= 5000; i++) {
            l.addLast(i);
        }
        dd = new Date();
        time2 = dd.getTime();
        System.out.print(time2 - time1 + "ms  ");
        // -------------------------------------------------
        d = new Date();
        time1 = d.getTime();
        for (int i = 1; i <= 5000; i++) {
            l.removeByIndex(i);
        }
        dd = new Date();
        time2 = dd.getTime();
        System.out.print(time2 - time1 + "ms  ");
        //-------------------------------------------------
        for (int i = 1; i <= 5000; i++) {
            l.addLast(i);
        }
        d = new Date();
        time1 = d.getTime();
        for (int i = 1; i <= 5000; i++) {
            l.search(i);
        }
        dd = new Date();
        time2 = dd.getTime();
        System.out.print(time2 - time1 + "ms  ");
        //-------------------------------------------------
        d = new Date();
        k = 2;
        time1 = d.getTime();
        for (int i = 1; i <= 5000; i++) {
            l.update(i, k++);
        }
        dd = new Date();
        time2 = dd.getTime();
        System.out.print(time2 - time1 + "ms  ");
        //-------------------------------------------------

        d = new Date();
        time1 = d.getTime();
        l.print();
        dd = new Date();
        time2 = dd.getTime();
        System.out.print(time2 - time1 + "ms  ");
        //-------------------------------------------------
        //-------------------------------------------------
        //-------------------------------------------------
        System.out.println("");
        System.out.print("Map: ");

        MyHashMap m = new MyHashMap();
        d = new Date();
        time1 = d.getTime();
        k = 2;
        for (int i = 1; i <= 5000; i++) {
            m.put(i, k++);
        }
        dd = new Date();
        time2 = dd.getTime();
        System.out.print(time2 - time1 + "ms  ");
        // -------------------------------------------------
        d = new Date();
        time1 = d.getTime();
        for (int i = 1; i <= 5000; i++) {
            m.remove(i);
        }
        dd = new Date();
        time2 = dd.getTime();
        System.out.print(time2 - time1 + "ms  ");
        //-------------------------------------------------
        k = 2;
        for (int i = 1; i <= 5000; i++) {
            m.put(i, k++);
        }
        d = new Date();
        time1 = d.getTime();
        for (int i = 1; i <= 5000; i++) {
            m.search(i);
        }
        dd = new Date();
        time2 = dd.getTime();
        System.out.print(time2 - time1 + "ms  ");
        //-------------------------------------------------
        d = new Date();
        k = 0;
        time1 = d.getTime();

        for (int i = 1; i <= 5000; i++) {
            m.update(i, k++);
        }
        dd = new Date();
        time2 = dd.getTime();
        System.out.print(time2 - time1 + "ms  ");
        //-------------------------------------------------

        d = new Date();
        time1 = d.getTime();
       m.pnt();
        dd = new Date();
        time2 = dd.getTime();
        System.out.print(time2 - time1 + "ms  ");

    }
}
