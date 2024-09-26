public class Solution {
    public int DivideNodesIntoTheMaximumNumbe(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(DivideNodesIntoTheMaximumNumbe(root.left), DivideNodesIntoTheMaximumNumbe(root.right));
    }
}