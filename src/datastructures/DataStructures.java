package datastructures;

import com.sun.java.accessibility.util.TopLevelWindowListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class DataStructures {

        Stack < Integer > s = new Stack<>(); //  instance variable this

    
    public static void main(String[] args) throws FileNotFoundException {
        char a= ' ';
      
        ArrayList<String>s = new ArrayList<>();
        
        // Exeption Queue Full
//       Queue < String > s = new ArrayBlockingQueue<>(3);
//       s.add("P");
//        s.add("T");
//       s.add("U");
//       for(int  i = 0 ; i   < s.size() ;  i ++ ){
//           s.add("0");
//       }
//        System.out.println(s);

       
           Hashtable <  Integer , Integer  > m =  new Hashtable<>();
for(Integer i : m.values()){
    
}
              TreeSet   < Integer >  st = new TreeSet<>();
              st.add(3);
              st.add(1);
              System.out.println(st.first());
                 //  st.descendingIterator() just on tree setz

//       TreeSet   < Integer >  st = new TreeSet<>();
//        Hashtable <  Integer , Integer  > m =  new Hashtable<>();
//        m.co
//        //m.getOrDefault(m, Integer.MAX_VALUE)
//                //m.values()
////m.co
//                s.add(1);
//                m.keySet()
//        s.add(2);
//        s.add(3);
//        Iterator it = s.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }

        
        
//        File f = new File("fl.txt");
//        Scanner in = new Scanner(f);
////     while(in.hasNext()){
////         int a  = in.nextInt();
////          String s = in.next();
////         System.out.println(a +" " + s);
////     }
      //  HashMap<  Integer, ArrayList<String>> hm = new HashMap<>();
//
//        while (in.hasNext()) {
//            int a = in.nextInt();
//            String s = in.next();
//            if (!hm.containsKey(a)) {
//                ArrayList< String> r = new ArrayList<>();
//
//                r.add(s);
//                hm.put(a, r);
//            } else {
//                ArrayList< String> r = hm.get(a);
//                r.add(s);
//                hm.put(a, r);
//
//            }
//
//        }
//        System.out.println(hm);

        //  Set<  Integer> st1 = new HashSet<>();
        // Set<  Integer> st2 = new LinkedHashSet<>();
//        TreeSet<Student> st3 = new TreeSet<>(new SortStdByComprator());
//        st3.add(new Student("ali", 4, 2020));
//        st3.add(new Student("amer", 3, 2021));
//        st3.add(new Student("hashem", 2, 2022));
//        st3.add(new Student("flesten", 1, 2023));
//        Set <Integer > s  = new TreeSet<>();
//        Set<Integer> tr = new TreeSet<>();
//        tr.add(1);
//        tr.add(2);
//        tr.add(5);
//        tr.add(45);
//     //   s.addAll(tr ) ;
//        //System.out.println(s);
//        ArrayList < Integer>  a = new ArrayList<>();
//       Integer[]  b ={1 , 2 ,3 , 4 };
//
//        
//        Collections.addAll(tr, b);
//        System.out.println(tr);
        //  System.out.println(st3);
//        MyHashTable k = new MyHashTable();
//        k.add(1);
//        k.add(6);
//        k.add(2);
//        k.add(4);
//        k.add(9);
//        k.Remove(93);
//        k.print();
        //  System.out.println(h);
//        h.add(1);
//        h.add(null);
//        h.add(0);
//        h.add(null);
//        h.add(8);
//        h.add(2);
//        h.add(4);
//        h.add(4);
//       h.remove(4);
        //  Iterator it = h.iterator() ;
//       while(it.hasNext()){
//           System.out.println(it.next());
//       }
//        System.out.println(h);
// 
//        A a = new A("asd");
//        B b = new B("asd");
//        System.out.println(a.equals(b));
//
//        h.remove(2);
        // h.remove(2 , "Omar");
        // h.put(2, "Soso");
        // System.out.println(h.get(2));
//        MyCircularQueue < Integer > q= new MyCircularQueue<>(4);
//        q.add(1);
//        q.add(2);
//        q.add(3);
//        q.add(4);
//        q.remove();
//      q.PrintCircylar();
//      Stack  s = new Stack();
        //Queue<  Integer> ql = new LinkedList< Integer>();
//        ql.add(1);
//        ql.add(2);
//        ql.add(3);
//        System.out.println(ql.element());
//        ql.remove();
//        System.out.println(ql);
//        ql.remove();
//        ql.remove();
        // ql.remove();
//        //  ql.element();
//        q.offer(1);
//        q.offer(2);
//        q.add(3);
//        System.out.println(q);
        // q.poll();
        // q.poll();
        //q.poll();
        //System.out.println(q.peek());
        //System.out.println(q.poll());
//        int mx = Integer.MIN_VALUE;
//        while (!s1.empty()) //mx = Math.max(mx, s2.push(s1.pop()));
//        {
//            System.out.println(s2.push(s1.pop()));
//        }
//        //System.out.println(mx);
//
//        MyStack< Integer> s = new MyStack<>(1);
//        s.Push(1);
//        s.Push(2);
//        s.Push(3);
//        s.Push(4);
//        s.Print();
//        
//         ss.push(12);
//        st.push(1);
//        st.push(1);
//        st.push(2);
//        st.push(3);
//        st.push(4);
//        //st.add(0,12);
//        System.out.println(st.elementAt(0));
//        Iterator it  = st.iterator();
//          st.addAll(ss);
//        System.out.println(st.firstElement());
//        
        //  MyStack s = new MyStack(0);
//   s.Push(1);
//   s.Push(2);
//   s.Push(3);
//   s.Print();
//        System.out.println(s.pop());
//        s.Print();
//        s.Push(1099);
//        s.Print();
//        System.out.println( s.getTop());
//        MyQueue < Integer  >  q = new MyQueue <>(1);
//        q.InQueue(2);
//        q.InQueue(3);
//        q.Print();
//        System.out.println(q.DeQueue());
//        System.out.println(q.DeQueue());
//        System.out.println(q.DeQueue());
//        System.out.println(q.DeQueue());
//        q.Print();
//        String s ="ADs"; 
//        System.out.println(s.charAt(0));
//     
//        
//        MyLinkedList < Integer> a = new MyLinkedList< Integer>();
//        a.addLast(1);
//        a.addLast(2); //  3 1 
//        a.addLast(3);
//        a.addLast(4);
//        a.addLast(5);
//        a.Print();
//        a.SwapTwoNodes(0 , 3);
//        a.Print();
//        a.SwapTwoNodes(2, 0);
//        a.Print();
//        LinkedList < Integer > l  = new LinkedList <>();
//        l.add(1);
//        l.add(2);
//        l.add(3);
//          Iterator  it =    l.iterator() ; 
//          System.out.println(it.next());
//          while(it.hasNext()){
//           System.out.println(it.next());
//          }
        //a.Rotatio(2);
        //a.Print(a.head);
        //    System.out.println(a.DetectCylce2());
        // a.Print(a.head);
        // a.InsertInSorted(4);
        // a.InsertInSorted(0);
        //a.InsertInSorted(9);
        //a.Print(a.head);
        //  a.addFirst(15);
        // a.Print(a.head);
        // a.SplitLikdeLsit();
        //  a.Print(a.head);
        // a.Print(a.head2);
        //  a. addByIndex(0 , 99 );
        // a.Print();
        // a.removeFirst();
        // a.Print();
        //a.removeLast();
        // a.Print();
        // a.addByIndex(1, 8);
        //a.Print();
        //a.removeByIndex(1);
        // a.Print();
        //a.Print();
        // a.Reverse();
        //    a.Print();
        //System.out.println(a.head.value);
        // System.out.println(a.tail.value);
//        a.addLast(5);
//        a.addByIndex(1, 2); // 1 2 5
//        a.Reverse();
//        a.Print();
//        System.out.println(a.mid());
//        a.removeLast();
//        a.Print();
//        a.removeByIndex(1);
//        a.Print();
        //   System.out.println(a.head.value);
        // System.out.println(a.tail.value);
    }

}
