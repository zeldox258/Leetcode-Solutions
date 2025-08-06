class Solution {
    int max=0;
    public int longestConsecutive(TreeNode root) {
        dfs(root,null,0);return max;
    }
    void dfs(TreeNode node,TreeNode parent,int len){
        if(node==null) return;
        len=(parent!=null&&node.val==parent.val+1)?len+1:1;
        max=Math.max(max,len);dfs(node.left,node,len);dfs(node.right,node,len);
    }
}