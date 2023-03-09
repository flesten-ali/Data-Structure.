/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Sorts {

    public static int[] Merge(int[] left, int[] right) {
        int res[] = new int[left.length + right.length];
        int l = 0, r = 0, i = 0;
        while (l < left.length && r < right.length) {
            if (left[l] <= right[r]) {
                res[i++] = left[l++];
            } else {
                res[i++] = right[r++];
            }
        }
        while (l < left.length) {
            res[i++] = left[l++];

        }
        while (r < right.length) {
            res[i++] = right[r++];

        }
        return res;

    }

    public static int[] MergeSort(int a[]) {

        if (a.length > 1) {
            int l = 0;
            int r = a.length - 1;
            int mid = (l + r) / 2;
            //System.out.println(Arrays.toString(a));
            int[] left = Arrays.copyOf(a, mid + 1);
            int[] right = Arrays.copyOfRange(a, mid + 1, a.length);

            left = MergeSort(left);
            right = MergeSort(right);
            return Merge(left, right);
        }
        System.out.println(Arrays.toString(a));
        return a;
    }

    public static void QuickSortAtLast(int a[], int l, int r) {

        if (l < r) {
            int indPivot = PartionLast(a, l, r);

            QuickSortAtLast(a, l, indPivot - 1);
            QuickSortAtLast(a, indPivot + 1, r);
        }

    }

    public static void QuickSortAtFirst(int a[], int l, int r) {

        if (l < r) {
            int indPivot = PartionFirst(a, l, r);
            QuickSortAtFirst(a, l, indPivot - 1);
            QuickSortAtFirst(a, indPivot + 1, r);
        }

    }

    public static void QuickSortAtMid(int a[], int l, int r) {

        if (l < r) {
            int indPivot = PartionMid(a, l, r);
            QuickSortAtMid(a, l, indPivot - 1);
            QuickSortAtMid(a, indPivot + 1, r);
        }

    }

    public static int PartionMid(int a[], int l, int r) {

        int mid = (l + r) / 2;
        int pivot = a[mid];
          System.out.println(pivot);
        // System.out.println(Arrays.toString(a));

        while (l < r) {

            while (a[l] < pivot) {
                l++;
            }
            while (a[r] > pivot) {
                r--;
            }
            if (l < r) {
                swap(a, l, r);

            }
            if (l != r && a[l] == a[r] && a[l] == pivot) {
                l++;
            }

        }
        System.out.println(Arrays.toString(a));

        return l;

    }

    public static int PartionFirst(int a[], int l, int r) {

        int pivot = a[l];
        System.out.println(pivot);
        //System.out.println(pivot);
        // System.out.println(Arrays.toString(a));

        while (l < r) {

            if (a[l] < pivot) {
                l++;
            }
            if (a[r] > pivot) {
                r--;
            }
            if (l < r) {
                swap(a, l, r);
            }
            if (l != r && a[l] == a[r] && a[l] == pivot) {
                l++;
            }

        }

        return l;

    }

    public static void QuickSortAtLastIterative(int a[], int l, int r) {

        Stack< Integer> s = new Stack<>();
        s.push(r);
        s.push(l);
        while (!s.empty()) {
            l = s.pop();
            r = s.pop();
            int pInd = PartionLast(a, l, r);
            if (pInd - 1 > l) {
                s.push(pInd - 1);
                s.push(l);
            }
            if (pInd + 1 < r) {

                s.push(r);
                s.push(pInd + 1);
            }
        }

    }

    public static int PartionLast(int a[], int l, int r) {
        int pivot = a[r];
                 System.out.println(pivot);

        while(l  < r)  {
            if(a[l] < pivot ) l ++ ; 
            if(a[r] >  pivot) r --  ;  
            if( l  < r)  {
                swap(a, l, r)  ; 
            }
             if (l != r && a[l] == a[r] && a[l] == pivot) {
                l++;
            }
            
        }
        
        return l;

    }

    public static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
 
    public static void fun(int t){
        if(t > 0 ){
            fun(t -1 ) ;  
            int x = 10  + t ;  
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
 
     ArrayList< String > l = new ArrayList<>() ; 
     l.add("A") ;  
     l.add("B")  ;
     l.add("C") ;
     l.add("A")  ;
     for(int  i = l.size() ; i > 1 ; i -- ){
         l.add(i ,"*");
     }
        System.out.println(l);
        for(int  i =2 ; i  < l.size() ; i++  ){
            l.remove(i-1);
        }
        System.out.println(l);
       // int a[] = {10, 80, 30, 90, 40, 50, 70};

       // System.out.println(Arrays.toString(a));
       // QuickSortAtMid(a, 0, a.length - 1);
       // System.out.println(Arrays.toString(a));

    }
}
