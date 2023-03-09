package datastructures;

import java.util.Arrays;

public class MyHashSet< E> {

    E a[];
    int sz = 20;

    public MyHashSet() {
        a = (E[]) (new Object[sz]);
    }

    public void add(E e) {
        int ind = e.hashCode();
        a[ind] = e;

    }

    public boolean contain(E e) {
        int ind = e.hashCode();
        if (a[ind] != null) {
            return true;
        } else {
            return false;
        }

    }

    public void ReHashing() {
      E  arr []  = a;
      a = (E[])new Object[2 * sz ];
      for(int  i = 0 ;  i  < arr.length ; i ++ ){
     //     int x  = arr[i].hashCode() ; // ريهاش كمان مرة بالسايز االجديد
       //   a.add(x);
          
      }
      
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Arrays.deepHashCode(this.a);
        hash = 19 * hash + this.sz;
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
        final MyHashSet<?> other = (MyHashSet<?>) obj;
        if (this.sz != other.sz) {
            return false;
        }
        return Arrays.deepEquals(this.a, other.a);
    }

}
