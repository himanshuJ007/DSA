import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    // code
    // finding rge
    Stack<Integer> st =new Stack<>();
    int rge[]= new int[a.length];
    for(int i=a.length()-1;i>=0;i--){
        if(st.size()==0){
            rge[i]=-1;
            st.push(a[i]);
        }else{
            while(a[i]>st.peek()){
                st.pop();
            }
        }
    }
    
    int ans[]= new int[a.length-k];
    for(int i=0;i<a.length-k;i++){
        
        for(int jump= i;jump<=i+k;){
            int idx= rge[jump];
            if(idx==-1){
                ans[i]=a[jump];
                break;
            }else if(rge[jump]>i+k){
                ans[i]=a[jump];
                jump=i+k;
            }else{
                jump=rge[jump];
            }
        }
    }
    for(int i=0;i<ans.length;i++){
        System.out.println(ans[i]);
    }
    
 }
}