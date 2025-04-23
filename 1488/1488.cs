public class Solution {
    public int AvoidFloodInTheCity(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(AvoidFloodInTheCity(root.left), AvoidFloodInTheCity(root.right));
    }
}