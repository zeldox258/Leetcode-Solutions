public class Solution {
    public int DesignTaskManager(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(DesignTaskManager(root.left), DesignTaskManager(root.right));
    }
}