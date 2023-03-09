package datastructures;

public class NodeHash< K, V> {

    K key;
    V val;
    int hash;
    NodeHash< K, V> next;

    public NodeHash() {
    }

    public NodeHash(K key, V val, NodeHash<K, V> next) {
        this.key = key;
        this.val = val;
        this.next = next;
    }

    public NodeHash(K key, V val) {
        this.key = key;
        this.val = val;
    }
    public void setKey(K k ){
        this.key = k ; 
    }
    public void setVal(V v ){
        this.val = v; 
    }
    public K getKey(){
        return key; 
    }
    public V getVal(){
        return val; 
    }
    public void setNext(NodeHash < K, V > h){
        next = h ;
    }
    public NodeHash< K , V > getNext(){
        return next;
    }
    public void ToString(){
        System.out.println(key +" " + val);
    }
   
    

}
