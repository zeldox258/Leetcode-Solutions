public class Solution {
    public int FindTheNumberOfCopyArrays(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(FindTheNumberOfCopyArrays(root.left), FindTheNumberOfCopyArrays(root.right));
    }
}