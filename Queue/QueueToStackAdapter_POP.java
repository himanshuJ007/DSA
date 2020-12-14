import java.util.Queue;

//POP EFFICIENT

//1,2,3,4, pop  , pop
//1,2,3,4,4(pop),4(pop)

/* 
push Menthod will be 

if minQ size==0 then push to minQ and return                      =====> minQ ="10"  ; helperQ=""
else minq ko helperQ mai  khali kro then minq mai push kro        =====> minQ="20":helper=10;
then helperQ to minQ mai wapis daal do                            =====> minQ= "20,10" : helperQ=""

Another Iteration
=====> minQ= "20,10" ,helperQ="" (intitially)
push(30);

=====> minQ="30" ,helper=20,10;
=====> minQ="30,20,10" ,helper="";


*/

// pop will become easy as last element is in front of queue
public class QueueToStackAdapter_POP {
    Queue<Integer> minQ;
    Queue<Integer> helperQ;

    QueueToStackAdapter_POP(){
        minQ= new ArrayDeque<>();
        helperQ= new ArrayDeque<>();
    }
     int pop(){
        if(mainQ.size()==0){
            System.out.println("Stack underflow");
            return -1;
        }else{
            int rv=mainQ.remove();
            return rv;
        }
        
     }
     void push(int val){
         if(mainQ.size()==0){
             mainQ.add(val);
         }else{
             while(mainQ.size()>0){
                 helperQ.add(mainQ.remove());
             }
             mainQ.add(val);
             while(helperQ.size()>0){
                mainQ.add(helperQ.remove());
            }
         }

     }
     int top(){
        if(mainQ.size()==0){
            System.out.println("Stack underflow");
            return -1;
        }else{
            int rv=mainQ.peek();
            return rv;
        }
     }
     int size(){
        return mainQ.size();
     }
}
