/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures;

import static java.lang.Integer.max;
import java.util.*;
import java.util.Collections;
import static java.util.Collections.swap;
import java.util.concurrent.ArrayBlockingQueue;
import javax.xml.namespace.QName;

public class Questions {

    static int d = 0;

    void mxLev(NodeTree root) {
        while (root != null) {
            d++;
            root = root.left;
        }
        d--;
    }

    public static boolean isComplete(NodeTree root, int l, int r, int lev) {

        if (d - 1 == lev) {
            if ((root.left == null && root.right != null) || (root.left == null && root.right == null && l == 1 && r == 0)) {
                return false;
            } else {
                return true;
            }
        }

        if (root.right == null || root.left == null) {
            return false;
        }
        return isComplete(root.left, 1, 0, lev + 1) && isComplete(root.right, 0, 1, lev + 1);

    }

    static void MergeTwoSortedArray(ArrayList< Integer> a1, ArrayList<Integer> a2) {

        for (int i = 0; i < a1.size(); i++) {
            int ans = a1.get(i);

            for (int j = 0; j < a2.size(); j++) {
                if (a2.get(j) < ans) {
                    int k = a2.get(j);
                    int m = a1.get(i);
                    a2.remove(j);
                    a1.remove(i);
                    a1.add(i, k);
                    a1.add(i + 1, m);
                    i++;
                    j--;
                } else {
                    break;
                }
            }

        }
        for (int i = 0; i < a2.size(); i++) {
            a1.add(a2.get(i));
        }

    }

    public static void split(ArrayList< Integer> a) {

        ArrayList< Integer> a1 = new ArrayList< Integer>();
        ArrayList< Integer> a2 = new ArrayList< Integer>();
        ArrayList< Integer> a3 = new ArrayList< Integer>();
        //  negative odd // pois even  //  else 
        for (int i = 0; i < a.size(); i++) {

            if ((a.get(i) < 0) && (a.get(i) % 2 == 1)) {
                a1.add(a.get(i));
            } else if ((a.get(i) > 0) && (a.get(i) % 2 == 0)) {
                a2.add(a.get(i));
            } else {
                a3.add(a.get(i));
            }

        }

    }

    public static void split2(ArrayList< Integer> a) {

        swap(a, 0, 1);
        // int a[] =  new int [2];
        //a.length;
        //  negative odd // pois even  //  else 
        int p1 = 0, p2 = 0, p3 = 0, sz = a.size();
        for (int i = 0; i < sz; i++) {
            if ((a.get(i) < 0) && (a.get(i) % 2 == 1)) {
                a.add(a.get(i));
            }

        }

        for (int j = 0; j < sz; j++) {
            if ((a.get(j) > 0) && (a.get(j) % 2 == 0)) {
                a.add(a.get(j));
            }
        }

        for (int j = 0; j < sz; j++) {

            if (!((a.get(j) > 0) && (a.get(j) % 2 == 0)) && !((a.get(j) < 0) && (a.get(j) % 2 == 1))) {
                a.add(a.get(j));
            }
        }
        int l = sz;
        for (int i = 0; i < sz; i++) {
            a.remove(l - 1);
            l--;

        }

    }

    public static boolean IsSorted(ArrayList< Integer> a) {

        for (int i = 0; i < a.size() - 1; i++) {
            if (a.get(i) > a.get(i + 1)) {
                return false;
            }
        }
        return true;

    }

    public static ArrayList< Integer> Occurances(ArrayList< ArrayList< Integer>> a) {

        ArrayList< Integer> ans = new ArrayList<>();

        for (int i = 0; i < a.size(); i++) {

            // N  , V 
            int n = a.get(i).get(0);
            int v = a.get(i).get(1);
            for (int j = 0; j < n; j++) {
                ans.add(v);
            }

        }
        return ans;

    }

    public static ArrayList< Integer> twoNArray(ArrayList< Integer> a1) {

        ArrayList< Integer> ans = new ArrayList<>();

        int p1 = 0, p2 = a1.size() / 2; //  n 
        for (int i = 0; i < a1.size() / 2; i++) {
            ans.add(a1.get(p1));
            p1++;
            ans.add(a1.get(p2));
            p2++;
        }
        return ans;
    }

    public static void SmallerThan(ArrayList< Integer> a1) {

        int mx = Integer.MIN_VALUE;
        for (Integer it : a1) {
            mx = max(mx, it);
        }
        ArrayList< Integer> ans = new ArrayList< Integer>();
        ArrayList< Integer> b = a1;
        Collections.sort(a1);
        for (int i = 0; i <= mx; i++) {
            ans.add(0);
        }
        ans.set(a1.get(0), 0);
        for (int i = 1; i < a1.size(); i++) {
            if (a1.get(i) == a1.get(i - 1)) {
                continue;
            }
            if (ans.get(a1.get(i)) == 0) {
                ans.set(a1.get(i), i);

            }
        }
        for (int i = 0; i < b.size(); i++) {
            System.out.println(ans.get(b.get(i)));

        }

    }

    public static void KthElement(int k, ArrayList< Integer> a) {

        ArrayList< ArrayList<Integer>> ans = new ArrayList<>();
        int m = 0;
        int r = 0, c = 0;

        for (int i = 0; i < a.size(); i++) {

        }

    }

    public static < T> void ReverseQueue(Queue< T> q) {

        Stack< T> s = new Stack<>();
        while (!q.isEmpty()) {
            s.push(q.poll());
        }
        while (!s.empty()) {
            q.add(s.pop());
        }
        System.out.println(q);

    }

