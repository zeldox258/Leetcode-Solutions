
class Solution {
    public int clumsy(int n) {
        if(n==1)return 1;if(n==2)return 2;if(n==3)return 6;if(n==4)return 7;
        java.util.Stack<Integer> st=new java.util.Stack<>(); st.push(n*(n-1)/(n-2)); int op=3,i=n-3;
        while(i>=1){if(op==0){st.push(i);op=1;}else if(op==1){st.push(st.pop()*i);op=2;}else if(op==2){st.push(st.pop()/i);op=3;}else{st.push(-i);op=0;}i--;}
        int r=0;for(int v:st)r+=v;return r;
    }
}
