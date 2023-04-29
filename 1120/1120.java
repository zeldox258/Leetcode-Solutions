
class Solution {
    double ans=0;
    public double maximumAverageSubtree(TreeNode root) {
        dfs(root); return ans;
    }
    int[] dfs(TreeNode node){
        if(node==null) return new int[]{0,0};
        int[] l=dfs(node.left),r=dfs(node.right);
        int sum=l[0]+r[0]+node.val, cnt=l[1]+r[1]+1;
        ans=Math.max(ans,(double)sum/cnt);
        return new int[]{sum,cnt};
    }
}
