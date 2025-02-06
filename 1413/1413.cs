public class Solution {
    public int MinimumValueToGetPositiveStepB(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MinimumValueToGetPositiveStepB(root.left), MinimumValueToGetPositiveStepB(root.right));
    }
}