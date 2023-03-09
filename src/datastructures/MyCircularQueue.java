package datastructures;

public class MyCircularQueue<T> {

    private int front = -1;
    private int rear = -1;
    private int size = 0;
    private int capacity = 0;
    private T arr[];

    public MyCircularQueue(int s) {
        this.capacity = s;
        arr = (T[]) new Object[capacity];
    }

    boolean isEmpty() {
        return (front == -1);
    }

    boolean isFull() {
        return (((rear + 1) % capacity) == front);
    }

    public void add(T val) {

        if (isEmpty()) {
            front = rear = 0;
            arr[front] = val;

        } else if (isFull()) {
            return;
        } else {
            rear = (rear + 1) % capacity;
            arr[rear] = val;
        }
        size++;

    }

    public T remove() {
        T res;
        if (isEmpty()) {
            return null;
        } else {
            res = arr[front];
            front = (front + 1) % capacity;

            size--;
            if (size == 0) {
                front = rear = - 1;
            }
        }
        return res;
    }

    public void PrintCircylar() {
        int cur = front;
        String str = "";
        while (cur < rear) {
            str += arr[cur] + " ";
            cur = (cur + 1) % capacity;
        }
        str += arr[cur] + "";

        System.out.println(str);

    }

}
