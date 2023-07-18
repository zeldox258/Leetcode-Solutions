public class Solution {
    public int CountSubstringsThatSatisfyKcon(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(CountSubstringsThatSatisfyKcon(root.left), CountSubstringsThatSatisfyKcon(root.right));
    }
}