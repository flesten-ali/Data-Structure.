package datastructures;

public class MyLinkedList< T> {

    Node head;
    Node tail;
    int size;

    public MyLinkedList() {
    }

    public void addFirst(T value) { // o(1)
        Node< T> temp = new Node< T>(value);
        if (head == null || size == 0 || tail == null) {
            head = tail = temp;
            //head.next = null;
        } else {
            temp.next = head;
            head = temp;

        }
        size++;

    }

    public void addLast(T value) { // o(1)
        Node< T> temp = new Node< T>(value);
        if (size == 0) {
            addFirst(value);
        } else {
            tail.next = temp;
            tail = temp;

        }
        size++;

    }

    public void addByIndex(int index, T value) { // o(n)
        if (index < 0 || index > size + 1) {
            try {
            } catch (Exception x) {
                System.out.println("Index out of Bound ");
            }
        } else if (index == 0) {
            addFirst(value);
        } else if (index == size + 1) {
            addLast(value);
        } else {
            Node< T> temp = new Node<T>(value);
            Node pre = head;
            for (int i = 0; i < index - 1; i++) {
                pre = pre.next;

            }
            temp.next = pre.next;
            pre.next = temp;
            size++;

        }

    }

    public T removeFirst() { // o(1)

        T res;
        System.out.println(tail.getClass().getName());
        if (size == 0) {
            res = null;
        } else {
            res = (T) head.value;//////////////////////////////
            head = head.next; // null if size == 1
            size--;
            if (size == 0) {
                tail = null;// head 
            }

        }

        return res;

    }

    public T removeLast() { // o(n)
        T res;
        if (size == 0) {
            res = null;
        } else if (size == 1) {
            return removeFirst();

        } else {
            res = (T) tail.value;
            Node cur = head;
            while (cur.next != tail) {
                cur = cur.next;
            }
            tail = cur;
            tail.next = null;
            size--;
        }

        return res;

    }

    public T removeByIndex(int index) { // o(n)

        T res;

        if (index < 0 || index >= size) {
            res = null;
        } else if (index == 0) {
            return removeFirst();
        } else if (index == size - 1) {
            return removeLast();
        } else {
            Node cur = head;
            Node pre = head;
            for (int i = 0; i < index; i++) {
                pre = cur;
                cur = cur.next;
            }
            res = (T) cur.value;
            pre.next = cur.next;
            cur.next = null;
            size--;

        }

        return res;

    }

    public void Reverse(Node n) {

        Node temp = n;
        //temp = head;
        // head = tail;
        // tail = temp;
        Node after = temp.next;
        Node befor = null;

        for (int i = 0; i < size; i++) {

            after = temp.next;
            temp.next = befor;
            befor = temp;
            temp = after;

        }

        Node cur = head;
        head = befor;
        tail = cur;

    }

    public void Rotatio(int r) {
        r %= size;
        Node end = head;
        Node newTail = head;
        while (end.next != null) {
            if (r > 0) {
                r--;
                end = end.next;
            } else {
                end = end.next;
                newTail = newTail.next;
            }
        }
        end.next = head;
        head = newTail.next;
        tail = newTail;
        tail.next = null;

    }

    public T DetectCylce1() {

        tail.next = head.next;
        Node cur = head;
        while (cur != null) {

            if (cur.vis == 1) {
                return (T) cur.value;
            }

            cur.vis = 1;
            cur = cur.next;

        }

        return null;

    }

    public T DetectCylce2() {
        tail.next = head.next;

        Node fast = head;
        Node slow = head;

        while (fast != null && slow != null && fast.next != null) {

            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                return (T) slow.value;
            }

        }

        return null;

    }

    public void SwapTwoNodes(int ind1, int ind2) {
        if (head == null || ind1 < 0 || ind1 > size || ind2 < 0 || ind2 > size || ind1 == ind2) {
            return;
        } else {
//            if(ind1 > ind2){
//                int t = ind1;
//                ind1 = ind2;
//                ind2 = t;
//            }
            Node currI = head;
            Node preI = null;
            Node currJ = head;
            Node preJ = null;
            for (int i = 0; i < ind1; i++) {
                preI = currI;
                currI = currI.next;
            }
            for (int i = 0; i < ind2; i++) {
                preJ = currJ;
                currJ = currJ.next;
            }

            if (preI == null) {
                head = currJ;
            } else {
                preI.next = currJ;
            }
            if (preJ == null) {
                head = currI;
            } else {
                preJ.next = currI;
            }

            Node temp = currI.next;
            currI.next = currJ.next;
            currJ.next = temp;

        }

    }

    public T getVal(int ind) {

        Node cur = head;
        for (int i = 0; i < ind; i++) {
            cur = cur.next;

        }
        return (T) (cur.value);

    }

    public Node getNode(int ind) {

        Node cur = head;
        for (int i = 0; i < ind; i++) {
            cur = cur.next;

        }
        return (cur);

    }

    public void set(int ind, int val) {

        Node cur = head;
        for (int i = 0; i < ind; i++) {
            cur = cur.next;

        }
        cur.value = val;

    }

    public void rotateLeft(int k) {

        k %= size;
        Node cur = head;
        if(k == 0 )return  ; 
        for (int i = 0; i < k - 1; i++) {

            cur = cur.next;

        }
        tail.next = head;
        tail = cur;
        head = tail.next;
        tail.next = null;

    }

    public void Print() { // o(n)
        String st = "";
        Node cur = head;

        while (cur != null) {
            st += cur.value + " ";
            cur = cur.next;
        }
        System.out.println(st);

    }

}
