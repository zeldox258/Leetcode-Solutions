import java.util.*;
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res=new ArrayList<>();
        if(root!=null) dfs(root,"",res);
        return res;
    }
    void dfs(TreeNode node,String path,List<String> res){
        if(node.left==null&&node.right==null){res.add(path+node.val);return;}
        if(node.left!=null) dfs(node.left,path+node.val+"->",res);
        if(node.right!=null) dfs(node.right,path+node.val+"->",res);
    }
}