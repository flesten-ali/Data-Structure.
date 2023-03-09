package datastructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyDoublyLinkedList< T> {

    Node head;
    Node tail;
    int size;

    public void addFirst(T value) { // o(1)
        Node< T> temp = new Node< T>(value);
        if (head == null || size == 0 || tail == null) {
            head = tail = temp;
            //head.next = null; //  head.prev = null
        } else {
            temp.next = head;
            head.prev = temp;
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
            temp.prev = tail;
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
            temp.prev = pre;
            pre.next.prev = temp;
            pre.next = temp;

            size++;

        }

    }
    public boolean search(T val )  {
        Node temp = head; 
        while(temp!=null){
            if(temp.value == val){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    public void update(T val1 , T val2) {
           Node temp = head; 
        while(temp!=null){
            if(temp.value == val1){
                temp.value = val2;
            }
            temp = temp.next;
        }
    }
    public void print(){
        Node temp = head; 
      ArrayList < Integer> list  = new ArrayList<>() ;  
        while(temp!=null){
           list.add((Integer)temp.value);
            temp = temp.next;
        }
        Collections.sort(list);
        for(int i = 0 ;  i  < list.size() ; i++){
            System.out.print("");
        }
       // System.out.println(list.toString());
    }
    
    public void Reverse() {
 
     Node cur = head; 
     Node temp = null;   // Swap beween next &  prev 
      while(cur != null ) {
           temp = cur.next ; 
          cur.next = cur.prev ;
          cur.prev  = temp ;
          cur = cur.prev;
      }
     
      Node tempp = head;
      head = tail;
      tail = tempp;
      

    }
    public T mid(){
        T res; 
        
       if(size == 0 )res = null;
       else if(size == 1)res = (T  ) head.value;
       else {
           Node fast = head ; 
           Node slow  = head; 
           
           while(fast != null && fast.next!=null ){
               fast = fast.next.next;
               slow = slow.next;
           }
           res  = (T ) slow.value;
           
       }
       return res;
        
        
        
    }
     public T  removeFirst(){ // o(1)
        
        T res ; 
        System.out.println(tail.getClass().getName());
       if(size == 0  ){
           res = null;
       } 
       else { 
           res = (T) head.value;//////////////////////////////
           head = head.next; // null if size == 1
           size -- ;
           if(size == 0 ){
               tail = null;// head 
           }
          
       }
        
        return  res;
        
    }
       public T removeByIndex(int index ){ // o(n)
       
       T res;
       
       if(index < 0 || index >= size) res = null;
       else if(index == 0)return removeFirst();
       else if(index ==  size - 1) return removeLast();
       else {
           Node cur = head;
           Node pre = head;
           for(int  i = 0  ;   i  < index ; i ++ ){
              //  pre = cur ; 
               cur = cur.next;
           }
           pre = cur.prev;
           res = (T )cur.value;
           pre.next  = cur.next;
           cur.next = null;
           size -- ; 
       }
           return res;
       }
      public T removeLast(){ // o(n) ///// dif - > o(1)
        T res  ; 
       if(size == 0 ) res = null;
       else if(size == 1){
          return  removeFirst();
           
       }
       else{
           res =(T) tail.value;
           Node cur = tail.prev;
       
            tail = cur;
            tail.next = null;
            size -- ;
       }
        
        return res;
        
        
    }

      public void Rotatio(int r){
         r%=size ;
      Node end = head; 
      Node newTail = head;
      while(end.next!=null){
          if(r > 0 ){
              r -- ;
              end  = end.next;
          }
          else {
              end = end.next ; 
              newTail = newTail.next;
          }
      }
      end.next = head;
      head.prev = end ;
      head = newTail.next  ;  
      tail = newTail;
      tail.next = null;
      
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
                currI = currI.next;
            }
            for (int i = 0; i < ind2; i++) {
                currJ = currJ.next;
            }
         preI = currI.prev;
          preJ=currJ.prev ; 
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
