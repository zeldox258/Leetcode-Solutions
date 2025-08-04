public class Solution {
    public int SplitAStringIntoTheMaxNumberOf(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(SplitAStringIntoTheMaxNumberOf(root.left), SplitAStringIntoTheMaxNumberOf(root.right));
    }
}