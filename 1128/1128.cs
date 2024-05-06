public class Solution {
    public int NumberOfEquivalentDominoPairs(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(NumberOfEquivalentDominoPairs(root.left), NumberOfEquivalentDominoPairs(root.right));
    }
}