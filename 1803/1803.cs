public class Solution {
    public int CountPairsWithXorInARange(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(CountPairsWithXorInARange(root.left), CountPairsWithXorInARange(root.right));
    }
}