public class Solution {
    public int MinimumChangesToMakeAlternatin(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MinimumChangesToMakeAlternatin(root.left), MinimumChangesToMakeAlternatin(root.right));
    }
}