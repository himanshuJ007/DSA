public static int max(Node node) {
        int maxx= node.data;
        for(Node ch : node.children){
            int temp=max(ch);
            if(maxx<temp){
                maxx=temp;
            }
        }
        return maxx;
    }

public static int size(Node node) {
        int s = 1;
        for (Node ch: node.children) {
            s += size(ch);
        }
        return s ;
    }

public static int height(Node node) {
        // write your code here
        int h= -1;
        for(Node nn : node.children){
            int temp =height(nn);
            h=Math.max(h,temp);
            
        }
        return h+1;
    }

    public static void traversals(Node node) {
        // write your code here
        System.out.println("Node Pre "+node.data);
        for(Node nn : node.children){
            System.out.println("Edge Pre "+node.data+"--"+nn.data);
            traversals(nn);
            System.out.println("Edge Post "+node.data+"--"+nn.data);
        }
        System.out.println("Node Post "+node.data);
    }

    public static boolean find(Node node, int data) {
        // write your code here
        if (node.data == data) {
            return true;
        }
        for (Node nn: node.children) {
            if (find(nn, data)) {
                return true;
            }
        }
        return false;
    }

    public static void removeLeaves(Node node) {
        for(int i=node.children.size()-1;i>=0;i--){
            if(node.children.get(i).children.size()==0){
                node.children.remove(i);
            }
        }
        for(Node nn : node.children){
            removeLeaves(nn);
        }
        
    }

    public static void levelOrder(Node node) {
        // write your code here
        Queue<Node> q = new LinkedList<>();
        
         q.add(node);
         
        while(q.size()>0){
            Node temp=q.remove();
            System.out.print(temp.data+" ");
            
            for(Node nn:temp.children){
                q.add(nn);
            }
        }
        System.out.print(".");
        
        }