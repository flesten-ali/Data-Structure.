package datastructures;

public class Heap {

    int size = 0;
    int cap = 20;
    int a[] = new int[cap];

    public Heap() {
    }

    public int left(int i) { // الليفت للعنصر الي بانكس اي
        return (2 * i + 1);
    }

    public int right(int i) {
        return (2 * i + 2);
    }

    public int parent(int i) {
        return (i - 1) / 2;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(a[i]);
        }
    }

    public void insertKey(int k) {

        size++;
        int i = size - 1;
        a[i] = k;
        while (i != 0 && a[i] < a[parent(i)]) {// الصفر ملوش بيرنت
            swap(a, i, parent(i));
            i = parent(i);
        }
    }

    public int MinValue() {
        if (size == 0) {
            return Integer.MAX_VALUE;
        } else {
            return a[0];
        }
    }

    public void replace(int i, int val) {
        if (i < 0 || i > size) {
            return;
        }
        a[i] = val;
        while (i != 0 && a[i] < a[parent(i)]) {
            swap(a, i, parent(i));
            i = parent(i);
        }

    }

    public int deleteMin() { // deleteRoot
        int res = a[0];
        if (size == 0) {
            return Integer.MAX_VALUE;
        }
        if (size == 1) {
            size--;
            return res;
        }
        a[0] = a[size - 1];
        size--;
        MinHeapfity(0);//  يزبط الشكل 

        return res;

    }

    public int deleteKey(int i) {
        if (size == 0) {
            return Integer.MAX_VALUE;
        }
        int res = a[i];
        a[i] = Integer.MIN_VALUE;
        while (i != 0 && a[i] < a[parent(i)]) {
            swap(a, i, parent(i));
            i = parent(i);
        }
        deleteMin();
        return res;

    }

    private void swap(int[] a1, int i, int j) {
        int temp = a1[i];
        a1[i] = a1[j];
        a1[j] = temp;
    }

    private void MinHeapfity(int i) {
        int l = left(i);
        int r = right(i);
        int min = i;
        if (l < size && a[l] < a[i]) {
            min = l;
        }
        if (r < size && a[r] < a[min]) {
            min = r;
        }
        if (min != i) {
            swap(a, i, min);
            MinHeapfity(min);
        }

    }

}
