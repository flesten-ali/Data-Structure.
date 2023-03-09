package datastructures;

import static java.lang.Integer.max;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class BST< T> {

    NodeTree root;
    int size = 0;
    int i = 0;
    
    public void add(T val) {

        if (root == null) {
            root = new NodeTree(val);
        } else {
            add(root, val);
        }
        

    }
     public NodeTree add(NodeTree root, T val) {

        if (root == null) {
            root = new NodeTree(val);
            return root;
        }
        if (root.data.hashCode() > val.hashCode()) {
            root.left = add(root.left, val);
        } else if (root.data.hashCode() < val.hashCode()) {
            root.right = add(root.right, val);
        }

        return root;
    }

    public boolean search(T val) {
        return search(root, val);
    }
    public void PrintLeafs() {
        PrintLeafs(root);
    }

   
    int c = 0;

    public boolean search(NodeTree root, T val) {
        if (root == null) {
            return false;
        }
        if (root.data.hashCode() > val.hashCode()) {
            return search(root.left, val);
        } else if (root.data.hashCode() < val.hashCode()) {
            return search(root.right, val);
        } else {
            return true;
        }

    }

    public void PrintLevelBFS() {
        NodeTree temp = root;
        Queue< NodeTree> q = new LinkedList<>();
        q.add(temp);
        while (!q.isEmpty()) {
            NodeTree top = q.poll();
            System.out.print(top.data + " ");
            if (top.left != null) {
                q.add(top.left);
            }
            if (top.right != null) {
                q.add(top.right);
            }

        }

    }

    public void update(T val1, T val2) {

        if (root == null) {
            return;
        }
        if(search(val1) == true ){
        update(root, val1, val2);
        if (!BinarySearchTree(root, null, null)) {
            MakeItBinarySearchTree1(root);
        }
        }
        

    }

    public void update(NodeTree root, T val1, T val2) {
        if (root == null) {
            return;
        } else if (root.data.hashCode() > val1.hashCode()) {
            update(root.left, val1, val2);
        } else if (root.data.hashCode() < val1.hashCode()) {
            update(root.right, val1, val2);
        } else {
            root.data = val2;
            return;
        }
    }

    public void PrintLevelFromDownRight() {
        NodeTree temp = root;
        Stack< T> s = new Stack<>();
        Queue< NodeTree> q = new LinkedList<>();
        q.add(temp);
        while (!q.isEmpty()) {
            NodeTree top = q.poll();
            s.add((T) top.data);
            if (top.left != null) {
                q.add(top.left);
            }
            if (top.right != null) {
                q.add(top.right);
            }
            Vector< Integer> v = new Vector<>();
        }
        while (!s.empty()) {
            System.out.println(s.pop());
        }

    }

    public void PrintLevelFromDownLeft() {
        NodeTree temp = root;
        Stack< T> s = new Stack<>();
        Queue< NodeTree> q = new LinkedList<>();
        q.add(temp);
        while (!q.isEmpty()) {
            NodeTree top = q.poll();
            s.add((T) top.data);
            if (top.right != null) {
                q.add(top.right);
            }

            if (top.left != null) {
                q.add(top.left);
            }

        }
        while (!s.empty()) {
            System.out.println(s.pop());
        }

    }

    public void Inorder() {
        Inorder(root);
    }

    public void Inorder(NodeTree root) {

        if (root == null) {
            return;
        }

        Inorder(root.left);
        System.out.println(root.data);
        Inorder(root.right);

    }

    public void Preorder() {
        Preorder(root);
    }

    public void Preorder(NodeTree root) {

        if (root == null) {
            return;
        }
       // System.out.print(root.data + " ");
          System.out.print("");
        Preorder(root.left);
        Preorder(root.right);

    }

    public void Postorder(NodeTree root) {

        if (root == null) {
            return;
        }

        Postorder(root.left);
        Postorder(root.right);
        System.out.println(root.data);

    }

    public void InOrderStack() {
        NodeTree rt = root;
        Stack< NodeTree> s = new Stack<>();
        while (!s.isEmpty() || rt != null) {
            if (rt != null) {
                s.add(rt);
                rt = rt.left;

            } else {
                rt = s.pop();
                System.out.println(rt.data);
                rt = rt.right;

            }

        }

    }

    public void PreOrderStack() {
        NodeTree rt = root;
        Stack< NodeTree> s = new Stack<>();
        s.add(rt);
        while (!s.isEmpty()) {
            System.out.println(rt.data);
            NodeTree t = s.pop();
            if (t.right != null) {
                s.add(t.right);
            }
            if (t.left != null) {
                s.add(t.left);
            }

        }

    }

    public void PostOrderStack() {
        NodeTree rt = root;
        Stack< NodeTree> s1 = new Stack<>();
        Stack< NodeTree> s2 = new Stack<>();
        s1.add(rt);
        while (!s1.isEmpty()) {
            NodeTree t = s1.pop();
            s2.add(t);
            if (t.left != null) {
                s1.add(t.left);
            }
            if (t.right != null) {
                s1.add(t.right);
            }
        }
        while (!s2.isEmpty()) {
            System.out.println(s2.pop().data);
        }

    }

    public void MinNode() {
        NodeTree ans = MinNode(root);
        if (ans == null) {
            System.out.println("No Val");
        } else {
            System.out.println(ans.data);
        }
    }

    public NodeTree MinNode(NodeTree root) {
        if (root == null) {
            return root; // empty 
        }
        if (root.left == null) {
            return root;
        }
        return MinNode(root.left);

    }

    public void MaxNode() {
        NodeTree ans = MaxNode(root);
        if (ans == null) {
            System.out.println("No Val");
        } else { 
            System.out.println(ans.data);
        }
    }

    public NodeTree MaxNode(NodeTree root) {
        if (root == null || root.right == null) {
            return root; // empty 
        }
        return MinNode(root.right);

    }

    public NodeTree delete(T val) {
        return delete(root, val);

    }

    public NodeTree delete(NodeTree root, T val) {
        if (root == null) {
            return null;
        }
        if (root.data.hashCode() > val.hashCode()) {
            root.left = delete(root.left, val);
        } else if (root.data.hashCode() < val.hashCode()) {
            root.right = delete(root.right, val);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            } else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                root.data = MinNode(root.right).data;
                root.right = delete(root.right, (T) root.data);
            }

        }
        return root;

    }

    public void PrintLeafs(NodeTree root) {
        if (root == null) {
            return;
        } else if (root.left == null && root.right == null) {
            System.out.println(root.data);
            return;
        }
        PrintLeafs(root.left);
        PrintLeafs(root.right);

    }

    public int Maxheight() {
        return Maxheight(root);

    }

    public int Maxheight(NodeTree root) {
        if (root == null) {
            return -1;
        }
        return 1 + max(Maxheight(root.left), Maxheight(root.right));
    }

    private void MakeItBinarySearchTree1(NodeTree root) {
        ArrayList < Integer> a= new ArrayList<>() ;
        FillArr(a, root);
        i = 0;
        Collections.sort(a);
        updateTree1(root, a);

    }

    private void NumOfNodes(NodeTree root) {
        if (root == null) {
            return;
        }

       
        NumOfNodes(root.left); size++;
        NumOfNodes(root.right);

    }

    private void FillArr(ArrayList arr, NodeTree root) {
        if (root == null) {
            return;
        }
        FillArr(arr, root.left);
        arr.add((Integer)root.data);
        FillArr(arr, root.right);

    }

    public void updateTree1(NodeTree root, ArrayList arr) {
        if (root == null) {
            return;
        }
        updateTree1(root.left, arr);
        root.data = arr.get( i ++  );
        updateTree1(root.right, arr);
    }
    public NodeTree updateTree2(NodeTree root,  ArrayList arr   , int l , int r ){
        if(l > r ) return null ;  
        int mid = (l + r)  /  2 ;  
        root = new NodeTree(arr.get(mid))  ; 
        root.left = updateTree2(root  ,  arr  ,  l  ,   mid  -  1 )  ; 
        root.right = updateTree2(root , arr  ,   mid  +  1 ,   r) ;  
        return root ;
    }

    private boolean BinarySearchTree(NodeTree root, NodeTree mx, NodeTree mn) {
        if (root == null) {
            return true;
        }
        if (mx != null && root.data.hashCode() >= mx.data.hashCode()) {
            return false;
        }
        if (mn != null && root.data.hashCode() <= mn.data.hashCode()) {
            return false;
        }
        return BinarySearchTree(root.left, root, mn) && BinarySearchTree(root.right, mx, root);

    }
}
