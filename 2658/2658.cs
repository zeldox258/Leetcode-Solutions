public class Solution {
    public int MaximumNumberOfFishInAGrid(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MaximumNumberOfFishInAGrid(root.left), MaximumNumberOfFishInAGrid(root.right));
    }
}