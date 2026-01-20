class Solution {
    int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        gain(root);return max;
    }
    int gain(TreeNode node){
        if(node==null) return 0;
        int l=Math.max(gain(node.left),0),r=Math.max(gain(node.right),0);
        max=Math.max(max,l+r+node.val);
        return node.val+Math.max(l,r);
    }
}