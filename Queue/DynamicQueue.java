public class DynamicQueue {
    int data[];
    int front;
    int size;
    DynamicQueue(int cap){
        this.data=new int[cap];
        this.front=0;
        this.size=0;

    }
    //we only need to conquer overflow condition
    void enqueue(int val){
        if(size==data.length){
            int newdata[]= new int[2*this.data.length];
            for(int i=0;i<size;i++){
                newdata[i]= data[(front+i)%data.length];
            }
            
            data= newdata;
            front=0;
            data[size]=val;
            size++;
            return ;

        }
        int ind = (front+size)%data.length;
        this.data[ind]=val;
        size++;

    }
}
