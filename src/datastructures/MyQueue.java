package datastructures;

public class MyQueue< T> {

    Node first;
    Node last;
    int len;

    public MyQueue(T val) {
        Node n = new Node(val);
        first = n;
        last = n;
        len++;
    }

    public T getFirst() {
        if (len == 0) {
            return null;
        }
        return (T) (first.value);
    }

    public T getLast() {
        if (len == 0) {
            return null;
        }

        return (T) (last.value);
    }

    public boolean IsEmpty() {
        return (len >= 1);
    }

    public int getLen() {
        return (len);
    }

    public void InQueue(T val) { //  end
        Node temp = new Node(val);
        if (len == 0) {
            last = first = temp;
        } else {

            last.next = temp;
            last = temp;

        }

        len++;

    }
       public T DeQueue() { //  first
       T res ;
        if (len == 0) {
           res  = null ;
        } else {
            res = (T) first.value ;
            first = first.next ;
            len -- ; 
            if(len == 0 )
             last = first;  // null 
        }

        return res; 

    }

    public void Print() {
        Node cur = first;
        while (cur != null) {
            System.out.print(cur.value + " ");
            cur = cur.next;
        }
        System.out.println();
    }

}
