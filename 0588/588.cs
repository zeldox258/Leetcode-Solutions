public class Solution {
    public int DesignInmemoryFileSystem(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(DesignInmemoryFileSystem(root.left), DesignInmemoryFileSystem(root.right));
    }
}