public class Solution {
    public int DistributeCandiesAmongChildren(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(DistributeCandiesAmongChildren(root.left), DistributeCandiesAmongChildren(root.right));
    }
}