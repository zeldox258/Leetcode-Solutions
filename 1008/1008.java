
class Solution {
    public TreeNode bstFromPreorder(int[] preorder){return build(preorder,0,preorder.length-1);}
    TreeNode build(int[]pre,int l,int r){if(l>r)return null;TreeNode root=new TreeNode(pre[l]);int mid=l+1;while(mid<=r&&pre[mid]<pre[l])mid++;root.left=build(pre,l+1,mid-1);root.right=build(pre,mid,r);return root;}
}
