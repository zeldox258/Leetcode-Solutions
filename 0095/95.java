import java.util.*;
class Solution {
    public List<TreeNode> generateTrees(int n) {
        if(n==0) return new ArrayList<>();
        return gen(1,n);
    }
    List<TreeNode> gen(int lo,int hi){
        List<TreeNode> res=new ArrayList<>();
        if(lo>hi){res.add(null);return res;}
        for(int i=lo;i<=hi;i++){
            for(TreeNode l:gen(lo,i-1)) for(TreeNode r:gen(i+1,hi)){TreeNode root=new TreeNode(i);root.left=l;root.right=r;res.add(root);}
        }
        return res;
    }
}