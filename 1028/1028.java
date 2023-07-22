
class Solution {
    public TreeNode recoverFromPreorder(String traversal) {
        java.util.Stack<TreeNode> st=new java.util.Stack<>();int i=0,n=traversal.length();
        while(i<n){int depth=0;while(i<n&&traversal.charAt(i)=='-'){depth++;i++;}int val=0;while(i<n&&Character.isDigit(traversal.charAt(i)))val=val*10+traversal.charAt(i++)-'0';
            TreeNode node=new TreeNode(val);while(st.size()>depth)st.pop();if(!st.isEmpty()){if(st.peek().left==null)st.peek().left=node;else st.peek().right=node;}st.push(node);}
        return st.isEmpty()?null:st.get(0);
    }
}
