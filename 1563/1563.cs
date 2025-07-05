public class Solution {
    public int StoneGameV(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(StoneGameV(root.left), StoneGameV(root.right));
    }
}