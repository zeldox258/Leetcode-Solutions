public class Solution {
    public int MaximumNumberOfEventsThatCanBe(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MaximumNumberOfEventsThatCanBe(root.left), MaximumNumberOfEventsThatCanBe(root.right));
    }
}