    public static < T> void ReverseByRecursionQueue(Queue< T> q) {
        // التعديل على المين يحصل
        if (q.isEmpty()) {
            return;
        }

        T x = q.poll();
        ReverseByRecursionQueue(q);
        q.add(x);

    }

    public static int findMINIndex(Queue<  Integer> q, int rang) {

        int minInd = Integer.MAX_VALUE;
        int minVal = Integer.MAX_VALUE;
        int sz = q.size();

        for (int i = 0; i < sz; i++) {
            int num = q.poll();
            if (num <= minVal && i <= rang) {
                minVal = num;
                minInd = i;
            }
            q.add(num);
        }
        return minInd;

    }

    public static void AddMinValToRear(Queue<  Integer> q, int minInd) {

        int minVal = Integer.MAX_VALUE;
        int sz = q.size();
        for (int i = 0; i < sz; i++) {
            int num = q.poll();
            if (i != minInd) {
                q.add(num);

            } else {
                minVal = num;

            }

        }
        q.add(minVal);

    }

    public static void SortQueue(Queue<  Integer> q) {
        for (int i = 0; i < q.size(); i++) {
            int mn = findMINIndex(q, q.size() - i - 1);
            AddMinValToRear(q, mn);
        }

    }

    public static void PrintBinaryFromOneToN(int n) {

        Queue< String> q = new ArrayBlockingQueue<>(3 * n);
        q.add("1");

        for (int i = 1; i <= n; i++) {
            String s = q.poll();
            System.out.println(s);
            q.add(s + "0");
            q.add(s + "1");
        }

    }

    public static void insertByIndex(Stack<  Integer> s, int ind, int val) {
        if (ind == s.size()) {
            s.push(val);
            return;

        }
        int top = s.pop();
        insertByIndex(s, ind, val);
        s.push(top);

    }

    public static void insertInSortedStack(Stack<  Integer> s, int val) {
        if (s.empty() || s.peek() <= val) {
            s.push(val);
            return;

        }
        int top = s.pop();
        insertInSortedStack(s, val);
        s.push(top);

    }

    public static void sortStackByRec(Stack<  Integer> s) {

        int top = s.pop();
        if (s.size() != 0) {
            sortStackByRec(s);
        }
        insertInSortedStack(s, top);

    }

    public static void RotateAfterM(int m, int k, Node head) {

        Node cur = head;
        int x = m;
        int sz = 0;
        Node tail = head;
        while (cur != null) {
            sz++;
            tail = cur;
            cur = cur.next;
        }
        k = k % sz;
        cur = head;
        m--;
        while (m > 0) {
            cur = cur.next;
            m--;
        }
        Node cur2 = cur;
        int t = sz - x - k + 1;
        while (t-- > 0) {
            cur2 = cur2.next;
        }
        System.out.println(cur.value);
        Node v = cur.next;
        tail.next = cur.next;
        cur.next = cur2;
        v.next = null;

        cur = head;
        while (cur != null) {
            System.out.print(cur.value + "  ");
            cur = cur.next;
        }

    }

    public static int printEven(int n, int i) {
        if (n <= 0) {
            return 1;
        }

        return i * printEven(n - 1, i + 2);

    }

    public static double SumN(int n, int i) {
        if (i == n + 1) {
            return 0;
        }

        return (double) (1.0 / i) + SumN(n, i + 1);

    }

    public static void main(String[] args) {
        System.out.println(SumN(2, 1));
        //System.out.println(printEven(4, 2));
//        Queue< Integer> q = new ArrayBlockingQueue<>(3);
//        Queue< Integer> ql = new LinkedList<>();
//        PrintBinaryFromOneToN(10);
//   
//        Node h = new Node(1);
//        Node head = h;
//        h.next = new Node(2);
//        h = h.next;
//        h.next = new Node(3);
//        h = h.next;
//        h.next = new Node(4);
//        h = h.next;
//        h.next = new Node(5);
//
//        RotateAfterM(2, 2, head);
//        Stack<Integer> s = new Stack<>();
//        s.push(1);
//        s.push(5);
//        s.push(4);
//        s.push(2);
//        sortStackByRec(s);
//        System.out.println(s);

//        q.ad.d(3);
//        q.add(2);
//        q.add(1);
//        System.out.println(q);
//        SortQueue(q);
//        System.out.println(q);
//        System.out.println(q);
//       ReverseByRecursionQueue(q);
//        System.out.println(q);
        //ReverseQueue(q);
//        ArrayList < ArrayList < Integer >  > a = new ArrayList < > ();
//        a.add(new ArrayList < Integer > ()) ;
//        a.get(a.size() -  1 ).add(1);
//          a.get(a.size() -  1 ).add(2);
//
//        
//        for(int  i = 0 ; i < a.size() ; i ++ ){
//            for(int j = 0  ;  j   < a.get(i).size() ; j ++ ){
//                System.out.print(a.get(i).get(j));
//            }System.out.println("");
//        }
        //  System.out.println(a.get(a.size()  - 1 ).add(1));
//        ArrayList< Integer> a1 = new ArrayList<>();
//        ArrayList< Integer> a2 = new ArrayList<>();
//        a1.add(2);
//        a1.add(6);
//        a1.add(9);
//        a2.add(4);
//        a2.add(5);
//        a2.add(20);
//        
//        MergeTwoSortedArray(a2, a1);
//
//        
        // n log(n) 
//[2,3,4,5], [6,7,10,20] -> []
//[1,7,10,20,20,30,40], [1,10,10,20,50] -> [1,10,20]
    }
}
