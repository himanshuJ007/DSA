import java.io.*;
import java.util.*;

public class Main {
    
    private static class Node {
        int data;
        ArrayList < Node > children= new ArrayList<>();
    }

    public static void display(Node root) {
        System.out.print(root.data + " -> ");
        for (Node ch: root.children) {
            System.out.print(ch.data + " , ");
        }
        System.out.println(".");
        for (Node ch: root.children) {
            display(ch);
        }

    }
    
    public static void main(String[] args) {
        Node root= new Node();
        Stack < Node > st = new Stack < > ();
        int arr[] = {
            10,
            20,
            -1,
            30,
            50,
            -1,
            60,
            -1,
            -1,
            40,
            -1,
            -1
        };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                st.pop();
            } else {
                Node nn= new Node() ;
                nn.data= arr[i];
                if (st.size() == 0) {
                    root = nn;
                } else {
                    st.peek().children.add(nn);
                }
                st.push(nn);
            }
        }
        display(root);
    }

}