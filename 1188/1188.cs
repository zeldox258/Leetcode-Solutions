public class Solution {
    public int DesignBoundedBlockingQueue(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(DesignBoundedBlockingQueue(root.left), DesignBoundedBlockingQueue(root.right));
    }
}