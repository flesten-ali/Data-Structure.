
package datastructures;


public class BinaryTree {
    
    NodeTree root ; 

    public BinaryTree() {
    }

    public BinaryTree(int data) {
        root = new NodeTree(1);
    }
    
     public void postTreversal(NodeTree rt){
        if(rt == null )return ;
        
        postTreversal(rt.left);
        postTreversal(rt.right);
         System.out.print(rt.data+" ");
        

    }
      public void preTreversal(NodeTree rt){
        if(rt == null )return ;
        
        System.out.print(rt.data+" ");
        preTreversal(rt.left);
        preTreversal(rt.right);
         
        

    }
        public void InTreversal(NodeTree rt){
        if(rt == null )return ;
        
        InTreversal(rt.left);
           System.out.print(rt.data+" ");
        InTreversal(rt.right);
      
        

    }
    
    
}
