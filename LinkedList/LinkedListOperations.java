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

    public int size(){
        // write code here
        return size;
      }
  
      public void display(){
        // write code here
        Node nn= head;
        while(nn!=null){
            System.out.print(nn.data+" ");
            nn=nn.next;
        }
        System.out.println();

        
      }

      public void removeFirst(){
        // write your code here

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

      public int getFirst(){
        // write your code here
        if(size==0){
            System.out.println("List is empty");
            return -1;
        }else{
            return head.data;
        }
        

      }
  
      public int getLast(){
        // write your code here
        if(size==0){
            System.out.println("List is empty");
            return -1;
        }else{
            return tail.data;
        }

      }
  // 1->2->3->4
      public int getAt(int idx){
        // write your code here
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

      public void addFirst(int val) {
        // write your code here
        
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
        // write your code here

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
      public void removeLast(){
        // write your code here
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
        // write your code here
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
    }

}