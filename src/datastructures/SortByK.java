
package datastructures;

import java.util.Comparator;

public class SortByK extends NodeHash implements Comparator < NodeHash > {

    @Override
    public int compare(NodeHash o1, NodeHash o2) {
        return o1.key.hashCode() - o2.key.hashCode() ; 
    }

   
    
}
