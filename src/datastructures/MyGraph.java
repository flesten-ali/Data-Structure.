package datastructures;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MyGraph {

    int size = 0;
    int matrix[][];
    Vertix vList[];
    int i = 0;

    public MyGraph(int size) {
        this.size = size;
        matrix = new int[size][size];
        vList = new Vertix[size];
    }

    public void addVertix(String u) {
        vList[i++] = new Vertix(u);
    }

    public void addUndirected(int u, int v) {
        matrix[u][v] = 1;
        matrix[v][u] = 1;
    }

    public void addDirected(int u, int v) {
        matrix[u][v] = 1;
    }

    public void addUndirectedWighted(int u, int v, int w) {
        matrix[u][v] = w;
        matrix[v][u] = w;
    }

    public void addDirectedWighted(int u, int v, int w) {
        matrix[u][v] = w;
    }

    public void BFS() {
        BFS(0);

    }
    public void DFS(){
        DFS(0); 
        
    }
    public void DFSRE(){
        DFSRE(0) ;
    }
    public void DFSRE(int v )  {
        vList[v].SetVis(true);
        System.out.println(vList[v].label);
        for(int  i =  0 ; i   < size ; i ++ ){
            if(matrix[v][i] > 0 && vList[i].isVis() == false){
                DFSRE(i) ;
            }
        }
    } 
    public void DFS(int v)  { 
        Stack<Integer> s = new Stack<>()   ;
        s.add(v); 
        vList[v].SetVis(true); 
        System.out.println(vList[v].label);
         //pvp
        while(!s.empty()){
            v = s.peek() ;
            int child = getChild(v) ;
            if(child == -1) {
                s.pop();
            }
            else {
            s.push(child); 
            vList[child].SetVis(true);
            System.out.println(vList[child].label);    
            }
              
        }
         
    }
    public int getChild(int par ) {
        for(int  i = 0 ;  i < size;  i ++ ){
                if(matrix[par][i] > 0 && vList[i].isVis() == false){
                    return i ;
                }
            }
        return -1;
    }
    public void BFS(int v) {

        Queue<  Integer> q = new LinkedList<>();
        q.add(v);
        vList[v].SetVis(true);
        while (!q.isEmpty()) {
            int top = q.poll();
            System.out.println(vList[top].label);

            for (int i = 0; i < size; i++) {
                if (matrix[top][i] > 0 && vList[i].isVis() == false) {
                    vList[i].SetVis(true);
                    q.add(i);
                }
            }

        }

    }
   public void printMarix(){
       System.out.print("  ");
       for(int  i = 0  ; i  < vList.length;  i ++ ){
           System.out.print(vList[i].label+" ");
       }
       System.out.println("");
       
       for(int  i = 0 ; i  < size ; i ++ ){
          System.out.print(vList[i].label+" ");
           for(int  j  = 0 ;  j  < size ;  j ++ ){
               System.out.print(matrix[i][j]+" ");
           }
           System.out.println("");
       }
   }
}


