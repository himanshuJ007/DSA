    public static class LLToQueueAdapter {
        LinkedList < Integer > list;

        public LLToQueueAdapter() {
            list = new LinkedList < > ();
        }

        int size() {
            // write your code here
            return list.size();
        }

        void add(int val) {
            // write your code here
            list.addLast(val);
            
        }

        int remove() {
            // write your code here
            // 1-2-3-4-5
            if(list.size()==0){
                System.out.println("Queue underflow");
                return -1;
            }
            int val = list.getFirst();
            list.removeFirst();
            return val;
        }

        int peek() {
            // write your code here
            if(list.size()==0){
                System.out.println("Queue underflow");
                return -1;
            }
            int val = list.getFirst();
            // list.removeFirst();
            return val;
        }
    }