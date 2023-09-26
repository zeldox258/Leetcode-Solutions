
class Solution {
    public boolean isCompleteTree(TreeNode root) {
        java.util.Queue<TreeNode> q=new java.util.LinkedList<>(); q.offer(root); boolean end=false;
        while(!q.isEmpty()){ TreeNode n=q.poll(); if(n==null) end=true; else{if(end)return false;q.offer(n.left);q.offer(n.right);} }
        return true;
    }
}
