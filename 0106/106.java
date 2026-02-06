import java.util.*;
class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++) map.put(inorder[i],i);
        return build(inorder,postorder,0,inorder.length-1,0,postorder.length-1,map);
    }
    TreeNode build(int[] in,int[] post,int is,int ie,int ps,int pe,Map<Integer,Integer> map){
        if(ps>pe) return null;
        TreeNode root=new TreeNode(post[pe]);
        int mid=map.get(post[pe]),leftSize=mid-is;
        root.left=build(in,post,is,mid-1,ps,ps+leftSize-1,map);
        root.right=build(in,post,mid+1,ie,ps+leftSize,pe-1,map);
        return root;
    }
}