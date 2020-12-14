public class MinStack {

    Stack<Integer> ms;
    Stack<Integer> mins;

    public MinStack() {
      ms = new Stack<>();
      mins = new Stack<>();
    }


    int size() {
      // write your code here  
      return ms.size();
      
    }

    void push(int x) {
      // write your code here
      ms.push(x);
        if(mins.size()==0){
            mins.push(x);
            
        }else{
            if(x<=mins.peek()){
                mins.push(x);
            }
                
        }
    }

    int pop() {
      // write your code here
      if(ms.size()==0){
          System.out.println("Stack underflow");
          return -1;
      }
      if(ms.peek()==mins.peek()){
          mins.pop();
      }
       return ms.pop();
    }

    int top() {
      // write your code here
      if(ms.size()==0){
          System.out.println("Stack underflow");
          return -1;
      }
       return ms.peek();
    }

    int min(){
  	  // write your code here
  	  if(mins.size()==0){
  	      System.out.println("Stack underflow");
  	      return -1;
  	  }
  	   return mins.peek();
    }
    
  }