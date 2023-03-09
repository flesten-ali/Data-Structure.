

package datastructures;

public class Vertix {
    boolean vis ;  
    String label;  

    public Vertix(String label) {
        this.label = label;
    }

    public Vertix(boolean vis, String label) {
        this.vis = vis;
        this.label = label;
    }
public void SetVis(boolean v){
    vis  = v ; 
}
  
    public boolean isVis(){
        return vis ; 
    }
    
    
}
