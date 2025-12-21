public class Solution {
    public int FindBottomLeftTreeValue(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(FindBottomLeftTreeValue(root.left), FindBottomLeftTreeValue(root.right));
    }
}