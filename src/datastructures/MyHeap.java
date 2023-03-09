package datastructures;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class MyHeap {

    static int heapSize = 0;

    public static void main(String[] args) {

        
        int a[] = {2,5,6,1};
       // System.out.println(Arrays.toString(a));
       // System.out.println(Arrays.toString(MergeSort(a)));

//        PriorityQueue< Integer> q = new PriorityQueue<>(Collections.reverseOrder());
//        Collections.reverseOrder();
//        q.add(1);
//        q.add(12);
//        q.add(4);
//        q.add(123);
//        q.add(0);
        //   System.out.println(q.peek());
//        while (!q.isEmpty()) {
//            System.out.println(q.poll());
//        }
        //  int a[] = {10, 20, 15, 7, 19, 30};
        //  System.out.println(Arrays.toString(a));
        //  buildHeap(a);
        //  System.out.println(Arrays.toString(a));
        //  HeapSort(a);
        //   System.out.println(Arrays.toString(a));
    }

  

    

    public static void buildHeap(int a[]) {
        int lastPar = a.length / 2 - 1;
        heapSize = a.length - 1;
        for (int i = lastPar; i >= 0; i--) {
            hepify(a, i);
        }
    }

    private static void hepify(int[] a, int par) {
        int left = par * 2 + 1;
        int right = par * 2 + 2;
        int mx = par;
        if (left <= heapSize && a[left] > a[par]) {
            mx = left;
        }
        if (right <= heapSize && a[right] > a[mx]) {
            mx = right;
        }
        if (mx != par) {
            swap(mx, par, a);
            hepify(a, mx);
        }

    }

    public static void HeapSort(int a[]) {
        for (int i = heapSize; i > 0; i--) {
            swap(0, i, a);
            heapSize--;
            hepify(a, 0);
            System.out.println(Arrays.toString(a));
        }
    }

    private static void swap(int i, int j, int[] a) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
