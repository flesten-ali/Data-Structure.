package datastructures;

import static java.lang.Math.abs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MyHashMap< K, V> {

    int size = 0;
    int cap = 16;
    NodeHash[] map;

    public MyHashMap() {
        map = new NodeHash[cap];

    }

    public MyHashMap(int capcity) {
        this.cap = capcity;
        map = new NodeHash[capcity];

    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.cap;
        hash = 29 * hash + Arrays.deepHashCode(this.map);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MyHashMap<?, ?> other = (MyHashMap<?, ?>) obj;
        if (this.cap != other.cap) {
            return false;
        }
        return Arrays.deepEquals(this.map, other.map);
    }

    public int hash(K k) {
        if (k == null) {
            return 0;
        }
        return abs(k.hashCode() % cap); //  عشان يضل ضمن الرينج 
    }

    public void put(K k, V v) {
        int ind = hash(k);
        NodeHash< K, V> n = new NodeHash<>(k, v);
        if (map[ind] == null) {
            map[ind] = n;
        } else {
            //   معناها دمشي عشان احطه ورا باول مكان فاضي او افحص ازا موجود قبل هاد الكي 
            // same hashcode for diff obj
            NodeHash pre = null;
            NodeHash cur = map[ind];
            while (cur != null) {

                if (cur.getKey().equals(k)) {
                    cur.setVal(v);
                    break;
                }
                pre = cur;
                cur = cur.next;

            }
            if (pre != null) {
                pre.setNext(n);
            }

        }
        size++;

    }

    public void update(K k, V v) {

        int ind = hash(k);
        map[ind].setVal(v);

    }

    public void pnt() {

        for (int i = 0; i < map.length; i++) {

            if (map[i] != null) {
                NodeHash cur = map[i];
                while (cur != null) {
                    System.out.print("");
                 //   System.out.println(cur.getKey() + " " + cur.getVal());
                    cur = cur.getNext();
                }
            }
        }

    }

    public void print() {

        ArrayList< NodeHash> a = new ArrayList<>();

        for (int i = 0; i < map.length; i++) {

            if (map[i] != null) {
                NodeHash cur = map[i];
                while (cur != null) {
                    a.add(cur);
                    cur = cur.getNext();
                }
            }
        }

        Collections.sort(a, new SortByK());
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i).getKey() + "  " + a.get(i).getVal());
        }
    }

    public void remove(K k) {
        int ind = hash(k);
        NodeHash pre = null;
        NodeHash cur = map[ind];
        while (cur != null) {
            if (cur.getKey().equals(k)) {
                if (pre == null) {
                    cur = cur.next;
                    map[ind] = cur;
                    size--;
                    return;
                } else {
                    pre.setNext(cur.getNext());
                    size--;
                    return;
                }
            }
            pre = cur;
            cur = cur.getNext();
        }

    }

    public V search(K k) { //  search

        int ind = hash(k);
        NodeHash cur = map[ind];
        if (cur == null) {
            return null;
        }
        return (V) cur.getVal();

    }

    public boolean isEmpty() {
        return (size == 0);
    }

}
