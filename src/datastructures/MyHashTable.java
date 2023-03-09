package datastructures;

import java.util.Arrays;

public class MyHashTable {

    int size = 5;
    Node[] hm = new Node[5];

    public int HashFunction(int x) {
        return (x % size);
    }

    public void add(int x) {
        int ind = HashFunction(x);
        Node cur = new Node(x);
        if (hm[ind] == null) {
            hm[ind] = cur;
        } else {
            Node n = hm[ind];
            while (n.next != null) {
                Integer v = (Integer) (n.value);
                if (v.equals(x)) {
                    return;
                }
                n = n.next;
            }
            n.next = cur;

        }
    }

    public void Remove(int x) {
        int ind = HashFunction(x);
        if (hm[ind] == null) {
            return;
        } else {
            Node n = hm[ind];
            if ((Integer) (n.value) == x) {
                hm[ind] = hm[ind].next;
            } else {
                while (n.next != null && (Integer) n.next.value != x) {
                    n = n.next;
                }
                n.next = n.next.next;
            }

        }

    }

    public boolean get(int key) {  

        int ind = HashFunction(key) ; 
         Node cur  = hm[ind]; 
          while(cur != null )  
          {
              if((Integer)cur.value == key)return true;
              cur = cur.next ; 
          }
          return false;
    }
    
    
    
    public void print(){
        
        for(int i = 0 ; i  < size;i  ++ ){
            Node cur = hm[i];
            while(cur!=null){
                System.out.print(cur.value+" ");
                cur = cur.next;
            }System.out.println("");
        }
        
        
        
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final MyHashTable other = (MyHashTable) obj;
        if (this.size != other.size) {
            return false;
        }
        return Arrays.deepEquals(this.hm, other.hm);
    }

}
