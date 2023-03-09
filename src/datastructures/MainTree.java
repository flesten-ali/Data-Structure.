package datastructures;

public class MainTree {

    public static void main(String[] args) {

        BinaryTree b = new BinaryTree(1);
        b.root.left = new NodeTree(2);
        b.root.left.left = new NodeTree(4);
        b.root.left.right = new NodeTree(5);
        b.root.right = new NodeTree(3);
        b.root.right.left = new NodeTree(6);
        b.root.right.right = new NodeTree(7);
        b.InTreversal(b.root);
        System.out.println("");
        b.postTreversal(b.root);System.out.println("");
         b.preTreversal(b.root);System.out.println("");

    }
}
