public class Solution {
    public int MaximizeTheNumberOfPartitionsA(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MaximizeTheNumberOfPartitionsA(root.left), MaximizeTheNumberOfPartitionsA(root.right));
    }
}