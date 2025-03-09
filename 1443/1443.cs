public class Solution {
    public int MinimumTimeToCollectAllApplesI(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MinimumTimeToCollectAllApplesI(root.left), MinimumTimeToCollectAllApplesI(root.right));
    }
}