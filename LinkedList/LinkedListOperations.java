public class LL {
    public class Node {
        int data;
        Node next;

        Node() {
            this.data = 0;
            this.next = null;
        }
    }
    Node head;
    Node tail;
    int size;
    LL() {
        this.head = null;
        this.tail = null;
    }
    public int size(){
        return size;
    }
    public void display(){
        Node nn= head;
        while(nn!=null){
            System.out.print(nn.data+" ");
            nn=nn.next;
        }
        System.out.println();

        
      }

    //================================                ADDITION 
    public void AddLast(int val){
        Node nn = new Node();
        nn.data= val;

        if(size==0){
            head=tail= nn;
        }else{
            tail.next=nn;
            tail=nn;
        }
    }
    public void addFirst(int val) {
        
        Node nn = new Node();
        nn.data= val;
        if(size==0){
            head=tail= nn;   
        }else{
            nn.next= head;
            head= nn;
        }
        size++; // size increase krna mt bhulna
      }
    public void addAt(int idx, int val){
    // idx>=0 && idx<=size size bhi include hoga coz last m add ho skta h
    if(idx>=0 && idx<=size){
        if(idx==0){
            addFirst(val);
        }else if(idx==size){
            AddLast(val);
        }else{
            Node prev =head;
            for(int i=1;i<idx;i++){
                prev= prev.next;
            }
            Node nn= new Node ();
            nn.data= val;
            nn.next= prev.next;
            prev.next= nn;
            size++;

        }
    }else{
        System.out.println("Invalid arguments");   
    }
    }
    //================================                GET DATA 
      public int getFirst(){
        if(size==0){
            System.out.println("List is empty");
            return -1;
        }else{
            return head.data;
        }
      }
      public int getLast(){
        if(size==0){
            System.out.println("List is empty");
            return -1;
        }else{
            return tail.data;
        }
      }
      public int getAt(int idx){
        if(idx>=0&&idx<size){
            if(size==0){
                System.out.println("List is empty");
                return -1;
            }else{
                Node nn= head;
                for(int i=0;i<idx;i++){
                    nn=nn.next;
                }
                return nn.data;
            }
        }else{
            System.out.println("Invalid arguments");
            return -1;
        } 
      }
    //================================                REMOVE ELEMENTS
      public void removeFirst(){
        if(size==0){
            System.out.println("List is empty");
            return;
        }else{
            Node nn = head;
            head= head.next;
            nn.next= null;
            size--;
        }
      } 
      public void removeLast(){
        if(size==0){
            System.out.println("List is  empty");
            return ;
        }else if(size==1){
            head= tail = null;
            size--;
        }else{
            Node nn=head;
            while(nn.next.next!=null){
                nn=nn.next;
            } 
            tail=nn;
            tail.next=null;
            size--;
        }
      }
      public void removeAt(int idx) {
        if(idx>=0&&idx<size){
            if(size()==0){
                System.out.println("List is empty");
            }else if(idx==0){
                removeFirst();
            }else if(idx==size-1){
                removeLast();
            }else{
                Node prev= head;
                for(int jump=1;jump<idx;jump++){
                    prev= prev.next;
                }
                Node temp= prev.next;
                prev.next= prev.next.next;
                temp.next= null;
                size--;
            }
        }else{
            System.out.println("Invalid arguments");
        }
      }
    // Reverse Data Iterative 

        public void rhelper(int i ,Node node ){
        if(i>=size){
            return;
        }
        rhelper(i+1,node.next);
        if(i>=size/2){
            
            int temp = right.data;
            right.data=node.data;
            node.data= temp;

            right=right.next;

        }

    } 
    
    public static Node right; 
    public void reverseDI() {
          right =head;
          rhelper(0,right);
            // write your code here

    }

    public void rphelper(int i,Node node){
        if(i==size-1){
            return;
        }
        rphelper(i+1,node.next);

        node.next.next= node ;

    }

    public void reversePI() {

            // write your code here
            rphelper(0,head);
            //head=null;  
            //itna hi kr ke chode dia 
            //tha head and tail ko swap bhi krna hota h end mai

            Node temp=tail;
            head.next=null;
            tail=head;
            head=temp;
    }

    
        public int mid() {
            // write your code 
            Node temp= head;
            int i=0;
            if(size%2==0){
                while(i!=(size/2)-1){
                    temp=temp.next;
                    i++;
                }
                return temp.data;
            }else{
                while(i!=(size/2)){
                    temp=temp.next;
                    i++;
                }
                return temp.data;

            }
        }
    }

}