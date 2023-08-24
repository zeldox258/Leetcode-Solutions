public class Solution {
    public int CountFertilePyramidsInALand(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(CountFertilePyramidsInALand(root.left), CountFertilePyramidsInALand(root.right));
    }
}