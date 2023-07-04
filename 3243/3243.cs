public class Solution {
    public int ShortestDistanceAfterRoadAddit(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(ShortestDistanceAfterRoadAddit(root.left), ShortestDistanceAfterRoadAddit(root.right));
    }
}