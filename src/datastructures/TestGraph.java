package datastructures;

public class TestGraph {

    public static void main(String[] args) {
        MyGraph g = new MyGraph(4);

        g.addVertix("A");
        g.addVertix("B");
        g.addVertix("C");
        g.addVertix("D");

        g.addUndirected(0, 1);
        g.addUndirected(1, 2);
        g.addUndirected(2, 3);
        g.addUndirected(3, 0);
      // g.BFS();
      //g.DFS();
      g.DFSRE();
     //g.printMarix();
    }
}
