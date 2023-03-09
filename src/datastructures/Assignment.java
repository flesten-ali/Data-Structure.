package datastructures;

import java.util.Date;
import java.util.Random;

public class Assignment {

    public static void main(String[] args) {
        System.out.print("BST: ");
        BST bst = new BST();
        Date d = new Date();
        long time1 = d.getTime();
        Random ran = new Random();
        for (int i = 1; i <= 5000; i++) {
            int n = ran.nextInt();
          
            bst.add((int) (n));
        }
        Date dd = new Date();
        long time2 = dd.getTime();
        System.out.print(time2 - time1 + "ms  ");
        // -------------------------------------------------
        d = new Date();
        time1 = d.getTime();
        for (int i = 1; i <= 5000; i++) {
            int n = ran.nextInt();
            bst.delete((int) n);
        }
        dd = new Date();
        time2 = dd.getTime();
        System.out.print(time2 - time1 + "ms  ");
        //-------------------------------------------------        
        for (int i = 1; i <= 5000; i++) {
            int n = ran.nextInt();
            bst.add((int) (n));
        }
        d = new Date();
        time1 = d.getTime();
        for (int i = 1; i <= 5000; i++) {
            int n = ran.nextInt();
            bst.search(n);
        }
        dd = new Date();
        time2 = dd.getTime();
        System.out.print(time2 - time1 + "ms  ");
        //-------------------------------------------------
        d = new Date();
        time1 = d.getTime();
        int k = 2;
        bst.Preorder();
        Random r2 = new Random();
        for (int i = 1; i <= 5000; i++) {
            int n = ran.nextInt();
            int m = r2.nextInt();
            bst.update(n, m);
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
            int n = ran.nextInt();

            l.addLast(n);
        }
        dd = new Date();
        time2 = dd.getTime();
        System.out.print(time2 - time1 + "ms  ");
        // -------------------------------------------------
        d = new Date();
        time1 = d.getTime();
        for (int i = 1; i <= 5000; i++) {
            int n = ran.nextInt();

            l.removeByIndex(n);
        }
        dd = new Date();
        time2 = dd.getTime();
        System.out.print(time2 - time1 + "ms  ");
        //-------------------------------------------------
        for (int i = 1; i <= 5000; i++) {
            int n = ran.nextInt();

            l.addLast(n);
        }
        d = new Date();
        time1 = d.getTime();
        for (int i = 1; i <= 5000; i++) {
            int n = ran.nextInt();

            l.search(n);
        }
        dd = new Date();
        time2 = dd.getTime();
        System.out.print(time2 - time1 + "ms  ");
        //-------------------------------------------------
        d = new Date();
        k = 2;
        time1 = d.getTime();
        for (int i = 1; i <= 5000; i++) {
            int n = ran.nextInt();
            int m = r2.nextInt();

            l.update(n, m);
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
            int n = ran.nextInt();
            int x = r2.nextInt();

            m.put(n, x);
        }
        dd = new Date();
        time2 = dd.getTime();
        System.out.print(time2 - time1 + "ms  ");
        // -------------------------------------------------
        d = new Date();
        time1 = d.getTime();
        for (int i = 1; i <= 5000; i++) {
            int n = ran.nextInt();

            m.remove(n);
        }
        dd = new Date();
        time2 = dd.getTime();
        System.out.print(time2 - time1 + "ms  ");
        //-------------------------------------------------
        k = 2;
        for (int i = 1; i <= 5000; i++) {
            int n = ran.nextInt();
            int x = r2.nextInt();

            m.put(n, x);
        }
        d = new Date();
        time1 = d.getTime();
        for (int i = 1; i <= 5000; i++) {
            int n = ran.nextInt();

            m.search(n);
        }
        dd = new Date();
        time2 = dd.getTime();
        System.out.print(time2 - time1 + "ms  ");
        //-------------------------------------------------
        d = new Date();
        k = 0;
        time1 = d.getTime();

        for (int i = 1; i <= 5000; i++) {
            int n = ran.nextInt();
            int x = r2.nextInt();

            m.update(n, x);
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
