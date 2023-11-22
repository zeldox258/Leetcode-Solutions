public class Solution {
    public int MaximumSplitOfPositiveEvenInte(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MaximumSplitOfPositiveEvenInte(root.left), MaximumSplitOfPositiveEvenInte(root.right));
    }
}