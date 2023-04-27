
class Solution {
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        return dfs(root).getKey();
    }
    Pair<TreeNode,Integer> dfs(TreeNode node){
        if(node==null) return new Pair<>(null,0);
        Pair<TreeNode,Integer> l=dfs(node.left),r=dfs(node.right);
        int ld=l.getValue(),rd=r.getValue();
        if(ld==rd) return new Pair<>(node,ld+1);
        return ld>rd?new Pair<>(l.getKey(),ld+1):new Pair<>(r.getKey(),rd+1);
    }
}
