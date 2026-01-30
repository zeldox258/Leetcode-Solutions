import java.util.*;
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res=new ArrayList<>();
        dfs(root,targetSum,new ArrayList<>(),res);
        return res;
    }
    void dfs(TreeNode node,int rem,List<Integer> path,List<List<Integer>> res){
        if(node==null) return;
        path.add(node.val);
        if(node.left==null&&node.right==null&&rem==node.val) res.add(new ArrayList<>(path));
        dfs(node.left,rem-node.val,path,res);dfs(node.right,rem-node.val,path,res);
        path.remove(path.size()-1);
    }
}