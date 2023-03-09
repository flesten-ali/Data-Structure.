package datastructures;

import java.util.*;
import javax.swing.plaf.RootPaneUI;

public class TreeClass {

//    static int d = 0;
//    static int f = 1;
//    static int vis[] = new int[30];
//    static int levl[] = new int[30];
//
//    static void DFS(NodeTree root, int node, int par) {
//
//        vis[node] = 1;
//        levl[node] = levl[par] + 1;
//        if (root.left != null) {
//            DFS(root.left, root.left.data, root.data);
//        }
//        if (root.right != null) {
//            DFS(root.right, root.right.data, root.data);
//        }
//
//    }
//
//    static void mxLev(NodeTree root) {
//        DFS(root, 1, 0);
//        for (int i = 0; i < levl.length; i++) {
//            d = Math.max(d, levl[i]);
//        }
//        d--;
//
//    }
//    public static boolean isComplete(NodeTree root, int l, int r, int lev) {
//
//        if (d == lev) {
//            if ((f == 0 && r == 1) || (root.left == null && root.right != null) || (root.left == null && root.right == null && l == 1)) {
//                return false;
//            } else {
//                if (root.right == null) {
//                    f = 0;
//
//                }
//                return true;
//            }
//        }
//
//        if (root.right == null || root.left == null) {
//            return false;
//        }
//        return isComplete(root.left, 1, 0, lev + 1) && isComplete(root.right, 0, 1, lev + 1);
//
//    }
//
//    public static void PrintParent(Vector<Vector<Integer>> adj, int par, int node) {
//        if (par == 0) {
//            System.out.println("Root = " + node);
//        } else {
//            System.out.println(par + " par of " + node);
//        }
//        for (int i = 0; i < adj.get(node).size(); i++) {
//            if (par != adj.get(node).get(i)) {
//                PrintParent(adj, node, adj.get(node).get(i));
//            }
//        }
//
//    }
//
//    public static void printChildrenLevelBFS(Vector<Vector<Integer>> adj, int root) {
//
//        Queue< Integer> q = new LinkedList<>();
//        q.add(root);
//        int vis[] = new int[adj.size()];
//        Arrays.fill(vis, 0);
//
//        while (!q.isEmpty()) {
//            int top = q.poll();
//            vis[top] = 1;
//            System.out.println(top + " childern are ");
//            for (int i = 0; i < adj.get(top).size(); i++) {
//                if (vis[adj.get(top).get(i)] == 0) {
//                    System.out.print(adj.get(top).get(i) + " ");
//                    vis[adj.get(top).get(i)] = 1;
//                    q.add(adj.get(top).get(i));
//                }
//
//            }
//            System.out.println("");
//        }
//
//    }
//
//    public static void printLeaves(Vector< Vector<Integer>> adj, int root) {
//        for (int i = 1; i < adj.size(); i++) {
//            if (i != root && adj.get(i).size() == 1) {
//                System.out.print(i + " ");
//            }
//
//        }
//        System.out.println("");
//    }
//
//    private static void printDegrees(Vector<Vector<Integer>> adj, int root) {
//        for (int i = 1; i < adj.size(); i++) {
//            if (i == root) {
//                System.out.println(i + " " + adj.get(i).size());
//            } else {
//                System.out.println(i + " " + (adj.get(i).size() - 1));
//            }
//
//        }
//
//    }
    public static void main(String[] args) {

        MyHashMap< String, Integer> h = new MyHashMap<>();
        h.put("B", 2);
        h.put("A", 121);
        h.put("C", 3);
        h.pnt();
        System.out.println("");
        h.print();

//        MyDoublyLinkedList m = new MyDoublyLinkedList();
//        m.addFirst(1);
//        m.addFirst(2);
//        m.addFirst(3);
//        m.update(3, 300);
//         m.print();
//        AVLTree tree = new AVLTree();
//
//        tree.root = tree.insert(tree.root, 10);
//        tree.root = tree.insert(tree.root, 20);
//        tree.root = tree.insert(tree.root, 30);
//        tree.root = tree.insert(tree.root, 40);
//        tree.root = tree.insert(tree.root, 50);
//        tree.root = tree.insert(tree.root, 25);
//        tree.Preorder(tree.root);
//        BST< Integer> b = new BST<>();
//        b.add(11);
//        b.add(6);
//        b.add(19);
//        b.add(8);
//        b.add(18);
//        b.add(25);
//        b.Preorder();
//        b.update(11, 300);
//        b.Preorder();
        // System.out.println(b.Maxheight());
        //  b.PrintLevelBFS();
        // System.out.println("-----------------");
        // b.delete(6); // 1 child
        //  b.delete(11); // 2 child
        //        b.delete(18); // 0 child
        // b.PrintLevelBFS();
        // b.PrintLeafs();
        // b.MinNode();
        // b.MaxNode();
//        Heap h = new Heap();
//        h.insertKey(3);
//        h.insertKey(2);
//    //    h.deleteKey(1);
//        h.insertKey(15);
//        h.insertKey(5);
//        h.insertKey(4);
//        h.insertKey(45);
//        h.insertKey(1);
//        h.print();
        //    h.print();
        // System.out.println(h.MinValue());
        //  h.deleteMin();
        // System.out.println(h.MinValue());
        // h.print();
        // h.replace(2, 1);
        //  System.out.println(h.MinValue());
        // h.print();
        // System.out.println(h.MinValue());
        /// h.replace(2, 1);
        //System.out.println(h.MinValue());
//        BST b = new BST();
//
//        b.add(2);
//        b.add(3);
//        b.add(1);
        //b.PrintLevelBFS();
        //      b.PrintLevelFromDownRight();
        //b.Inorder(b.root);
        // b.InOrderStack();
        //  b.PostOrderStack();
        // b.Postorder(b.root);
        //    b.PreOrderStack();
//        BinaryTree tree = new BinaryTree();
//
//        // Le us create tree in the last diagram above
//        tree.root = new NodeTree(1);
//        tree.root.right = new NodeTree(2);
//        System.out.println(d);
//        //tree.root.right.right = new NodeTree(6);
//        mxLev(tree.root);
//        System.out.println(isComplete(tree.root, 0, 0, 1));
//        int n = 8;
//        Vector< Vector<Integer>> adj = new Vector< Vector<Integer>>();
//        for (int i = 0; i <= 7; i++) {
//            adj.add(new Vector<Integer>());
//        }
//        adj.get(1).add(2);
//        adj.get(2).add(1);
//
//        adj.get(1).add(3);
//        adj.get(3).add(1);
//
//        adj.get(1).add(4);
//        adj.get(4).add(1);
//
//        adj.get(2).add(5);
//        adj.get(5).add(2);
//
//        adj.get(2).add(6);
//        adj.get(6).add(2);
//
//        adj.get(4).add(7);
//        adj.get(7).add(4);
//
//        PrintParent(adj, 0, 1);
//        printChildrenLevelBFS(adj, 1);
//        printLeaves(adj, 1);
//        printDegrees(adj, 1);
    }

}
