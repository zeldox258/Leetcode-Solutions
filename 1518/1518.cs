public class Solution {
    public int WaterBottles(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(WaterBottles(root.left), WaterBottles(root.right));
    }
}