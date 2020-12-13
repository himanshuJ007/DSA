import java.util.Queue;

// PUSH EFFICIENT
import java.util.*;
public class QueueToStackAdapter {
    Queue<Integer> mainQ;
    Queue<Integer> helperQ;

    QueueToStackAdapter(){
        mainQ= new Queue<Integer>();
        helperQ= new Queue<Integer>();

    }
    //efficient
    void add(int val){
        mainQ.add(val);

    }

    int remove(){
        if(mainQ.size()==0){
            System.out.println("Stack underflow");
            return -1;
        }
        while(mainQ.size()!=1){
            helperQ.add(mainQ.remove());
        }
        int rv = mainQ.remove();
        Queue<Integer> temp = helperQ;
        helperQ=mainQ;
        mainQ= temp;
        return rv;

    }

    int top(){
        if(mainQ.size()==0){
            System.out.println("Stack underflow");
            return -1;
        }
        while(mainQ.size()!=1){
            helperQ.add(mainQ.remove());
        }
        int rv = mainQ.remove();
        helperQ.add(rv);
        Queue<Integer> temp = helperQ;
        helperQ=mainQ;
        mainQ= temp;
        return rv;

    }
    int size(){
        return mainQ.size();
    }

}
