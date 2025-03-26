public class Solution {
    public int ShortestWordDistance(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(ShortestWordDistance(root.left), ShortestWordDistance(root.right));
    }
}