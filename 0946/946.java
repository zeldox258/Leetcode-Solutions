
class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        java.util.Stack<Integer> st=new java.util.Stack<>(); int j=0;
        for(int v:pushed){ st.push(v); while(!st.isEmpty()&&st.peek()==popped[j]){st.pop();j++;} }
        return st.isEmpty();
    }
}
