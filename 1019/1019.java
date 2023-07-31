
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        java.util.List<Integer> vals=new java.util.ArrayList<>(); while(head!=null){vals.add(head.val);head=head.next;}
        int n=vals.size();int[]res=new int[n];java.util.Stack<Integer> st=new java.util.Stack<>();
        for(int i=0;i<n;i++){while(!st.isEmpty()&&vals.get(st.peek())<vals.get(i))res[st.pop()]=vals.get(i);st.push(i);} return res;
    }
}
