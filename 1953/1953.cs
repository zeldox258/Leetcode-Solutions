public class Solution {
    public int MaximumNumberOfWeeksForWhichYo(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MaximumNumberOfWeeksForWhichYo(root.left), MaximumNumberOfWeeksForWhichYo(root.right));
    }
}