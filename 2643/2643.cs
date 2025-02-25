public class Solution {
    public int RowWithMaximumOnes(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(RowWithMaximumOnes(root.left), RowWithMaximumOnes(root.right));
    }
}