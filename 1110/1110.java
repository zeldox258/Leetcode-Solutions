
class Solution {
    Set<Integer> delSet;
    List<Integer> res=new ArrayList<>();
    public List<Integer> delNodes(TreeNode root, int[] to_delete) {
        delSet=new HashSet<>();
        for(int d:to_delete) delSet.add(d);
        dfs(root,true);
        return res;
    }
    TreeNode dfs(TreeNode node, boolean isRoot){
        if(node==null) return null;
        boolean del=delSet.contains(node.val);
        if(isRoot&&!del) res.add(node.val);
        node.left=dfs(node.left,del);
        node.right=dfs(node.right,del);
        return del?null:node;
    }
}
