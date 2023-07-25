public class Solution {
    public int FindTheMinimumAndMaximumNumber(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(FindTheMinimumAndMaximumNumber(root.left), FindTheMinimumAndMaximumNumber(root.right));
    }
}