public class Solution {
    public int MinimumDistanceToTheTargetElem(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MinimumDistanceToTheTargetElem(root.left), MinimumDistanceToTheTargetElem(root.right));
    }
}