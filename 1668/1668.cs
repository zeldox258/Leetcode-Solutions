public class Solution {
    public int MaximumRepeatingSubstring(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MaximumRepeatingSubstring(root.left), MaximumRepeatingSubstring(root.right));
    }
}