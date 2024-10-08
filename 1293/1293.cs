public class Solution {
    public int ShortestPathInAGridWithObstacl(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(ShortestPathInAGridWithObstacl(root.left), ShortestPathInAGridWithObstacl(root.right));
    }
}