package datastructures;

public class MyStack< T> {

    Node top;
    T val;
    int high;

    public MyStack(T val) {
        Node node = new Node(val);
        top = node;
        high = 1;
    }

    public T getTop() {
        return (T) (top.value);

    }

    public void Push(T val) {

        Node p = new Node(val);

        if (high == 0) {
            top = p;

        } else {
            p.next = top;
            top = p;

        }
        high++;

    }

    public boolean IsEmpty() {

        return (high >= 1);

    }
    public T  pop() {
        T res;
        if(high == 0  )
        {
           res = null ;
        }
        else {
            res = (T)top.value ; 
            top = top.next ;
            high -- ;
            
        }
        return res;
        
    }

    public int Gethight() {
        return high;
    }

    public void Print() {
        Node cur = top;
        while (cur != null) {
            System.out.print(cur.value + " ");
            cur = cur.next;
        }
        System.out.println("");

    }

}
