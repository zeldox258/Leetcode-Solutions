public class Solution {
    public int CountElementsWithStrictlySmall(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(CountElementsWithStrictlySmall(root.left), CountElementsWithStrictlySmall(root.right));
    }
}