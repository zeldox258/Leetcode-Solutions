
class Solution {
    public int sumEvenGrandparent(TreeNode root) {
        return dfs(root,1,1);
    }
    int dfs(TreeNode node,int parent,int grandparent){
        if(node==null) return 0;
        int res=grandparent%2==0?node.val:0;
        return res+dfs(node.left,node.val,parent)+dfs(node.right,node.val,parent);
    }
}
