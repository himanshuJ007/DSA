// add efficient
public class StackToQueueAdapter {
    Stack<Integer> mainS;
    Stack<Integer> helperS;

    StackToQueueAdapter() {
        mainS = new Stack<>();
        helperS = new Stack<>();
    }

    int size() {
        return mainS.size();
    }

    void add(int val) {
        mainS.push(val);
    }

    int remove() {
        if(mainS.size()==0){
            System.out.println("Queue underflow");
            return -1;
        }else{
            while(mainS.size)()>0){
                helperS.push(mainS.pop());
            }
            int rv=helperS.pop();
            while(helperS.size()>0){
                mainS.push(helperS.pop());
            }
            return rv;
        }
    }

    int peek() {
        if(mainS.size()==0){
            System.out.println("Queue underflow");
            return -1;
        }else{
            while(mainS.size()>0){
                helperS.push(mainS.pop());
            }
            int rv=helperS.peek();
            while(helperS.size()>0){
                mainS.push(helperS.pop());
            }
            return rv;
        }
        
    }
}
