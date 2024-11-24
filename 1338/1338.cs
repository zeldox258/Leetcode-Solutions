public class Solution {
    public int ReduceArraySizeToTheHalf(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(ReduceArraySizeToTheHalf(root.left), ReduceArraySizeToTheHalf(root.right));
    }
}