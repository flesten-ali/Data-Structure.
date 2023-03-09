package datastructures;

import static java.lang.Integer.max;

public class AVLTree {

    NodeTree root;

    public AVLTree() {
    }

    public int height() {
        return height(root);
    }

    public int height(NodeTree root) {
        if (root == null) {
            return -1;
        }
        return root.height;
    }

    public int getBalance(NodeTree root) {

        if (root == null) {
            return 0;
        }
        return height(root.left) - height(root.right);
    }



    public NodeTree RotateRight(NodeTree root) {
        NodeTree r = root.left;
        NodeTree rr = r.right;
        r.right = root;
        root.left = rr;
        root.height = 1 + max(height(root.left), height(root.right));
           r.height =    1 + max(height(r.left), height(r.right));
        return r;
    }

    public NodeTree insert(NodeTree root, int val) {
        if (root == null) {
            root = new NodeTree(val);
            return root;
        } else if (root.data.hashCode() > val) {
            root.left = insert(root.left, val);
        } else if (root.data.hashCode() < val) {
            root.right = insert(root.right, val);
        } else {
            return root;
        }

        root.height = 1 + max(height(root.left), height(root.right));

        int Bf = getBalance(root);
        if (Bf < -1 && val > root.right.data.hashCode()) {
            return RotateLeft(root);
        } else if (Bf > 1 && val < root.left.data.hashCode()) {
            return RotateRight(root);
        } else if (Bf > 1 && val > root.left.data.hashCode()) {
            root.left = RotateLeft(root.left);
            return RotateRight(root);
        } else if (Bf > 1 && val < root.right.data.hashCode()) {
            root.right = RotateRight(root.left);
            return RotateLeft(root);
        }
        return root;
    }
        public NodeTree RotateLeft(NodeTree root) {
        NodeTree l = root.right;
        NodeTree ll = l.left;
        l.left = root;
        root.right = ll;
        root.height = 1 + max(height(root.left), height(root.right));
        l.height = 1 + max(height(l.left), height(l.right));
        return l;
    }

    public void Preorder(NodeTree root) {

        if (root == null) {
            return;
        }
        System.out.println(root.data);
        Preorder(root.left);
        Preorder(root.right);

    }
}
