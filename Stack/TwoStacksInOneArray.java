public class TwoStackInOneArray {

    int data[];
    int tos1;
    int tos2;

    TwoStackInOneArray(int cap) {
        data = new int[cap];
        this.tos1 = -1;
        this.tos2 = data.length;
        

    }

    int size1() {
        // write your code here
        return tos1+1;
    }

    int size2() {
        // write your code here
        return data.length-tos2;
    }

    void push1(int val) {
        // write your code here
        if(tos1+1==tos2){
            System.out.println("Stack overflow");
            return;
        }
        tos1++;
        data[tos1]=val;
    }

    void push2(int val) {
        // write your code here
        if(tos1+1==tos2){
            System.out.println("Stack overflow");
            return;
        }
        tos2--;
        data[tos2]=val;
    }

    int pop1() {
        // write your code here
        if(size1()==0){
            System.out.println("Stack underflow");
            return -1;
        }else{
            int rv=data[tos1];
            tos1--;
            return rv;

        }

    }

    int pop2() {
        // write your code here
        if(size2()==0){
            System.out.println("Stack underflow");
            return -1;
        }else{
            int rv=data[tos2];
            tos2++;
            return rv;

        }
    }

    int top1() {
        // write your code here
        if(size1()==0){
            System.out.println("Stack underflow");
            return -1;
        }
        return data[tos1];
    }

    int top2() {
        // write your code here
        if(size2()==0){
            System.out.println("Stack underflow");
            return -1;
        }
        return data[tos2];
    }

}