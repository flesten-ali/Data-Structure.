package datastructures;

public class NodeTree< T> {

    NodeTree left;
    NodeTree right;
    T data;
    int height;

    public NodeTree(T data) {
        this.data = data;
        this.height = 1;
    }
    
    

}
