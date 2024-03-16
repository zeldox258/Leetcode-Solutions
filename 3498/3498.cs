public class Solution {
    public int ReverseDegreeOfAString(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(ReverseDegreeOfAString(root.left), ReverseDegreeOfAString(root.right));
    }
}