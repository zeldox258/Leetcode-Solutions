import java.util.*;
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++) map.put(inorder[i],i);
        return build(preorder,0,preorder.length-1,0,inorder.length-1,map);
    }
    TreeNode build(int[] pre,int ps,int pe,int is,int ie,Map<Integer,Integer> map){
        if(ps>pe) return null;
        TreeNode root=new TreeNode(pre[ps]);
        int mid=map.get(pre[ps]),leftSize=mid-is;
        root.left=build(pre,ps+1,ps+leftSize,is,mid-1,map);
        root.right=build(pre,ps+leftSize+1,pe,mid+1,ie,map);
        return root;
    }
}