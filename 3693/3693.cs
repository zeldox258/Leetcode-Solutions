public class Solution {
    public int ClimbingStairsIi(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(ClimbingStairsIi(root.left), ClimbingStairsIi(root.right));
    }
}