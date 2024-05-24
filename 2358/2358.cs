public class Solution {
    public int MaximumNumberOfGroupsEnteringA(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MaximumNumberOfGroupsEnteringA(root.left), MaximumNumberOfGroupsEnteringA(root.right));
    }
}