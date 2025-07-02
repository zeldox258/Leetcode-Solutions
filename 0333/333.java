
class Solution {
    public int largestBSTSubtree(TreeNode root) {
        return dfs(root)[2];
    }
    int[] dfs(TreeNode node) {
        if (node==null) return new int[]{Integer.MAX_VALUE,Integer.MIN_VALUE,0};
        int[] l=dfs(node.left), r=dfs(node.right);
        if (node.val>l[1]&&node.val<r[0]) {
            int size=l[2]+r[2]+1;
            return new int[]{Math.min(l[0],node.val),Math.max(r[1],node.val),size};
        }
        return new int[]{Integer.MIN_VALUE,Integer.MAX_VALUE,Math.max(l[2],r[2])};
    }
}
