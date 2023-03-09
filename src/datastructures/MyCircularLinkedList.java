
package datastructures;


public class MyCircularLinkedList < T > {

     Node head; 
     Node tail; 
     Node head2;
     int size  = 0  ;
     
    public MyCircularLinkedList() {
    }
    public void SplitLikdeLsit(){
        
        
        Node fast  =  head, slow = head ,   pre = head; 
        do{
          fast = fast.next.next ; 
          pre = slow;
          slow  =  slow.next ;
        }while(fast!= head && fast.next!=head);
         
        if( head!= head .next) { 
        head2 = slow;
        pre.next = head; 
        tail.next = head2;
        }
        
        
    }
    
    public void addFirst(T value){ // o(1)
        Node < T >   temp  = new Node < T >  (value);
        if(head ==  null || size == 0 || tail ==  null ){
            head = tail = temp ;
             tail.next = head;
        }
        else {
            
            temp.next = tail.next; //  head 
              head = temp;
             tail.next  =  temp;
             
        }
        size ++  ;
    
    }
    public void addLast(T value){ // o(1)
        Node < T >  temp = new Node < T >(value);
        if(size == 0 ){
            addFirst(value);
        }
        else {
            temp.next = tail.next;
            tail.next = temp;
            tail = temp;
            
            
        }
        size ++ ;
        
 
    }
    public void addByIndex( int index  , T value ) { // o(n)
        if(index   <  0  || index > size  + 1  ){
            try {
            }
            catch( Exception x ) {
                System.out.println("Index out of Bound ");
            }
        }
        else if(index == 0 ){
            addFirst(value);
        }
        else if(index == size + 1){
            addLast(value);
        }
        else {
            Node < T>  temp  = new Node <T> (value);
            Node pre  = head; 
            for(int  i = 0 ; i < index  -  1; i  ++ ){
                pre = pre.next;
                
            }
           temp.next= pre.next ;
           pre.next = temp;
            size ++ ;
            
            
        }
        
        
    }
    public  void InsertInSorted(T val ) { 
        
        
        Node cur  = head; 
        if(size ==  0  || (val.hashCode()  <= cur.value.hashCode()) )
            addFirst(val);
        
        else {
            while(cur.next !=  head && cur.next.value.hashCode() < val.hashCode()){
                cur  = cur.next ; 
             
            }
            Node  < T >  temp =  new Node < T >  (val);
            temp.next = cur.next   ; 
            cur.next =  temp ; 
            
        }
        
        
    }
    
     public T  removeFirst(){ // o(1)
        
        T res ; 
       if(size == 0  ){
           res = null;
       } 
       else { 
           res = (T) head.value;//////////////////////////////
           
           tail.next = tail.next.next;
           head = head.next; // null if size == 1
           size -- ;
           if(size == 0 ){
               tail = null;// head 
           }
          
       }
        
        return  res;
        
    } 
     public T removeLast(){ // o(n)
        T res  ; 
       if(size == 0 ) res = null;
       else if(size == 1){
          return  removeFirst();
           
       }
       else{
           res =(T) tail.value;
           Node cur = head;
           while(cur.next != tail ){
               cur = cur.next;
           }
           cur.next = tail.next;
           tail = cur  ;
           
       
            size -- ;
       }
        
        return res;
        
        
    }
     
    public T removeByIndex(int index ){ // o(n)
       
       T res;
       
       if(index < 0 || index >= size) res = null;
       else if(index == 0)return removeFirst();
       else if(index ==  size - 1) return removeLast();
       else {
           Node cur = head;
           Node pre = head;
           for(int  i = 0  ;   i  < index ; i ++ ){
               pre = cur ; 
               cur = cur.next;
           }
           res = (T )cur.value;
           pre.next  = cur.next;
           cur.next = null;
           size -- ; 
           
           
       }
       return res;
    }
     
       public void Reverse(){
             
         Node temp = head;
        // head = tail;
        // tail = temp;
      Node after = temp.next;
      Node befor  =  null ; 
       
        for(int  i = 0 ; i  < size ;   i ++ ){
            
            after = temp.next ; 
            temp.next= befor ; 
            if(temp ==  head)temp.next = tail;
            befor = temp;
            temp = after;
            
           
        }

        Node cur = head;
        head = befor;
        tail = cur;

    }
        public T  DetectCylce(){
        
        
        Node cur = head ; 
        while(cur != null ){
            
            if(cur.vis == 1)return(T) cur.value ;
            
            cur.vis  = 1;
            cur = cur.next;
            
            
        }
        
        return null;
        
        
    }
      public void Print(Node  h ) { // o(n)
        String st = "";
        Node cur = h;

        if(cur == null )System.out.println("No element");
        else {
        do{
            st += cur.value + " ";
            cur = cur.next;
        }while((cur !=  h));
        System.out.println(st);

    }
      }
    
    
    
    
    
    
    
}
